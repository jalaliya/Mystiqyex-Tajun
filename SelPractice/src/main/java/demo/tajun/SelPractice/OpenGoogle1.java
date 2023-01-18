package demo.tajun.SelPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenGoogle1 {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");

	}

}
