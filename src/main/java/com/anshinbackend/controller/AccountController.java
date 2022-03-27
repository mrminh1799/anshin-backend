package com.anshinbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anshinbackend.service.AcountService;

@RestController

public class AccountController {
	@Autowired
	private AcountService accountService;

	@PostMapping("/forgot-password")
	public String forgotPassword(@RequestParam String email) {

		String response = accountService.forgotPassword(email);

		if (!response.startsWith("Invalid")) {
			response = "http://localhost:8080/reset-password?token=" + response;
		}
		return response;
	}

	@PutMapping("/reset-password")
	public String resetPassword(@RequestParam String token,
			@RequestParam String password) {

		return accountService.resetPassword(token, password);
	}

	

}
