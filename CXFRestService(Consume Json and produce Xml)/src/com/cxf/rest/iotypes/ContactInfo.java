package com.cxf.rest.iotypes;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.*;


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