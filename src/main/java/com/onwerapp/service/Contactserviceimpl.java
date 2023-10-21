package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.ContactRepository;
import com.zohocrm.entities.Contacts;


@Service
public class Contactserviceimpl implements Contactservice {
	
	@Autowired
	private ContactRepository contactrepo;

	@Override
	public void savecontact(Contacts contact) {
		contactrepo.save(contact);
		

	}

	@Override
	public List<Contacts> getAllContact() {
		List<Contacts> contacts = contactrepo.findAll();
		return contacts;
	}

	@Override
	public Contacts getContactById(long id) {
		Optional<Contacts> findById = contactrepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
		
	}

	
	
}
