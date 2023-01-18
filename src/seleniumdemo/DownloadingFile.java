package seleniumdemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");//change corresponding URL
		
		
		WebElement downloadLink=driver.findElement(By.linkText("Download xls"));
		downloadLink.click();
		
		File fileLocation=new File("C:\Users\Dell\Downloads");
		File[] availableFiles=fileLocation.listFiles();
		for (File file : availableFiles) {
			if(file.getName().equals("Download.xls"))
			{
				System.out.println("file is downloaded");
				break;
			}
			else {
				System.out.println("File doesn't exist");
			}
			
		}
		
		

	}

}
