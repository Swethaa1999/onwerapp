package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;

public interface Contactservice {
	
	public void savecontact(Contacts contact);
	
	public List<Contacts> getAllContact();

	

	public Contacts getContactById(long id);

}
