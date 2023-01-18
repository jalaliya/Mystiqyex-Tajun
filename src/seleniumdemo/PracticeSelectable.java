package seleniumdemo;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");//change URL 
		
		
		//use findElements
		List<WebElement> selectable=driver.findElements(By.xpath)//copy xpath
				System.out.println(selectable.size());
		
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();

		
		//simplest way
		
		Actions actionss=new Actions(driver);
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.build().perform();
		
		
	}

}
