package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.ContactRepository;
import com.zohocrm.Repository.LeadRepository;
import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;

@Service
public class Leadserviceimpl implements Leadservice {

	@Autowired
	private LeadRepository leadRepo;
	
	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void SaveOneLead(Lead lead) {
		leadRepo.save(lead);

	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;	
	}

	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		
		return leads;
	}

	

}
