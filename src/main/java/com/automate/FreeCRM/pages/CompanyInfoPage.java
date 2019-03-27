package com.automate.FreeCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automate.FreeCRM.base.TestBase;

public class CompanyInfoPage extends TestBase {

	public CompanyInfoPage() {
		super();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='company_name']")
	WebElement companyName;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;

	@FindBy(xpath = "//input[@id='fax']")
	WebElement fax;

	@FindBy(xpath = "//input[@id='website']")
	WebElement website;

	@FindBy(xpath = "//input[@id='company_email']")
	WebElement companyEmail;

	@FindBy(xpath = "//textarea[@id='service']")
	WebElement description;

	@FindBy(xpath = "//textarea[@id='address']")
	WebElement address;

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	@FindBy(xpath = "//input[@id='state']")
	WebElement state;

	@FindBy(xpath = "//input[@id='postcode']")
	WebElement postcode;

	@FindBy(xpath = "//input[@id='postcode']")
	WebElement country;
	
	@FindBy(xpath ="//input[@type='checkbox' and @name='copy_address']")
	WebElement companyChkBox;
	
	@FindBy(xpath="//button[@type='submit' and @name='btnSubmit']")
	WebElement continueBtn;
	
	

}
