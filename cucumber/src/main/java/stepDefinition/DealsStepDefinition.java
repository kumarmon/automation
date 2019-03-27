/*package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefinition {
	
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_on_login_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONU KUMAR\\Documents\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");

	}
	
	@When("^title of login page is Free CRM$")
	public void title_Login_Page_FreeCRM() {
		
		String title=driver.getTitle();
		System.out.println("Title of Page" + "  "+ title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable data)  {
		List<List<String>> credentials = data.raw();
	    driver.findElement(By.name("username")).sendKeys(credentials.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(credentials.get(0).get(1));
	   
	}
	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button()  {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	    
	}
	
	@Then("^User is on HomePage$")
	public void user_is_On_HomePage() {
		String title=driver.getTitle();
		System.out.println("Homepge Title is:" + " " + title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	@Then("^User moves to new deals page$")
	public void user_moves_to_new_contact_page()  {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals)]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	
	
	@Then("^User enters deals data$")
	public void user_enters_deals_data(DataTable data) throws Throwable {
		List<List<String>> dealValues =  data.raw();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
	   
	}
	
	@Then("^close the browser$")
	public void close_the_browser()  {
	    driver.quit();
	}

}
*/