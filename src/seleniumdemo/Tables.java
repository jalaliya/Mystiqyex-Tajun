package seleniumdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://leafground.com/table.xhtml");//change corresponding URL
		
		//to get the number of columns
		List<WebElement> noOfColumns=driver.findElements(By.tagName("td"));
		System.out.println(noOfColumns.size());
		
		//to  get the number of rows
		List<WebElement> noOfRows=driver.findElements(By.tagName("tr"));
		System.out.println(noOfRows.size());
		
		
		//"//td[normalize-space()='learn to interact with elements']//following::td[1]"
		
WebElement getPercent=driver.findElement(By.xpath("//td[normalize-space()='learn to interact with elements']//following::td[1]"));
String percent=getPercent.getText();
System.out.println(percent);


List<WebElement> listOfValues=driver.findElements(By.xpath("//td[2]"));

List<Integer> numberList=new ArrayList<Integer>();

for (WebElement value : listOfValues) {
	String indValue=value.getText().replace("%", "");
	
	numberList.add(Integer.parseInt(indValue));
	
}
int smallValue=Collections.min(numberList);
String smallValueString=Integer.toString(smallValue)+"%";
String finalXpath="//td[normalize-space()="+"\""+smallValueString+ "\""+"]"+"//following::td[1]";
System.out.println(finalXpath);
driver.findElement(By.xpath("finalXpath")).click();

//"//td[normalize-space()='20%']//following::td[1]"

	}

}
