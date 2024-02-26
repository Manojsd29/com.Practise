package com.Practise.Homepage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Practise.GenericLib.BaseClass;
import com.Practise.GenericLib.FileUtility;
import com.Practise.GenericLib.WebDriverUtility;
import com.Practise.Pom.Repo.DashboardPage;
import com.Practise.Pom.Repo.HomePage;
import com.Practise.Pom.Repo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Practise.GenericLib.LisImplementation.class)
public class LoginwithApp extends  BaseClass {
@Test
	public void loginToAppTest() throws Throwable {
		
		FileUtility fiu= new FileUtility();
		WebDriverUtility wdu= new WebDriverUtility();

		String URL=fiu.getValues("url");
		

		HomePage Hp= new HomePage(driver);
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		
		wdu.windowMax(driver);
		Hp.getMyAccountButton().click();
		
		wdu.login(driver, "manoj.29sd@gmail.com","9844533012");
		
		LoginPage Lp=new LoginPage(driver);
		
		Lp.getLoginButton().click();
		String value = driver.findElement(By.xpath("//strong[text()=\"manoj.29sd\"]")).getText();
		if(value.toString().equals("manoj.29sd")) {
		     System.out.println("Verified: Login value is correct on the page.");
	     } else {
	         System.out.println("Error: Incorrect");
		}
		driver.close();
		
	}
@Test
  public void logOutToAppTest() throws Throwable {
	
	FileUtility fiu= new FileUtility();
	WebDriverUtility wdu= new WebDriverUtility();

	String URL=fiu.getValues("url");
	

	HomePage Hp= new HomePage(driver);
	DashboardPage Db=new DashboardPage(driver);
	
	// Enter the URL �http://practice.automationtesting.in/�
	driver.get(URL);
	
	wdu.windowMax(driver);
	Hp.getMyAccountButton().click();
	
	wdu.login(driver, "manoj.29sd@gmail.com","9844533012");
	
	LoginPage Lp=new LoginPage(driver);
	
	Lp.getLoginButton().click();
	String value = driver.findElement(By.xpath("//strong[text()=\"manoj.29sd\"]")).getText();
	if(value.toString().equals("manoj.29sd")) {
	     System.out.println("Verified: Login value is correct on the page.");
     } else {
         System.out.println("Error: Incorrect");
	}
	Db.getLogoutButton().click();
	String PageTitle = driver.getTitle();
	Assert.assertEquals("My Account – Automation Practice Site", PageTitle);
	driver.close();
  }
}
