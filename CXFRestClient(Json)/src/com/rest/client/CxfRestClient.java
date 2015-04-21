package com.rest.client;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import com.rest.iotype.ContactInfoResponse;
import java.net.MalformedURLException;

/**
 * Servlet implementation class CxfRestClient
 */
@WebServlet("/CxfRestClient")
public class CxfRestClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pwd");

		try {
					HttpClient client = new DefaultHttpClient();
					HttpPost post = new HttpPost("http://localhost:8080/CXFRestService/services/cxfRestService/userInfo");
					JSONObject json = new JSONObject();
					json.put("emailAddress", email);
					json.put("password", pass) ;
					StringEntity input = new StringEntity( json.toString());
					input.setContentType("application/json");
					post.setEntity(input);
					HttpResponse response = client.execute(post);	
					HttpEntity httpEntity = response.getEntity();
					String apiOutput = EntityUtils.toString(httpEntity);
					ContactInfoResponse result = new ContactInfoResponse();
   	                 result = new ObjectMapper().readValue(apiOutput, ContactInfoResponse.class);
					//System.out.println("ContactInfo::::"+result);
					req.setAttribute("contacts", result);
					RequestDispatcher dispatcher = req.getRequestDispatcher("contactInfo.jsp");  
					if (dispatcher != null){  
					dispatcher.forward(req, res);  
			        }
					
		}catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
