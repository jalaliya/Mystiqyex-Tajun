package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonDefinitions {
	
	WebDriver driver;
	
	
	@Given("User is in amazon site")
	public void user_is_in_amazon_site() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.get("http://www.amazon.com");
	   
	}

	@When("user types in search button")
	public void user_types_in_search_button() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("school bag");
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	 
	}

	@Then("products are displayed")
	public void products_are_displayed() {
boolean status=driver.findElement(By.partialLinkText("Backpack")).isDisplayed();
if(status)
{
	System.out.println("Items are displayed successfully");
}
	}



}
