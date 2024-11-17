package com.ecom.service;
import org.springframework.web.multipart.MultipartFile;


import com.ecom.model.EmailRequest;
public interface EmailService {
	
	public Boolean sendEmail(EmailRequest emailRequest) throws Exception;
	
}
