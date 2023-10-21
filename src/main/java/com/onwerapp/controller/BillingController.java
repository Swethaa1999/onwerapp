package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contacts;
import com.zohocrm.service.Contactservice;

@Controller
public class BillingController {
	
	@Autowired
	private Contactservice contactservice;
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id,Model model) {
		Contacts contacts = contactservice.getContactById(id);
		model.addAttribute("contact", contacts);
		return "contact_info";
	}
	
	@RequestMapping("/generatebill")
	public String viewBillingPage(@RequestParam("id") long id,Model model) {
		Contacts contacts = contactservice.getContactById(id);
		model.addAttribute("contact", contacts);
		return "generate_bill";
	}
	


}