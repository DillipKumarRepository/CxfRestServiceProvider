package com.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.json.JSONObject;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.HttpResponse;

import java.io.InputStreamReader;
import java.io.BufferedReader;







public class PostStudentClient {

	public static void main(String[] args) {
		 // List<ContactInfo> contactInfoList = new ArrayList<ContactInfo>();
	    try {
	     
	    	           HttpClient client = new DefaultHttpClient();
	    	           //PostMethod mPost = new PostMethod("http://localhost:8080/CXFRestService/services/cxfRestService/userInfo");
	    	           HttpPost post = new HttpPost("http://localhost:8080/CXFRestService/services/cxfRestService/userInfo");

	    	           JSONObject json = new JSONObject();
	    	            json.put("emailAddress", "email");
	    	            json.put("password", "pass") ;
	    	            
	    	            StringEntity input = new StringEntity( json.toString());
	    	            input.setContentType("application/json");
	    	            post.setEntity(input);
	    	            HttpResponse response = client.execute(post);
	    	            
	    	            
	    	            /*ByteArrayOutputStream outstream = new ByteArrayOutputStream();
	    	            response.getEntity().writeTo(outstream);
	    	            byte [] responseBody = outstream.toByteArray();*/
	    	            
	    	            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	    	            String line = null;
	    	              while ((line = rd.readLine()) != null) {
	    	              System.out.println(line);
	    	              }

	    	            
	    	            
	    	            /*mPost.addParameter("name", "Naked Sun");
	    	            mPost.addParameter("author", "Issac Asimov");
	    	            Header mtHeader = new Header();
	    	            mtHeader.setName("content-type");
	    	            mtHeader.setValue("application/x-www-form-urlencoded");
	    	            mtHeader.setName("accept");
	    	            mtHeader.setValue("application/xml");*/
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	/*URL url = new URL("http://localhost:8080/CXFRestService/services/cxfRestService/userInfo");
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setDoOutput(true);
	      conn.setRequestMethod("POST");
	      conn.setRequestProperty("Content-Type", "application/json");

	      //String input = "{\"Student\":{\"name\":\"Tom\"}}";
	      
	     //String input = {"emailAddress":"dillip304@gmail.com","password":"dillip"};
	    		  
	      JSONObject dataSet = new JSONObject();
	      dataSet.put("emailAddress", "dillip304@gmail.com") ;
	      dataSet.put("password", "dillip") ;
	      String input = dataSet.toString();  
	      
	      System.out.println("input::"+input);
	      
	      OutputStream os = conn.getOutputStream();
	      os.write(input.getBytes());
	      os.flush();

         System.out.println(conn.getInputStream());
	      Scanner scanner;
	      if (conn.getResponseCode() != 200) {
	        scanner = new Scanner(conn.getErrorStream());
	      } else {
	        scanner = new Scanner(conn.getInputStream());
	      }
	      System.out.println(contactInfoList + scanner.next());
	      ContactInfoResponse res = new ContactInfoResponse();
	      res.setContactInfo(contactInfoList);
	      scanner.close();
	      conn.disconnect();*/
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	}