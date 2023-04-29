package com.qa.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actitime.driver.DriverManager;

public class Enterpage extends DriverManager {

//	*******************page Elements*************8//
	@FindBy(id = "logoutLink")
	WebElement Logoutbutton;
	@FindBy(xpath = "//a[@class='userProfileLink username ']")
	WebElement userprofiletext;
	@FindBy(id = "container_tasks")
	WebElement TaskPage;

	// ******************Page Initialization************************//

	public Enterpage() {
	    PageFactory.initElements(driver, this);
	}
	// ******************Page Actions/Functions************************//

	public String getuserloggedin() {

		return userprofiletext.getText();

	}

	public String getTitlepage() {

		return driver.getTitle();
	}

	public void Logout() {

		Logoutbutton.click();
	}

	public void getTaskpage() {
		TaskPage.click();
	}

}
