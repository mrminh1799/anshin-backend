package com.anshinbackend.controller;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.entity.Acount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.anshinbackend.service.AcountService;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Optional;

@RestController

public class AccountController {
	@Autowired
	private AcountService accountService;
	@Autowired
	private AcountDAO acountDAO;
	@Autowired
	PasswordEncoder passwordEncoder;

	@PostMapping("/processRegister")
	public ResponseEntity<Acount>  processRegister(@RequestBody Acount acount, HttpServletRequest request)
			throws UnsupportedEncodingException, MessagingException {
		String detail="registation";
		accountService.register(acount, getSiteURL(request),detail);
		return ResponseEntity.ok().body(acount) ;
	}
	@PostMapping("/processForgotPassword")
	public ResponseEntity<Acount>  processForgotPassword(@RequestParam("email")String email, HttpServletRequest request)
			throws UnsupportedEncodingException, MessagingException {
		String detail="forgot password process";
		Acount acount= accountService.findByEmail( email);
		accountService.forgotPassword(email, getSiteURL(request),detail);
		return ResponseEntity.ok().body(acount) ;
	}
	private String getSiteURL(HttpServletRequest request) {
		String siteURL = request.getRequestURL().toString();
		return siteURL.replace(request.getServletPath(), "");
	}
	@GetMapping("/verify")
	public String verifyUser(@RequestParam("code") String code,@RequestParam("id") int id,@RequestParam("password") String password) {
	if(password==null){
		if (accountService.verify(code)) {
			return "verify_success";
		} else {
			return "verify_fail";
		}
	} else{
		Acount acc=acountDAO.getById(id);
		String passwordEncoded=passwordEncoder.encode(password);

		acc.setPassword(passwordEncoded);

		return "verify_success";
	}


}
	@PostMapping("/changePassword")
	public ResponseEntity<Acount> changePassword(@RequestParam("id") int id, @RequestParam("password")String pass){
		String passwordEncode=passwordEncoder.encode(pass);
//
//
		acountDAO.updateAcount(passwordEncode,id);

	return ResponseEntity.ok().body(null);
	}
}
