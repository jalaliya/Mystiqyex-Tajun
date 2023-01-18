package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		WebElement name=driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("Tajun");
		//driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Malik");//using Id
		driver .findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).sendKeys(" Coppell");//using x path
		
		String textValue=driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(textValue);
		
		

		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		

	}

}
