package com.Practise.GenericLib;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	



	public String getValues(String key) throws Throwable {
		
		
		
		FileInputStream fis =new FileInputStream("C:\\Users\\sd007\\OneDrive\\Documents\\Practise\\com.Practise\\src\\main\\resources\\Testdata\\commondata.properties");
		Properties p =new Properties();
		p.load(fis);
		String value =p.getProperty(key);
		return value;
		
	}
}
