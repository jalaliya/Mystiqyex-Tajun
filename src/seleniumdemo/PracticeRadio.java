package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
    
	
  WebDriver driver=new ChromeDriver();
  driver.get("https://leafground.com/radio.xhtml");
  
  
  //Finding the default selected radio button
  WebElement defaultRadio1=driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[1]/div/div[2]"));
  boolean chromeSelected=defaultRadio1.isSelected();
  System.out.println(chromeSelected);
  
  
  WebElement defaultRadio2=driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[2]/div/div[2]"));
  boolean firefoxSelected=defaultRadio2.isSelected();
  System.out.println(firefoxSelected);
  
  
  WebElement defaultRadio3=driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div/div[2]"));
  boolean safariSelected=defaultRadio3.isSelected();
  System.out.println(safariSelected);
  
  WebElement defaultRadio4=driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[4]/div/div[2]"));
  boolean edgeSelected=defaultRadio4.isSelected();
  System.out.println(edgeSelected);
  
  
   
  

	}

}
