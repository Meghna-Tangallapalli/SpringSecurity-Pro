package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

	@GetMapping("/homePage")
	public String home() {
		String msg = "welcome to home page";
		return msg;
	}
	
	@GetMapping("/balancess")
	public String getBalance() {
		String msg = "your current balance id: 675 INR";
		return msg;
	}
	
	@GetMapping("/statements")
	public String getStatement() {
		String msg = "your statement generated and sent to your email id";
		return msg;
	}
	
	@GetMapping("/myLoan")
	public String getMyLoan() {
		String msg = "your loan amt due : 300000 INR";
		return msg;
	}
	
	@GetMapping("/contacts")
	public String contact() {
		String msg = "thankyou for contacting customer support, we will get back to you soon";
		return msg;
	}
}
