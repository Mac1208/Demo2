package com.qa.testbase.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBasePrac {
	
	public Properties prop;
	public FileInputStream inp;
	
	public TestBasePrac() {
		
		try{
			
			prop = new Properties();
			inp = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//qa//configuration//config.properties");
			prop.load(inp);
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	

}
