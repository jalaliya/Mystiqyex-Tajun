package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmSendingFromFeatureDefinition {
	WebDriver driver;

@Given("browser is the open")
public void browser_is_the_open() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
}

@Given("User is on login page of the OrangeHRM")
public void user_is_on_login_page_of_the_orange_hrm() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("User enters valid username {string} and password {string}")
public void user_enters_valid_username_and_password(String string, String string2) {
	  driver.findElement(By.name("username")).sendKeys(string);
			//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		  driver.findElement(By.name("password")).sendKeys(string2);
}

@When("clicks the login button")
public void clicks_the_login_button() {
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}

@Then("User should be taken to  thehomePage")
public void user_should_be_taken_to_thehome_page() {
	String title=driver.getCurrentUrl();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", title);
}



}
