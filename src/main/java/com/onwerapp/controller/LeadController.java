package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.Contactservice;
import com.zohocrm.service.Leadservice;


@Controller
public class LeadController {
	
	//
	
//	@Autowired
//	private Emailservice emailservice;
//	
	@Autowired
	private Leadservice leadservice;
	
	@Autowired
	private Contactservice contactservice;
	
	 @GetMapping("/viewCreateLeadPage")
	 public String viewCreateLeadPage() {
		 
		 return "create_new_lead";
		 
	 }
	 
	 @PostMapping("/save")
	 public String SaveLead(@ModelAttribute("lead") Lead lead,Model model) {
		 leadservice.SaveOneLead(lead);
		// emailservice.sendsimpleMail(lead.getEmail(), "Zohocrm", "zohocrm project");
		 model.addAttribute("lead",lead);
		 return "lead_info";
		 
	 }
	 
	 @PostMapping("/convertLead")
	 public String convertLead(@RequestParam("id") long id,Model model) {
		 
		 Lead lead = leadservice.findLeadById(id);
		 
		 Contacts contact=new Contacts();
		
		 //copying data from lead to contact and contact object initialize
		 contact.setFirstName(lead.getFirstName());
		 contact.setLastName(lead.getLastName());
		 contact.setEmail(lead.getEmail());
		 contact.setMobile(lead.getMobile());
		 contact.setSource(lead.getSource());
		 
		 contactservice.savecontact(contact);
		 
		 leadservice.deleteLeadById(id);
		 
		 List<Contacts> contacts = contactservice.getAllContact();
		 model.addAttribute("contact",contacts);
		 return "list_contacts";
	 }
	 
	 @RequestMapping("/listall") //or getmapping
	 public String listAllLeads(Model model) {
		List<Lead> leads = leadservice.getAllLeads();
		 model.addAttribute("leads", leads);
		 return "list_leads";
		 
	 }
	 
	 @RequestMapping("/listallcontacts")
	 public String listcontacts(Model model) {
		 List<Contacts> contacts = contactservice.getAllContact();
		 model.addAttribute("contacts",contacts);
		 return "list_contacts";
	 }
	 
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		
		Lead lead = leadservice.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";	
	}
	
	
	 
	 
	
	

}
