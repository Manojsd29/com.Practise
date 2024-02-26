package com.Practise.genericflow;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Practise.GenericLib.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePagewith3slidders {

	public static void main(String[] args) throws Throwable {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver =new EdgeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		List<WebElement> sliders = driver.findElements(By.xpath("//img [@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]"));
//		   // Assert that there are exactly 3 sliders present
        if (sliders.size() == 3) {
            System.out.println("Verified: Three sliders are present on the page.");
        } else {
            System.out.println("Error: The number of sliders found is not equal to 3.");
        }
        FileUtility fiu =new FileUtility();
        String URL=fiu.getValues("url");
        System.out.println(URL);
        

		driver.close();
		
		

	}

}
