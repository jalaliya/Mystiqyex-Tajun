package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class OldNavyDefinitions {
	
	WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("User is on old navy home Page {string}")
	public void user_is_on_old_navy_home_page(String url) {
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.navigate().refresh();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("User enters search item {string} in serach button")
	public void user_enters_search_item_in_serach_button(String searchItem) {
		    WebElement searchBox=driver.findElement(By.name("searchText"));
			searchBox.sendKeys(searchItem);
			searchBox.sendKeys(Keys.RETURN);
	 
	}

	@Then("User have to select second item from the items displayed")
	public void user_have_to_select_item_from_the_items_displayed() {
		WebElement wantedItem=driver.findElement(By.xpath("//*[@id=\"498771022\"]/a/img"));
		wantedItem.click();
	}

	@Then("User have to select the size")
	public void user_have_to_select_the_size() {
		//selecting size M
		driver.findElement(By.id("variant-1-sizeDimension1-M")).click();
	}

	@Then("User clicks Add to Bag button")
	public void user_clicks_add_to_bag_button() {
		driver.findElement(By.id("AddToBagWithPrice")).click();
	}

	@Then("User clicks checkout")
	public void user_clicks_checkout() {
		driver.findElement(By.id("checkoutButton")).click();
	}

	@Then("again User clicks Checkout")
	public void again_user_clicks_checkout() throws InterruptedException {
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("size:"+size);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement checkOut=wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout-button")));
		checkOut.click();
		Thread.sleep(1000);
	}

	@Then("verify whether the User is in the sign in page.")
	public void verify_whether_the_user_is_in_the_sign_in_page() throws InterruptedException {
	 
	   String title=driver.getTitle();
	   System.out.println("Title:"+title);
	   Assert.assertEquals(title, "Sign in | Old Navy ");
		/*
		 * boolean status=
		 * driver.findElement(By.id("acc-verifyEmailAddress")).isDisplayed(); if(status)
		 * { System.out.println("you are in sign in page"); } else {
		 * System.out.println("Not successful"); }
		 */
	   
	  
	 
	}

}
