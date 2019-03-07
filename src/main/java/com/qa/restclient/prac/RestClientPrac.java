package com.qa.restclient.prac;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClientPrac {
	
	public void getMethod(String URI){
		
		try{

			// Step1 - Establish the connection with the client
			CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
			// Step2 - Use the HttpGet class GET method to create a GET connection with the URI
			HttpGet httpGet = new HttpGet(URI);
			// Step3 - The execute() takes URI from the GET Method and executes the GET Request
			CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(httpGet);
			
			// closeableHttpResponse instance holds the entire request : Status Line, Headers, JSON Response
			int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
			System.out.println("The Status code is: "+ statusCode);
			
			String strResponse = EntityUtils.toString(closeableHttpResponse.getEntity());
			
			JSONObject jsonResponse = new JSONObject(strResponse);
			System.out.println("The JSON response is: "+ jsonResponse);
			
			
			
			
			
			
			
			
			
			
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
