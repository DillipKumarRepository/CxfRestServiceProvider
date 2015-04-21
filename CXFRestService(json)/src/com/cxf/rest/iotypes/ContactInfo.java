package com.cxf.rest.iotypes;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ "contactFirstName", "contactLastName","contactEmailAddress" })
public class ContactInfo {
	@JsonProperty(value = "contactFirstName")
	private String contactFirstName;

	@JsonProperty(value = "contactLastName")
	private String contactLastName;

	@JsonProperty(value = "contactEmailAddress")
	private String contactEmailAddress;

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactEmailAddress() {
		return contactEmailAddress;
	}

	public void setContactEmailAddress(String contactEmailAddress) {
		this.contactEmailAddress = contactEmailAddress;
	}

	@Override
	public String toString() {
		return "ContactInfo [contactFirstName=" + contactFirstName
				+ ", contactLastName=" + contactLastName
				+ ", contactEmailAddress=" + contactEmailAddress + "]";
	}

}