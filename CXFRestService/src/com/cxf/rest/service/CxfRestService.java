package com.cxf.rest.service;

import com.cxf.rest.iotypes.ContactInfoResponse;
import com.cxf.rest.iotypes.UserInfoRequest;

public interface CxfRestService {

	
	public ContactInfoResponse getContacts(final UserInfoRequest userInfo);


}