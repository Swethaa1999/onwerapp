package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.DTO.Email;
import com.zohocrm.utill.Emailservice;


@Controller
public class EmailController {
	
	@Autowired
	private Emailservice emailservice;
	
	@PostMapping("/sendEmail")
	public String getEmailId(@RequestParam("email") String email,Model model) {
		
		model.addAttribute("email", email);
		//model.addAttribute("sub", subject);
		return "compose_email";
	}
	
	@PostMapping("/triggeremail")
	public String triggerEmail(Email email,Model model) {
		
		emailservice.sendsimpleMail(email.getEmail(), email.getSubject(),email.getContent());
		model.addAttribute("msg", "email sent");
		return "compose_email";
	}

}
