package stepDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

public class DealsMapStepDefinition {

	
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
		// Map<String, String> credentials = data.asMap(String.class,String.class);
		 
		 for ( Map<String, String> cred : data.asMaps(String.class,String.class)) {
			 
			 driver.findElement(By.name("username")).sendKeys(cred.get("username"));
			 driver.findElement(By.name("password")).sendKeys(cred.get("password"));
		}  
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
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	
	
	@Then("^User enters deals data$")
	public void user_enters_deals_data(DataTable data) throws Throwable {
		List<Map<String, String>> dealsdata = data.asMaps(String.class, String.class);

		for (Map<String, String> deal : dealsdata) {

			driver.findElement(By.id("title")).sendKeys(deal.get("title"));
			driver.findElement(By.id("amount")).sendKeys(deal.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(deal.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(deal.get("commission"));

			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); // save button

			// move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

		}

	}
	
	@Then("^close the browser$")
	public void close_the_browser()  {
	    driver.quit();
	}


	
	

}
