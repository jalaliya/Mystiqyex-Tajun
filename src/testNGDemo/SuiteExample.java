package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@Test
	public void openGoogle()
	{
		//long startTime=System.currentTimeMillis();
		
		driver.get("https://www.google.com/");
		//driver.close();
		//long endTime=System.currentTimeMillis();
		//long timeTaken=startTime-endTime;
		//System.out.println("Total time:" +timeTaken);
	}
	
	@Test
	public void openBing()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		//driver.close();
	}
	
	
	@Test
	public void openYahoo()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}

}
