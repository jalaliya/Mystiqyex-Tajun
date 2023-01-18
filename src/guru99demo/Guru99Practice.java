package guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Practice {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		//to find by name
		
		  driver.findElement(By.name("firstName")).sendKeys("Tajun");
		  
		  
		  driver.findElement(By.name("lastName")).sendKeys("Malik");
		  //to find by id
		  driver.findElement(By.id("userName")).sendKeys("taj@gmail.com");
		 driver.findElement(By.name("phone")).sendKeys("234667676863");
		 driver.findElement(By.xpath("//input[@maxlength='20']")).sendKeys("208 samuel blvd");
		 driver.findElement(By.name("city")).sendKeys("coppell");
		 driver.findElement(By.name("state")).sendKeys("Texas");
		 driver.findElement(By.name("postalCode")).sendKeys("75019");
		 driver.findElement(By.id("email")).sendKeys("jalaliya malik");
		 driver.findElement(By.name("password")).sendKeys("password");
		 driver.findElement(By.name("confirmPassword")).sendKeys("password");
		 driver.findElement(By.name("submit")).click();
		
		/*
		 * //to find by link text driver.findElement(By.linkText("Flights")).click();
		 * 
		 * //to find by partial link text
		 * driver.findElement(By.partialLinkText("Car")).click();
		 */
		
		//to find by xpath
		WebElement dropDown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(dropDown);
		select.selectByVisibleText("ALGERIA");
		
		//select.selectByIndex(2);
		//select.selectByValue("AlGERIA");
		

	}

}
