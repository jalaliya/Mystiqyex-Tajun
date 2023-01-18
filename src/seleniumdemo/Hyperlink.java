package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");//change corresponding URL

		
		/*Important:Diff between get and navigate
		get-we cannot refresh or go back,forward
		navigate-we can go back,fwd and do refresh*/
		
		WebElement firstLink=driver.findElement(By.linkText("Go to Dashboard"));
		firstLink.click();
		
		driver.navigate().back();
		
		
		WebElement secondLink=driver.findElement(By.linkText("WebElement firstLink=driver.findElement(By.linkText(\"Go to Dashboard\"));"));
		String whereToGo=secondLink.getAttribute("href");
		System.out.println(whereToGo);
		
		//verify iam broken
		WebElement brokenLink=driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String title=driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("Link is broken");
		}
		else
		{
			System.out.println("not broken link");
		}
		
		driver.navigate().back();
		
		
		//WebElement repeatedLink=driver.findElement(By.linkText("Go to Dashboard"));
		// repeatedLink.click();
		firstLink.click();//we will get exception at this line
		driver.navigate().back();
		
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
	//	Important:staleElement Exception(part-20) 
	}

}
