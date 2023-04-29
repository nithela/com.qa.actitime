
package com.qa.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actitime.driver.DriverManager;

public class Loginpage extends DriverManager {

	// ****************Page Elements********************//

	@FindBy(xpath="//input[@id='username']")
	WebElement usernameField;
	@FindBy(name = "pwd")
	WebElement passwordField;
	@FindBy(id="loginButton")
	WebElement loginButton;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiImg;
	@FindBy(xpath="//a[text()='actiTIME Inc.']") WebElement actitimeLink;

	// ******************Page Initialization************************//

	public Loginpage() {
	    PageFactory.initElements(driver, this);
	}
	// ******************Page Actions/Functions************************//
	
	public boolean actiImgdisplayed() {
		
		return actiImg.isDisplayed();
	
	}
	
	
	public boolean acttitmeLinkDisplayed() {
		return actitimeLink.isDisplayed();
		
	}
	public void enterUsername(String username) {
		usernameField.clear();
		usernameField.sendKeys(username);

	}

	public  String getLoginpageTitle() {
		return driver.getTitle();
	}
	
	
	public void enterpassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);

	}

	public void clicklogin() {
		
		loginButton.click();
	}
}
