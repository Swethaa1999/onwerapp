package com.zohocrm.DTO;

public class Email {
	
	//DTO are not linked to db .It is used only to transfer data from one processor to another
	
	private String email;
	private String subject;
	private String content;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
