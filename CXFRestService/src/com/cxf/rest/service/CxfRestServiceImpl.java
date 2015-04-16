package com.cxf.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cxf.rest.iotypes.ContactInfo;
import com.cxf.rest.iotypes.ContactInfoResponse;
import com.cxf.rest.iotypes.UserInfoRequest;

@WebService(serviceName = "cxfRestService", targetNamespace = "http://www.27programs.com/restServices/services")
@Path("/rest")
public class CxfRestServiceImpl implements CxfRestService{

@POST
@Path("/userInfo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Override
public ContactInfoResponse getContacts(UserInfoRequest userInfo) {
	System.out.println("Inside method");
	try {
		List<ContactInfo> contactInfoList = new ArrayList<ContactInfo>();
        String emailAddress = userInfo.getEmailAddress();
        String password = userInfo.getPassword();
        ContactInfo contactInfo = null;
        
        
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfo = new ContactInfo();
        	contactInfo.setContactFirstName("Dillip");
        	contactInfo.setContactLastName("Das");
        	contactInfo.setContactEmailAddress("tech.dillip@yahoo.com");
        	contactInfoList.add(contactInfo);
        }
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfo = new ContactInfo();
        	contactInfo.setContactFirstName("Sai");
        	contactInfo.setContactLastName("Teja");
        	contactInfo.setContactEmailAddress("saiteja@yahoo.com");
        	contactInfoList.add(contactInfo);
        }
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfo = new ContactInfo();
        	contactInfo.setContactFirstName("Anil");
        	contactInfo.setContactLastName("Kumar");
        	contactInfo.setContactEmailAddress("anilkumar@yahoo.com");
        	contactInfoList.add(contactInfo);
        }
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfo = new ContactInfo();
        	contactInfo.setContactFirstName("Murali");
        	contactInfo.setContactLastName("Kumar");
        	contactInfo.setContactEmailAddress("murali333@gmail.com");
        	contactInfoList.add(contactInfo);
        }

        ContactInfoResponse response = new ContactInfoResponse();
        response.setContactInfo(contactInfoList);
        return response;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        throw new RuntimeException(ex);
    }
	
  }
}