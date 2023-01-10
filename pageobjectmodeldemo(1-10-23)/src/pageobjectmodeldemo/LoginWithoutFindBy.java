package pageobjectmodeldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginWithoutFindBy {

	
	public static WebElement txtUserName;
	public static WebElement txtpssword;
	public static WebElement btnlogin;
	
	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/calendar.xhtml");//change corresponding URL
		
		
		 PageFactory.initElements(driver, LoginWithoutFindBy.class);
		 txtUserName.sendKeys("Admin1");
		 txtpssword.sendKeys("password");
		 btnlogin.click();
		 
		 
		 
	}
}
