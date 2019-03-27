package com.automate.FreeCRM.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automate.FreeCRM.base.TestBase;
import com.automate.FreeCRM.pages.CalendarPage;
import com.automate.FreeCRM.pages.WelcomePage;

public class CalendarPageTest extends TestBase {

	CalendarPage calendarPage;
	WelcomePage welcomePage;
	

	public CalendarPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		String result = welcomePage.Login("kumarmon", "Kumar@2108");
	}

	@Test
	public void createNewMeeting() {
		calendarPage.createNewMeeting();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
