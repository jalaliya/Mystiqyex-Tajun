package pageobjectmodeldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.LoginPage;
import pageobjects.UpdateProfile;

public class LoginCase {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");//change corresponding URL
		
		/*
		 * 
		 * LoginPage.email(driver).sendKeys("user@phptravels.com");
		 * LoginPage.password(driver).sendKeys("demouser");
		 * LoginPage.loginButton(driver).click();
		 */
		
		PageFactory.initElements(driver, LoginPage.class);
	
		LoginPage.email.sendKeys("user@phptravels.com");
		LoginPage.password.sendKeys("demouser");
		LoginPage.loginButton.click();
	    
	   
		
	}}