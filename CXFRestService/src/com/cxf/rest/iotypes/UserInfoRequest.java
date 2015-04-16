package com.cxf.rest.iotypes;

import org.codehaus.jackson.annotate.JsonProperty;

public class UserInfoRequest {

	@JsonProperty(value = "emailAddress")
	private String emailAddress;

	@JsonProperty(value = "password")
	private String password;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfoRequest [emailAddress=" + emailAddress + ", password="
				+ password + "]";
	}

}