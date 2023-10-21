package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;

public interface Leadservice {
	
	
	
	public void SaveOneLead(Lead lead);

	public Lead findLeadById(long id);

	public void deleteLeadById(long id);

	public List<Lead> getAllLeads();

	

}
