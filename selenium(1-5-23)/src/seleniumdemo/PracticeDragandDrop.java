package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		
		WebElement To=driver.findElement(By.id("form:drop_header"));
		WebElement From=driver.findElement(By.id("form:drag_content"));
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		//simplest way
		actions.dragAndDrop(From, To).build().perform();

	}

}
