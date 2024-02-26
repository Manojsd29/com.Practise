package com.Practise.GenericLib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	
		/* It will gives implicit wait
		 * 
		 */
		public void implicitWait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		/* It will maximize the window
		 * 
		 */
		
		public void windowMax(WebDriver driver) {
			driver.manage().window().maximize();
		}
		
		/**
		 * 
		 * @param element
		 * @param option
		 */
		public void Select(WebElement element, String option) {
			Select s = new Select(element);
			s.selectByVisibleText(option);
		}
		
		
        public void swtichtoWindow(WebDriver driver, String Value) {
        	Set<String> allwin = driver.getWindowHandles();
        	Iterator<String> iter = allwin.iterator();
        	while(iter.hasNext()) {
        		String title = driver.switchTo().window(Value).getTitle();
        		if(title.contains(Value)) {
        		break;
        	}
        }
		
		
        
	}
        public void login(WebDriver driver ,String name ,String password ) {
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
        	
        }
}


