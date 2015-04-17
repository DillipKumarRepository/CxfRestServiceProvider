package com.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ContactInfoResponse")
public class ContactInfoResponse {

	    @XmlElement(required = true)
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