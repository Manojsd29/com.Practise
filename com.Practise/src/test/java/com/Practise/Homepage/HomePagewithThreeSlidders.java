package com.Practise.Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Practise.GenericLib.BaseClass;
import com.Practise.GenericLib.FileUtility;
import com.Practise.GenericLib.WebDriverUtility;
import com.Practise.Pom.Repo.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Practise.GenericLib.LisImplementation.class)
public class HomePagewithThreeSlidders extends BaseClass {

	
	@Test
	public void HomePagecaseTest() throws Throwable {
		
		FileUtility fiu= new FileUtility();
		WebDriverUtility wdu= new WebDriverUtility();

		String URL=fiu.getValues("url");
		
		HomePage Hp= new HomePage(driver);
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		wdu.windowMax(driver);
		Hp.getShopbutton().click();
		Hp.getHomeButton().click();
		
		List<WebElement> sliders = driver.findElements(By.xpath("//img [@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]"));
//		   // Assert that there are exactly 3 sliders present
     if (sliders.size() == 3) {
         System.out.println("Verified: Three sliders are present on the page.");
     } else {
         System.out.println("Error: The number of sliders found is not equal to 3.");
     }

		driver.close();
		
		//Click on Shop Menu
	
		
}

	
	
}


