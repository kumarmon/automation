package com.automate.FreeCRM.TestCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automate.FreeCRM.base.TestBase;
import com.automate.FreeCRM.pages.SignUpPage;
import com.automate.FreeCRM.pages.WelcomePage;
import com.automate.FreeCRM.utilities.DataOperations;
import com.automate.FreeCRM.utilities.ExcelReader;

public class WelcomePageTest extends TestBase {

	WelcomePage welcomepage;
	SignUpPage signupPage;
	DataOperations dataOps;
	ExcelReader excelObj = new ExcelReader(prop.getProperty("DataSheetLocation"));

	public WelcomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		welcomepage = new WelcomePage();
	}

	@Test(priority = 1)
	public void welcomePageTitleTest() {

		String welcomePageTitle = welcomepage.validateWelcomePageTitle();
		Assert.assertEquals(welcomePageTitle, "Free CRM software in the cloud powers sales and customer service");
	}

	@Test(dataProvider = "getLoginData", priority = 2)
	public void LoginTest(String username, String password) {
		welcomepage.Login(username, password);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider
	public Iterator<Object[]> getLoginData() {
		//ArrayList<Object[]> loginTestData = dataOps.getLoginData();

		ArrayList<Object[]> loginObj = new ArrayList<Object[]>();

		int loginDatarowCount = excelObj.getRowCount(prop.getProperty("LoginDataSheet"));

		for (int rowcount = 2; rowcount <= loginDatarowCount; rowcount++) {
			String loginUsername = excelObj.getCellData(prop.getProperty("LoginDataSheet"), "LoginUserName", rowcount);
			String loginPassword = excelObj.getCellData(prop.getProperty("LoginDataSheet"), "LoginPassword", rowcount);
			Object ob[] = { loginUsername, loginPassword };
			loginObj.add(ob);
		}
		return loginObj.iterator();

	}

}
