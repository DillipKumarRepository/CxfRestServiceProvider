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
public class CxfRestServiceImpl implements CxfRestService{

@POST
@Path("/userInfo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_XML)
@Override
public ContactInfoResponse getContacts(UserInfoRequest userInfo) {
	System.out.println("Inside method");
	try {
		//List<ContactInfo> contactInfoList = new ArrayList<ContactInfo>();
		ContactInfo[] contactInfoList = new ContactInfo[4];
        String emailAddress = userInfo.getEmailAddress();
        String password = userInfo.getPassword();
        
        
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfoList[0] = new ContactInfo();
        	contactInfoList[0].setContactFirstName("Dillip");
        	contactInfoList[0].setContactLastName("Das");
        	contactInfoList[0].setContactEmailAddress("tech.dillip@yahoo.com");
        }
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfoList[1] = new ContactInfo();
        	contactInfoList[1].setContactFirstName("Sai");
        	contactInfoList[1].setContactLastName("Teja");
        	contactInfoList[1].setContactEmailAddress("saiteja@yahoo.com");
        }
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfoList[2] = new ContactInfo();
        	contactInfoList[2].setContactFirstName("Anil");
        	contactInfoList[2].setContactLastName("Kumar");
        	contactInfoList[2].setContactEmailAddress("anilkumar@yahoo.com");
        }
        if(emailAddress.equalsIgnoreCase("dillip304@gmail.com") && password.equalsIgnoreCase("dillip")){
        	contactInfoList[3] = new ContactInfo();
        	contactInfoList[3].setContactFirstName("Murali");
        	contactInfoList[3].setContactLastName("Kumar");
        	contactInfoList[3].setContactEmailAddress("murali333@gmail.com");
        }
        System.out.println("contactInfoList::"+contactInfoList);
        ContactInfoResponse response = new ContactInfoResponse();
        response.setContactInfo(contactInfoList);
        return response;
        
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        throw new RuntimeException(ex);
    }
	
  }
}