package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.ecom.model.EmailRequest;
import com.ecom.service.EmailService;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public Boolean sendEmail(EmailRequest emailRequest) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom("tuanhaduc13@gmail.com", emailRequest.getTitle());
		helper.setTo(emailRequest.getRecipentEmail());
		helper.setSubject(emailRequest.getSubject());
		helper.setText(emailRequest.getBody(), true);
		mailSender.send(message);
		return true;
	}

}
