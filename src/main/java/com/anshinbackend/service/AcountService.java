package com.anshinbackend.service;

import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.dto.Admin.PageAcount.PageDTO;
import com.anshinbackend.dto.PageInfo;
import com.anshinbackend.entity.Acount;
import org.springframework.data.domain.Page;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.security.auth.login.AccountNotFoundException;

public interface AcountService {
    public List<AcountDTO> findAllAcount();
    public Acount findByPhoneNumber(String phoneNumber);
    public Acount findById(Integer id);
    public Acount insertAcount(Acount e);
    public Acount UpdateAcount(Acount e);
    public Integer delete(Integer id);
    public Acount updateAcount(Acount acount);

    public Optional<Acount> findBy(Integer id);
    public PageDTO findBySample(PageInfo page, Acount a);

    public  Acount findByEmail(String email);


    List<Acount> findByRole();

    List<Acount> findByFullNamePhoneAndRole(String fullName, String phoneNumber, String role,boolean isActive);

    void register(Acount acount, String siteURL,String request)throws UnsupportedEncodingException, MessagingException;

    void forgotPassword(String email, String siteURL, String request)throws UnsupportedEncodingException, MessagingException;

    void sendVerification(Acount acount, String siteURL, String request)throws MessagingException, UnsupportedEncodingException;

    void sendVerificationForgotPassword(Acount acount, String siteURL, String request)throws MessagingException, UnsupportedEncodingException;

    boolean verify(String verificationCode);
}
