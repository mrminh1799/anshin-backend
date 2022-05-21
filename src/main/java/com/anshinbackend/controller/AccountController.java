package com.anshinbackend.controller;

import com.anshinbackend.entity.Acount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.anshinbackend.service.AcountService;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Random;

@RestController

public class AccountController {
	@Autowired
	private AcountService accountService;

	@PostMapping("/forgotPassword")
	public String forgotPassword(@RequestParam String email) {

		String response = accountService.forgotPassword(email);

		if (!response.startsWith("Invalid")) {
			response = "http://localhost:8080/reset-password?token=" + response;
		}
		return response;
	}




}
