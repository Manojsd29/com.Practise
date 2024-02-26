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
import com.Practise.Pom.Repo.ItemPage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Practise.GenericLib.LisImplementation.class)
public class HomePage_Item_Checkout extends BaseClass{
	
	
@Test(groups= {"smokeTest"})
public void homePageAddItemCheckOutTest() throws Throwable {
		
		FileUtility fiu= new FileUtility();
		WebDriverUtility wdu= new WebDriverUtility();
		

		String URL=fiu.getValues("url");
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		wdu.windowMax(driver);
		HomePage Hp= new HomePage(driver);
		ItemPage Ip= new ItemPage(driver);
		//Click on Shop Menu
		Hp.getShopbutton().click();
		 //Now click on Home menu button
		Hp.getHomeButton().click();
		
		List<WebElement> sliders = driver.findElements(By.xpath("//img [@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]"));
//		   // Assert that there are exactly 3 sliders present
     if (sliders.size() == 3) {
         System.out.println("Verified: Three sliders are present on the page.");
     } else {
         System.out.println("Error: The number of sliders found is not equal to 3.");
     }
     // Click on the Add To Basket button which adds that book to your basket
      Hp.getAddtoBasket().click();
     
     //Click on the Ruby sleniumItem
      Hp.clickseleniumRuby().click();
      
      //User can view that Book in the Menu item with price.
      // Now click on Item link which navigates to proceed to check out page
      
      Ip.getClickmainItem().click();
      
      //Now user can find total and subtotal values just above the Proceed to Checkout button.
      Ip.getProceedToCheckButton().click();
      
      driver.close();
      
      
     
}
}