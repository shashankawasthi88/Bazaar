package com.bazaar.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class SessionController {
	
	
	
	public void generateOTP()
	{
		
	}
	
	public int validateOTP(long phoneNumner, int otp)
	{
		return 1;
	}
	
	

}
