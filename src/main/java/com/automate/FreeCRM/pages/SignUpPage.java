package com.automate.FreeCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automate.FreeCRM.base.TestBase;
import com.automate.FreeCRM.utilities.ExcelReader;
import com.automate.FreeCRM.utilities.TestUtil;

public class SignUpPage extends TestBase {

	ExcelReader excel = new ExcelReader(prop.getProperty("DataSheetLocation"));

	public SignUpPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='payment_plan_id']")
	WebElement edition;

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='surname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='email_confirm']")
	WebElement emailConfirm;

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='passwordconfirm']")
	WebElement passwordConfirm;

	@FindBy(xpath = "//input[@type='checkbox' and @name ='agreeTerms']")
	WebElement agreeChkBtn;

	@FindBy(xpath = "//button[@type='submit' and @name ='submitButton']")
	WebElement submitBtn;

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


	@FindBy(xpath = "//select[@name='country' ]")
	WebElement companyDrpDwn;

	@FindBy(xpath = "//button[@type='submit' and @name='btnSubmit']")
	WebElement continueBtn;

	public void Register() {

		// int columnCount = excel.getColumnCount(prop.getProperty("UserDataSheet"));
		System.out.println("Dropdown value------------------" + edition.getText());
		int RowCount = excel.getRowCount(prop.getProperty("UserDataSheet"));
		System.out.println("Row count---------" + RowCount);

		Select editionDrpDwn = new Select(edition);
		editionDrpDwn.selectByValue("1");

		// Fill in the form of new registration

		firstName.sendKeys(excel.getCellData(prop.getProperty("UserDataSheet"), "FirstName", 2));
		lastName.sendKeys(excel.getCellData(prop.getProperty("UserDataSheet"), "LastName", 2));
		email.sendKeys(excel.getCellData(prop.getProperty("UserDataSheet"), "Email", 2));
		emailConfirm.sendKeys(excel.getCellData(prop.getProperty("UserDataSheet"), "ConfirmEmail", 2));
		username.sendKeys(excel.getCellData(prop.getProperty("UserDataSheet"), "UserName", 2));
		password.sendKeys(excel.getCellData(prop.getProperty("UserDataSheet"), "Password", 2));
		passwordConfirm.sendKeys(excel.getCellData(prop.getProperty("UserDataSheet"), "ConfirmPassword", 2));
		TestUtil.clickOn(driver, agreeChkBtn, 10);
		TestUtil.clickOn(driver, submitBtn, 10);
		
		//Fill in company details
		
		companyName.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "Company", 2));
		phone.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "Phone", 2));
		companyEmail.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "Email", 2));
		description.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "Description", 2));
		address.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "Address", 2));
		city.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "City", 2));
		state.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "State", 2));
		postcode.sendKeys(excel.getCellData(prop.getProperty("CompanyDataSheet"), "ZipCode", 2));
		
		Select countryDrpDwn = new Select (companyDrpDwn);
		countryDrpDwn.selectByValue(excel.getCellData(prop.getProperty("CompanyDataSheet"), "Country", 2));
		
		
		TestUtil.clickOn(driver, continueBtn, 10);
		
		

		/*
		 * System.out.println(excel.getCellData(prop.getProperty("UserDataSheet"),
		 * "FirstName", 2));
		 * System.out.println(excel.getCellData(prop.getProperty("UserDataSheet"),
		 * "LastName", 2));
		 * System.out.println(excel.getCellData(prop.getProperty("UserDataSheet"),
		 * "Email", 2));
		 * System.out.println(excel.getCellData(prop.getProperty("UserDataSheet"),
		 * "ConfirmEmail", 2));
		 * System.out.println(excel.getCellData(prop.getProperty("UserDataSheet"),
		 * "UserName", 2));
		 * System.out.println(excel.getCellData(prop.getProperty("UserDataSheet"),
		 * "Password", 2));
		 * System.out.println(excel.getCellData(prop.getProperty("UserDataSheet"),
		 * "ConfirmPassword", 2));
		 */

	}

}
