package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLeafGround {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		
		WebElement findTextbox=driver.findElement(By.id("j_idt88:j_idt95"));
		findTextbox.clear();

		
		WebElement checkEnabled=driver.findElement(By.id("j_idt88:j_idt93"));
		boolean result=checkEnabled.isEnabled();
		System.out.println(result);
		
		
	}

}
