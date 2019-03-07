package com.qa.APITest.prac;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.restclient.prac.RestClientPrac;
import com.qa.testbase.prac.TestBasePrac;

public class APITest extends TestBasePrac {
	
	TestBasePrac testBasePrac;
	public String URI;
	
	@BeforeMethod
	public void setup(){
		
		testBasePrac = new TestBasePrac();
		String URL = prop.getProperty("URL");
		String serURL = prop.getProperty("serviceURL");
		URI = URL + serURL;
	}
	
	@Test
	public void UserDefinedTestCase(){
		RestClientPrac RC = new RestClientPrac();
		RC.getMethod(URI);
	}

}
