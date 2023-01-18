package seleniumdemo;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://leafground.com/window.xhtml");
		
		String parentWindow=driver.getWindowHandle();
		WebElement closeWindows=driver.findElement(By.id("j_idt88:j_idt93"));
		closeWindows.click();
		Set<String> setofWindows=driver.getWindowHandles();
		for (String windows : setofWindows) {
			if(!windows.equals(parentWindow))
			{
				driver.switchTo().window(windows);
				driver.close();
			}
		}
		
//		WebElement firstCheck=driver.findElement(By.id("j_idt88:new"));
//		firstCheck.click();
//		
		//New Window opens
//		Set<String> setofWindows=driver.getWindowHandles();
//		int numofWindowsOpened=setofWindows.size();
//		System.out.println(numofWindowsOpened);
//		for(String window :setofWindows)
//		{
//			driver.switchTo().window(window);
//			
//		}
		
	
//		
//		System.out.println(driver.getWindowHandle());
//		driver.close();
//		
//		driver.switchTo().defaultContent();
		
	
	
	
	
	
	}

}
