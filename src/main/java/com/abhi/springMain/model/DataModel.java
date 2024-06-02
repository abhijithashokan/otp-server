package com.abhi.springMain.model;

public class DataModel {
	private String id;
	private String otp;
	private String txn;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getTxn() {
		return txn;
	}
	public void setTxn(String txn) {
		this.txn = txn;
	}
	@Override
	public String toString() {
		return "DataModel [id=" + id + ", otp=" + otp + ", txn=" + txn + "]";
	}
	
	
	

}
