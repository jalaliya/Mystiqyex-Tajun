package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
    
	
  WebDriver driver=new ChromeDriver();
  driver.get("https://leafground.com/select.xhtml");
  WebElement firstDropdownbox=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
  Select select=new Select(firstDropdownbox);
  
  //selecting by index
  select.selectByIndex(1);
  //selecting by visible text
  select.selectByVisibleText("Selenium");
  //printing the number of options in dropdown
  List<WebElement> listOfOptions=select.getOptions();
  System.out.println(listOfOptions.size());
 //using send keys to select dropdown
  firstDropdownbox.sendKeys("Playwright");
  //doing multiselecting in dropdown
  WebElement multiSelect=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
  Select select1=new Select(multiSelect);
select1.selectByIndex(1);
   

	}

}
