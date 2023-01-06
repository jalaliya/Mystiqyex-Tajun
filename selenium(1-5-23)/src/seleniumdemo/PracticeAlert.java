package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		//simple Alert
        driver.get("https://leafground.com/alert.xhtml");
        
        driver.findElement(By.id("j_idt88:j_idt91")).click();
        
        Alert alert=driver.switchTo().alert();
        alert.accept();

        
        //prompt Alert
        WebElement promptAlert=driver.findElement(By.id("j_idt88:j_idt93"));
        promptAlert.click();
        Alert proAlert=driver.switchTo().alert();
        proAlert.sendKeys("Tajun");
        proAlert.dismiss();
        
        
        //confirm Alert
        
        WebElement confirmAlert=driver.findElement(By.id("j_idt88:j_idt93"));
        confirmAlert.click();
        Alert cfmAlert=driver.switchTo().alert();
        cfmAlert.dismiss();
        
        
	}

}
