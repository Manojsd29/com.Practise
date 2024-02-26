package com.Practise.GenericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImplementation implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
	
		
	}

	public void onTestFailure(ITestResult result) {
		
		
		String Testcasename = result.getMethod().getMethodName();
		Object obj = result.getInstance();
		WebDriver driver= null;
		System.out.println(Testcasename+"Excecute =============Test listening the flow");
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			File desn = new File("./screenshot/"+Testcasename+".PNG");
			try {
			FileUtils.copyFile(src, desn);
		
		
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("Exception for Test:"+e.getMessage());
		}
	}
	

	
	public void captureScreenshot(String methodName) throws Throwable {
		try {
			WebDriver driver =null;
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			File desn = new File("./screenshot/"+methodName+".PNG");
			FileUtils.copyFile(src, desn);
			System.out.println("Screen shot captured for Test:"+methodName);
		
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("Exception for Test:"+e.getMessage());
		}
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		
	
	}

	public void onStart(ITestContext context) {
		
		
	}

	

}
