package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
//WebDriver driver=new ChromeDriver();
//driver.get("http://zero.webappsecurity.com/login.html");
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
//driver.findElement(By.id("user_login")).sendKeys("jalalaiya");
//driver.findElement(By.id("user-pwd")).sendKeys("password");
//driver.findElement(By.id("submit")).click();
//String actual="Zero-Account summary";
//String expected=driver.getTitle();

//WebDriver driver=new ChromeDriver();
//driver.get("http://www.google.com");
//driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
//driver.quit();


//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Downloads\\drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
//WebDriver driver=new FirefoxDriver();
//driver.get("http://www.google.com");

WebDriver driver=new ChromeDriver();
driver.get("https://leafground.com/link.xhtml");
// driver.findElement(By.linkText("Go to Dashboard")).click();
driver.findElement(By.partialLinkText("Dashboard")).click();


System.setProperty("Webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver1=new ChromeDriver();
driver1.getTitle();
driver1.manage().window().maximize();
String title=driver1.getTitle();

}
}