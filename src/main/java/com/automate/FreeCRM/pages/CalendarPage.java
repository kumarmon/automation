package com.automate.FreeCRM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automate.FreeCRM.base.TestBase;

public class CalendarPage extends TestBase {

	@FindBy(xpath = "//input[@name='title']")
	WebElement eventTitle;

	@FindBy(xpath = "//img[@id='f_trigger_c_start']")
	WebElement startDateImg;

	@FindBy(xpath = "//select[@name='category']")
	WebElement meetingCategory;

	@FindBy(xpath = "//select[@name='assigned_to_user_id_src']")
	WebElement assignedTo;

	@FindBy(xpath = "//input[@type='button' and @value='==ADD==>']")
	WebElement rightArrowAdd;

	/*
	 * @FindBy(xpath="//input[@type='radio' and @name='confirmed']") WebElement
	 * confirmation;
	 */

	@FindBy(xpath = "//textarea[@name='location']")
	WebElement locationTxtArea;

	@FindBy(xpath = "//textarea[@name='notes']")
	WebElement NotesTxtArea;
	
	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}

	public void createNewMeeting() {

		
		//switch to main panel frame
		driver.switchTo().frame("mainpanel");
		
		//Fill Title of meeting
		eventTitle.sendKeys("Team meeting");
		
		//select meeting category
		Select selectMeetingCategory = new Select(meetingCategory);
		selectMeetingCategory.selectByValue("Critical");
		rightArrowAdd.click();
		

		//select assigned person
		Select assignedPerson = new Select(assignedTo);
		assignedPerson.selectByVisibleText("Monu Kumar");

		//Select confirmed or not -- Handling Radio Button
		List<WebElement> confirmedRdioBtn = driver
				.findElements(By.xpath("//input[@type='radio' and @name='confirmed']"));
		int size = confirmedRdioBtn.size();
		for (int i = 0; i <= size; i++) {
			String value = confirmedRdioBtn.get(i).getAttribute("value");
			if (value == "N") {
				confirmedRdioBtn.get(i).click();
			} else {
				break;
			}
		}
		
		

	}

}
