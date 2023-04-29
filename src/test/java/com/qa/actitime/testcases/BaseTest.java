package com.qa.actitime.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.actitime.driver.DriverManager;
import com.qa.actitime.pages.Loginpage;

public class BaseTest extends DriverManager{
	
	Loginpage lp;
	
public void setUpReport() {
	ExtentHtmlReporter extent = new ExtentHtmlReporter("./com.qa.actitime/reports/actiindex.html");
	ExtentReports report = new ExtentReports();
}
	
	@BeforeMethod
	public void preTest() {
		initApplication();
		lp = new Loginpage();
		
	}

	@AfterMethod
	
	public void tearDown() {
		
	quitbrowser();
	}
	
}
