package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement frame=driver.findElement(By.id("Click"));
		frame.click();
		
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		//to come back to original content from frame
		driver.switchTo().defaultContent();
		
		
		//if you want to enter to two frames
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		//to find the number fo times frame has occured
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());
	
	}

}
