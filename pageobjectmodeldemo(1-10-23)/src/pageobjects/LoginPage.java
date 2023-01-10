package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class LoginPage {
	
	
	/*
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.name("password"));
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement loginButton(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
	 * 
	 * }
	 * 
	 * public static WebElement email(WebDriver driver) { return
	 * driver.findElement(By.name("email")); }
	 */
	
@FindBy(name="email")
public static WebElement email;
@FindBy(name="password")
public static WebElement password;
@FindBy(xpath="//*[@id=\\'fadein\\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
public static WebElement loginButton;






}
