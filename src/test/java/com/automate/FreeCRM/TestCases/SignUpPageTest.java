package com.automate.FreeCRM.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automate.FreeCRM.base.TestBase;
import com.automate.FreeCRM.pages.SignUpPage;
import com.automate.FreeCRM.pages.WelcomePage;

public class SignUpPageTest extends TestBase {

	SignUpPage signUpPage;

	public SignUpPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		signUpPage = new SignUpPage();
		WelcomePage welcomePage = new WelcomePage();
		welcomePage.SignUp();
		driver.findElement(By.xpath("//input[contains(text(),'search')]"));
		Actions action = new Actions(driver);
		
		
	
	}

	@Test
	public void RegisterNewUser() {

		signUpPage.Register();

	}

}
