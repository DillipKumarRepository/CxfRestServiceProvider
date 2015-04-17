package com.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"contactFirstName", "contactLastName", "contactEmailAddress"})
@XmlRootElement(name = "ContactInfo")
public class ContactInfo {

	@XmlElement(required = true)
	protected String contactFirstName;

	@XmlElement(required = true)
	protected String contactLastName;

	@XmlElement(required = true)
	protected String contactEmailAddress;

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String value) {
		this.contactFirstName = value;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String value) {
		this.contactLastName = value;
	}

	public String getContactEmailAddress() {
		return contactEmailAddress;
	}

	public void setContactEmailAddress(String value) {
		this.contactEmailAddress = value;
	}

}