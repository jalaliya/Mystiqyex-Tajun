package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletePractice {

	public static void main(String[] args) {
		// practice for AutoComplete
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");//change corresponding URL
		
		WebElement textBox=driver.findElement(By.id("textbox"));
		textBox.sendKeys("s");
		
		List<WebElement> listOfCourses=driver.findElements(By.xpath("//*[@id=\\'j_idt87:console2\\']/tbody/tr/td[1]/div/div[2]/li"));
		
	for (WebElement course : listOfCourses) {
		
		if(course.getText().equals("Selenium"))
		{
			course.click();
			break;
		}
		
	}

	}

}
