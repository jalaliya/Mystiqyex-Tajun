package openMrs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMrsDemo {
	
	public static void main(String args[])
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		//*[@id="Pharmacy"]
		
		
		driver.findElement(By.xpath("//*[@id='Pharmacy']")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Find Patient Record')]")).click();
		
		//using list
		/*
		 * List<WebElement> myList=driver.findElements(By.xpath("//*[@id=\"apps\"]/a"));
		 * System.out.println(myList.size());
		 * 
		 * for(WebElement element:myList) { if(myList.contains("Reports ")) {
		 * element.click(); } }
		 */

	}

}
