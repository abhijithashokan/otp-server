package com.abhi.springMain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.springMain.model.OtpStoreModel;
import com.abhi.springMain.service.Otpservice;

@RestController
@RequestMapping("/api")
public class OtpController {
	
	@Autowired
	private Otpservice otpservice;
	
	@PostMapping("/generateotp")
	public String otpGenerator(@RequestBody OtpStoreModel otpRequest ) {
		
		String otp = otpservice.generateOtp();
		//otpservice.storeOtp(otp);
        return otp;
	}

}
