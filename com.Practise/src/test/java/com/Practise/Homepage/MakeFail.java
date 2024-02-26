package com.Practise.Homepage;

import static org.testng.Assert.fail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Practise.GenericLib.BaseClass;
import com.Practise.GenericLib.FileUtility;
import com.Practise.GenericLib.JavaUtility;
import com.Practise.GenericLib.WebDriverUtility;
import com.Practise.Pom.Repo.HomePage;
import com.Practise.Pom.Repo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Practise.GenericLib.LisImplementation.class)
public class MakeFail extends BaseClass {
	
	
@Test
	public void makeFailTest() throws Throwable {
		FileUtility fiu= new FileUtility();
		WebDriverUtility wdu= new WebDriverUtility();
        JavaUtility jv = new JavaUtility();
        String URL=fiu.getValues("url");

		HomePage Hp= new HomePage(driver);
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		
		wdu.windowMax(driver);
		Hp.getMyAccountButton().click();
		LoginPage Lp=new LoginPage(driver);
		Assert.fail();
	}
}