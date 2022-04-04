package com.anshinbackend.service.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.internal.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.dto.PageInfo;
import com.anshinbackend.dto.Admin.PageAcount.PageDTO;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.service.AcountService;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Service
public class AcountServiceImpl implements AcountService {
    @Autowired
    private AcountDAO acountDAO;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JavaMailSender mailSender;

    @Override
    public List<AcountDTO> findAllAcount() {
        List<AcountDTO> listAcountDTO = new ArrayList<>();
        acountDAO.findByIsDeletedIsFalse().forEach(e -> {
            AcountDTO dto = new AcountDTO();
            dto.setId(e.getId());
            dto.setPhoneNumber(e.getPhoneNumber());
            dto.setEmail(e.getEmail());
            dto.setPassword(e.getPassword());
            dto.setFullName(e.getFullName());
            List<String> roles = new ArrayList<>();
            e.getRoleAcounts().forEach(x->{
                roles.add(x.getRole().getRoleName());
            });
            dto.setIsActive(e.getIsActive());
            dto.setRoles(roles);
            listAcountDTO.add(dto);
        });
        return listAcountDTO;
    }

    @Override
    public Acount findByPhoneNumber(String phoneNumber) {
        return acountDAO.findAcountByPhoneNumber(phoneNumber);
    }

    @Override
    public Acount findById(Integer id) {
        return acountDAO.findById(id).get();
    }

    @Override
    public Acount insertAcount(Acount e) {
        Integer id = acountDAO.save(e).getId();
        e.setId(id);
        e.setIsActive(true);
        e.setIsDeleted(false);
        return e;
    }


    @Override
    public Acount updateAcount(Acount e) {
        Acount acount = acountDAO.findById(e.getId()).get();
        acount.setId(e.getId());
        acount.setFullName(e.getFullName());
        acount.setPhoto(e.getPhoto());
        acount.setPhoneNumber(e.getPhoneNumber());
        return acountDAO.save(acount);
    }
    public Acount UpdateAcount(Acount e) {
        return  acountDAO.save(e);

    }

    @Override
    public Integer delete(Integer id) {
        acountDAO.deleteAcount(id);
        return 1;
    }

    @Override
    public Optional<Acount> findBy(Integer id) {
        return Optional.of(acountDAO.findBy(id).get());
    }

    @Override
    public PageDTO findBySample(PageInfo page, Acount a) {
        Pageable pageable = PageRequest.of(page.getIndex(), page.getSize());
        PageDTO pagedto = new PageDTO();
        com.anshinbackend.dto.Admin.PageAcount.AcountDTO dto = new com.anshinbackend.dto.Admin.PageAcount.AcountDTO();
        List<com.anshinbackend.dto.Admin.PageAcount.AcountDTO> contents = new ArrayList<>();
        Page <Acount> queryPage =acountDAO.findAll(Example.of(a), pageable);
        queryPage.getContent().forEach(x->{
           // System.out.println(x.getRoleAcounts().get(0).getRole().getRoleName());
            dto.setId(x.getId());
            dto.setPhoto(x.getPhoto());
            dto.setEmail(x.getEmail());
            dto.setPhoneNumber(x.getPhoneNumber());
            List<String> listRoles = new ArrayList<>();
            x.getRoleAcounts().forEach(y->{
                listRoles.add(y.getRole().getRoleName());
            });
            dto.setRoles(listRoles);
            dto.setFullName(x.getFullName());
            dto.setIsActive(x.getIsActive());
            contents.add(dto);
        });

        pagedto.setContent(contents);
        pagedto.setCurrentPage(queryPage.getNumber());
        pagedto.setTotalPage(queryPage.getTotalPages());
        pagedto.setNumRec(queryPage.getSize());
        pagedto.setTotalPage(queryPage.getTotalPages());
        pagedto.setTotalRecord(queryPage.getTotalElements());



        return pagedto;

    }

    @Override
    public Acount findByEmail(String email) {
        return acountDAO.findByEmail(email);
    }


    @Override
    public List<Acount> findByRole(){
        return acountDAO.findByRole();
    }

    @Override
    public List<Acount> findByFullNamePhoneAndRole(String fullName, String phoneNumber, String role,boolean isActive){
        return acountDAO.findByFullNamePhoneNumberRole(fullName,phoneNumber,role,isActive);
    }

    @Override
    public void register(Acount acount, String siteURL,String request)throws UnsupportedEncodingException, MessagingException {
        String encodedPassword = passwordEncoder.encode(acount.getPassword());
        acount.setPassword(encodedPassword);

        String randomCode = RandomString.make(64);
        acount.setVerificationCode(randomCode);
        acount.setIsActive(false);

        acountDAO.save(acount);

        sendVerification(acount, siteURL,request);

    }
    @Override
    public void forgotPassword(String email, String siteURL, String request)throws UnsupportedEncodingException, MessagingException {

        Acount acc= acountDAO.findByEmail(email);
        sendVerificationForgotPassword(acc, siteURL,request);

    }
    @Override
    public void sendVerification(Acount acount, String siteURL,String request)throws MessagingException, UnsupportedEncodingException {

        String toAddress = ""+acount.getEmail();
        String fromAddress = "anshinstore1@gmail.com";
        String senderName = "Anshin Store";
        String subject = "Please verify your "+request;
        String content = "Dear [[name]],<br>"
                + "Please click the link below to verify your "+request+":<br>"
                + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
                + "Thank you,<br>"
                + "Anshin Store";

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom(fromAddress, senderName);
        helper.setTo(toAddress);
        helper.setSubject(subject);

        content = content.replace("[[name]]", acount.getFullName());
        String verifyURL = siteURL + "/verify?code=" + acount.getVerificationCode();

        content = content.replace("[[URL]]", verifyURL);

        helper.setText(content, true);

        mailSender.send(message);
    }
    @Override
    public void sendVerificationForgotPassword(Acount acount, String siteURL,String request)throws MessagingException, UnsupportedEncodingException {

        String toAddress = ""+acount.getEmail();
        String fromAddress = "anshinstore1@gmail.com";
        String senderName = "Anshin Store";
        String subject = "Please verify your "+request;
        String content = "Dear [[name]],<br>"
                + "Please click the link below to verify your "+request+":<br>"
                + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
                + "Thank you,<br>"
                + "Anshin Store";

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom(fromAddress, senderName);
        helper.setTo(toAddress);
        helper.setSubject(subject);

        content = content.replace("[[name]]", acount.getFullName());
        String verifyURL = siteURL + "/changePassword/password=?&id="+acount.id;

        content = content.replace("[[URL]]", verifyURL);

        helper.setText(content, true);

        mailSender.send(message);
    }
    void sendRequest(String request) throws IOException {

        URL url = new URL(request);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setInstanceFollowRedirects(false);
        connection.setRequestMethod("Post");
        connection.setRequestProperty("Content-Type", "text/plain");
        connection.setRequestProperty("charset", "utf-8");
        connection.connect();
    }
    @Override
    public boolean verify(String verificationCode) {
        Acount acc = acountDAO.findByVerificationCode(verificationCode);

        if (acc == null || acc.getIsActive()) {
            return false;
        } else {
            acc.setVerificationCode(null);
            acc.setIsActive(true);
            acountDAO.save(acc);

            return true;
        }

    }



}
