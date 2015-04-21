package com.cxf.rest.iotypes;

import java.util.List;

public class ContactInfoResponse {

	private List<ContactInfo> contactInfo;

	public List<ContactInfo> getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
	}

	@Override
	public String toString() {
		return "ContactInfoResponse [contactInfo=" + contactInfo + "]";
	}

}