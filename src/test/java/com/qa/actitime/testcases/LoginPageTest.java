package com.qa.actitime.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.actitime.pages.Enterpage;


public class LoginPageTest extends BaseTest {

	@Test(priority = 1,enabled = false)
	public void testloginPageTitle() {

		String Expected = lp.getLoginpageTitle();
		System.out.println(Expected);
		String actual = "actiTIME - Login";
		Assert.assertEquals(actual, Expected);
		
	}

	@Test(priority = 2,enabled = false)
	public void testActiLogoDisplayed() {
		
		boolean logo = lp.actiImgdisplayed();
		Assert.assertTrue(logo);
		System.out.println(logo);

	}

	@Test(priority = 3,enabled = false)
	public void testActiLinkDisplayed() {
		
		boolean link = lp.acttitmeLinkDisplayed();
		Assert.assertTrue(link);
		System.out.println(link);
		
	}

	@Test(enabled = true)
	
	public void testLoginFunction() {
		
		lp.enterUsername("admin");
		lp.enterpassword("manager");
		lp.clicklogin();
		Enterpage ep = new Enterpage();
		String user = ep.getuserloggedin();
		Assert.assertTrue(user.contains("John"));
		System.out.println("User Logged in successfully");
		ep.Logout();
		

	}

}
