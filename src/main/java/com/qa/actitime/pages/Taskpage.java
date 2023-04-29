package com.qa.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actitime.driver.DriverManager;

public class Taskpage extends DriverManager{
	
	
//	*******************page Elements*************8//
	@FindBy(id="container_tasks") WebElement Tasklink;
	@FindBy(className = "title ellipsis") WebElement Addnew;
	@FindBy(className = "item createNewCustomer") WebElement NewCustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'][2]")WebElement NewCustName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement custdescription;
	@FindBy(className="emptySelection")WebElement Selectcustomer;
	@FindBy(xpath="//div[@class='itemRow cpItemRow '][1]" )WebElement BigbangComp;
	@FindBy(xpath="//*[text()='Create Customer']") WebElement createcustomer;
	
	
	
	
	
	
	
	// ******************Page Initialization************************//

	public void EnterPage() {
		PageFactory.initElements(driver, this);
	}
	// ******************Page Actions/Functions************************//

	public void taskpagenavi() {
		
		Tasklink.click();
		
		
	}
	
	public void AddNew() {
		Addnew.click();
	}
	
	public void Addnewcustomer() {
		
	 NewCustomer.click();
	}
	public void newcustomername(String newcustomer) {
		
		NewCustName.sendKeys(newcustomer);
	}
	
	
	
	
	
	
}
