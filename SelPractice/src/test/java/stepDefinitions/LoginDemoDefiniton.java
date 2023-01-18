package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoDefiniton {
	
	WebDriver driver;
	@Given("browser is the open condition")
	public void browser_is_the_open_condition() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	  driver.get("https://example.testproject.io/web/");
	}

	/*
	 * @When("User  the enters username and password") public void
	 * user_the_enters_username_and_password() {
	 * driver.findElement(By.id("name")).sendKeys("Tajun Jalaliya");
	 * driver.findElement(By.id("password")).sendKeys("12345"); }
	 */
	

@When("User  the enters username {string} and password {string}")
public void user_the_enters_username_and_password(String string, String string2) {
	 driver.findElement(By.id("name")).sendKeys("string");
	  driver.findElement(By.id("password")).sendKeys("string2"); 
	  }



	@When("clicks Login button")
	public void clicks_login_button() {
	    driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		boolean status=driver.findElement(By.id("logout")).isDisplayed();
		if(status)
		{
			System.out.println("You are successfully in next page");
		}
		
		driver.quit();
	   
	}

	
}
