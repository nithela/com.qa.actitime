package com.qa.actitime.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.actitime.driver.DriverManager;
import com.qa.actitime.pages.Loginpage;

public class BaseTest extends DriverManager{
	
	Loginpage lp;
	ExtentHtmlReporter extent;
	ExtentReports report;
	
public void setUpReport() {
	
	new ExtentHtmlReporter("./com.qa.actitime/reports/actiindex.html");
	 new ExtentReports();
	report.attachReporter(extent);
}
	
	@BeforeMethod
	public void preTest() {
		initApplication();
		lp = new Loginpage();
		
	}

	@AfterMethod
	
	public void tearDown() {
	
	report.flush();
	quitbrowser();
	}
	
}
