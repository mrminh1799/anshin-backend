package com.anshinbackend.service.impl;

import java.io.UnsupportedEncodingException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.anshinbackend.dto.RegisterDTO.RegisterResquestDTO;
import com.anshinbackend.sercutity.UserDTO;
import com.anshinbackend.service.EmailService;
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
    private EmailService emailService;





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
        e.setPassword(passwordEncoder.encode(e.getPassword()));
        Integer id = acountDAO.save(e).getId();
        e.setId(id);
        e.setIsActive(true);
        e.setIsDeleted(false);
        return e;
    }


    @Override
    public UserDTO updateAcount(Acount e) {
        Acount acount1 = acountDAO.findById(e.id).get();
        acount1.setFullName(e.getFullName());
        acount1.setPhoto(e.getPhoto());
        acount1.setPhoneNumber(e.getPhoneNumber());
        acount1.setEmail(e.getEmail());



        Acount acount= acountDAO.save(acount1);


        Integer id = acount.getId();
        String phoneNumber = acount.getPhoneNumber();
        String fullName = acount.getFullName();
        String email = acount.getEmail();
        String photo = acount.getPhoto();

        List<String> roles =  new ArrayList<>();
        acount.getRoleAcounts().stream().forEach(x->roles.add(x.getRole().getRoleName()));

        Boolean isActive = acount.getIsActive();

        UserDTO userLoginDTO = new UserDTO();
        userLoginDTO.setId(id);
        userLoginDTO.setFullname(fullName);
        userLoginDTO.setAccessToken(null);
        userLoginDTO.setUsername(phoneNumber);
        userLoginDTO.setEmail(email);
        userLoginDTO.setPhoto(photo);
        userLoginDTO.setRoles(roles);
        userLoginDTO.setIsActive(isActive);

        return userLoginDTO;

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
    public String validRegister(RegisterResquestDTO dto) {
        Boolean phoneNumberExist = acountDAO.existsAcountByPhoneNumber(dto.getPhoneNumber());
        Boolean emailExist = acountDAO.existsAcountByEmail(dto.getEmail());
        if(phoneNumberExist && emailExist){
            return "3";
        }
        if(phoneNumberExist){
            return  "1";
        }

        if(emailExist){
            return  "2";
        }


        return "";

    }

    @Override
    public String RegesterSendMail(String mailTo) {
        String s = System.currentTimeMillis()+UUID.randomUUID().toString();
        String code = Integer.toHexString(s.hashCode());
        emailService.sendSimpleMessage(mailTo, "Đăng ký tài khoản", "Chào mừng bạn đến với cửa hàng Anshin, \n Xin mời nhập mã "+ code.substring(0,4)+ " để xác thực tài khản.");
        return code.substring(0,4);


    }

    @Override
    public void Register(RegisterResquestDTO dto) {
        Acount acount  = new Acount();
        acount.setIsDeleted(false);
        acount.setIsActive(true);
        acount.setFullName(dto.getFullName());
        acount.setEmail(dto.getEmail());
        acount.setPhoneNumber(dto.getPhoneNumber());
        acount.setPhoto("");
        acount.setPassword(passwordEncoder.encode(dto.getPassword()));
        acountDAO.save(acount);

    }



    @Override
    public String FGPasswordSendMail(String mailTo) {
        String s = System.currentTimeMillis()+UUID.randomUUID().toString();
        String code = Integer.toHexString(s.hashCode());
        emailService.sendSimpleMessage(mailTo, "Quên mật khẩu", "Bạn vừa thực hiên thao tác quên mất khẩu, \n Xin mời nhập mã "+ code.substring(0,4)+ " để xác thực.");
        return code.substring(0,4);
    }


}
