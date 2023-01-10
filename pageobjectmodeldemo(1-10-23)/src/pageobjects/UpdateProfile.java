package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfile {
	
	/*
	 * public static WebElement myProfile(WebDriver driver) { return
	 * driver.findElement(By.linkText("user@phptravels.com"));
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement phone(WebDriver driver) { return
	 * driver.findElement(By.name("phone")); }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city")); }
	 * 
	 * public static WebElement updateProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"
	 * )); }
	 */

	
	
@FindBy(linkText="user@phptravels.com")
public static WebElement myProfile;
@FindBy(name="phone")
public static WebElement phone;
@FindBy(xpath="//*[@id=\\'fadein\\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
public static WebElement updateProfile;
@FindBy(name="city")
public static WebElement city;
	
	
}
