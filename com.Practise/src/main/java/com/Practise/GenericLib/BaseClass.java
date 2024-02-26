package com.Practise.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
public WebDriver driver =null;

FileUtility Fiu =new FileUtility();


// Below script provides the required browser;
//   @BeforeClass
//	public void openBrowser(String browser) throws Throwable {
//	  browser= "chrome";
////	   
////		if (browser.equals("chrome")) {
////			WebDriverManager.chromedriver().setup();
////			driver=new ChromeDriver();
////		}
////		else if(browser.equals("firefox")) {
////			WebDriverManager.firefoxdriver().setup();
////			driver =new FirefoxDriver();
////	}
////		else if(browser.equals("edge")) {
////			WebDriverManager.edgedriver().setup();
////			driver =new EdgeDriver();
////	}
////		else {
////			System.out.println("Invalid browser entry: "+browser);
////		}
//			

   @BeforeClass (groups= {"smokeTest","regression"})
	public void openBrowser() throws Throwable {
	
	   System.out.println(" Open the browser ==============");
	   
	
}
   
   
   //closing the browser after the test case execution
	@AfterClass(groups= {"smokeTest","regression"})
	public void BcConfig() {
		System.out.println(" close the browser ==============");
		
	}
	@Parameters("browser")
	@BeforeMethod (groups= {"smokeTest","regression"})
	public void beforeMethodConfig() throws Throwable {
		
		System.out.println("starting the execution of the Test Script");
		FileUtility Fiu =new FileUtility();
		String browser=Fiu.getValues("browser");
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
	}
		else if(browser.equals("msedge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
	}
		else {
			System.out.println("Invalid browser entry: "+browser);
		}
	}

	@AfterMethod(groups= {"smokeTest","regression"})
	public void afterMethod() {
		
		System.out.println("Ending the execution of the Test Script");
	}
}