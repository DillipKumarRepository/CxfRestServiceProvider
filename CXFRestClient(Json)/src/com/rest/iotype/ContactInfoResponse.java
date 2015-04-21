package com.rest.iotype;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import com.rest.iotype.ContactInfo;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ContactInfoResponse {

	@JsonProperty(value = "contactInfo")
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