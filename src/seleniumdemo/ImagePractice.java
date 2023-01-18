package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");//change corresponding URL
		//Interview Question
		//to find borken Image
		//find natural width
		//if it is equal to zero,then it is broken
		
		WebElement image=driver.findElement(By.name("filename"));
		if(image.getAttribute("naturalwidth").equals("0"))
{
	System.out.println("Image is broken");
}
else {
	System.out.println("Image not broken");
}
		
		
	}

}
