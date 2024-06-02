package com.abhi.springMain.model;

import lombok.Data;

@Data
public class OtpStoreModel {
	
	private String txn;
	private Otp otp;
	
	public String getTxn() {
		return txn;
	}
	public void setTxn(String txn) {
		this.txn = txn;
	}
	public Otp getOtp() {
		return otp;
	}
	public void setOtp(Otp otp) {
		this.otp = otp;
	}
	
	

}
