package com.Practise.Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
public class ResgisterNewUser extends BaseClass {
	
@Test(groups= {"smokeTest"})
	public void registerNewUserTest() throws Throwable {
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
		
		String stringname = jv.randomSTring();
		System.out.println(stringname);
		
		Lp.getRegisterNameBlock().sendKeys("manoj.sd"+stringname+"@gmail.com");
		Lp.getRegisterPasswordBlock().sendKeys("Password_"+stringname);
		wdu.implicitWait(driver);
		Lp.getRegisterButton().click();
		driver.close();
		
	}
}
