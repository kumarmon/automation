package com.automate.FreeCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automate.FreeCRM.base.TestBase;
import com.automate.FreeCRM.utilities.TestUtil;

public class WelcomePage extends TestBase {

	// define Page factory -- Object Repository

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//a[contains(text(), 'Sign Up')]")
	WebElement signUp;
	


	

	// initialize WebElements with the help of page factory
	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateWelcomePageTitle() {
		return driver.getTitle();
	}

	public SignUpPage SignUp() {
		
		TestUtil.clickOn(driver,signUp,10);
		return new SignUpPage();
	}
	
	public String Login(String loginUsername, String loginPassword) {
		 username.sendKeys(loginUsername);
		password.sendKeys(loginPassword);
		TestUtil.clickOn(driver, submitButton, 10);
		return "SUCCESS";
		
	}

}
