package com.ceiba.vigilanteCeiba.util;

public class RestResponse {
	
	private Integer responseCode;
	private String message;
	
	
	public RestResponse(Integer responseCode) {
		super();
		this.responseCode =  responseCode;
	}
	public RestResponse(Integer responseCode, String message) {
		super();
		this.responseCode =  responseCode;
		this.message= message;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
