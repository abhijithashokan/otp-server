package com.abhi.springMain.service;

import java.util.Random;

public class Otpservice {


	    public String generateOtp() {
	        Random random = new Random();
	        int otp = 100000 + random.nextInt(900000);
	        return String.valueOf(otp);
	    }

	    }
