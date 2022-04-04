package com.anshinbackend.service.impl;

import java.io.UnsupportedEncodingException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.internal.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    
    private static final long EXPIRE_TOKEN_AFTER_MINUTES = 30;

	
	@Override
	public String forgotPassword(String email) {

		Optional<Acount> accountOptiontal = Optional
				.ofNullable(acountDAO.findByEmail(email));

		if (!accountOptiontal.isPresent()) {
			return "Invalid email ";
		}

		Acount acc = accountOptiontal.get();
		acc.setToken(generateToken());
		acc.setTokenCreationDate(LocalDateTime.now());

		acc = acountDAO.save(acc);

		return acc.getToken();
	}

	@Override
	public String resetPassword(String token, String password) {

		Optional<Acount> accountOptiontal = Optional
				.ofNullable(acountDAO.findByToken(token));

		if (!accountOptiontal.isPresent()) {
			return "Invalid token.";
		}

		LocalDateTime tokenCreationDate = accountOptiontal.get().getTokenCreationDate();

		if (isTokenExpired(tokenCreationDate)) {
			return "Token expired.";

		}

		Acount acc = accountOptiontal.get();

		acc.setPassword(password);
		acc.setToken(null);
		acc.setTokenCreationDate(null);

		acountDAO.save(acc);

		return "Your password successfully updated.";
	}
	@Override
	public String generateToken() {
		StringBuilder token = new StringBuilder();

		return token.append(UUID.randomUUID().toString())
				.append(UUID.randomUUID().toString()).toString();
	}

	 
	@Override
	public boolean isTokenExpired(final LocalDateTime tokenCreationDate) {

		LocalDateTime now = LocalDateTime.now();
		Duration diff = Duration.between(tokenCreationDate, now);

		return diff.toMinutes() >= EXPIRE_TOKEN_AFTER_MINUTES;
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
    public void register(Acount acount, String siteURL)throws UnsupportedEncodingException, MessagingException {
//        BCryptPasswordEncoder passwordEncoderX = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoderX.encode(acount.getPassword());
//        acount.setPassword(encodedPassword);

        String randomCode = RandomString.make(64);
        acount.setVerificationCode(randomCode);
        acount.setIsActive(false);

        acountDAO.save(acount);

        sendVerification(acount, siteURL);

    }
    @Override
    public void sendVerification(Acount acount, String siteURL)throws MessagingException, UnsupportedEncodingException {
        String toAddress = "duydvph09704@fpt.edu.vn";
        String fromAddress = "Your email address";
        String senderName = "Your company name";
        String subject = "Please verify your registration";
        String content = "Dear [[name]],<br>"
                + "Please click the link below to verify your registration:<br>"
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
