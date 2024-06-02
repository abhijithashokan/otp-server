package com.abhi.springMain.model;

public class Otp {
	
	private String generatedTime;
	private String identifier;
	private String retryCount;
	public String getGeneratedTime() {
		return generatedTime;
	}
	public void setGeneratedTime(String generatedTime) {
		this.generatedTime = generatedTime;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getRetryCount() {
		return retryCount;
	}
	public void setRetryCount(String retryCount) {
		this.retryCount = retryCount;
	}
	

}
