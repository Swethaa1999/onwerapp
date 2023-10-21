package com.zohocrm.utill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class Emailserviceimpl implements Emailservice {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void sendsimpleMail(String to, String sub, String emailbody) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(sub);
		mailMessage.setText(emailbody);
		
		javaMailSender.send(mailMessage);
		
        
	}

}
