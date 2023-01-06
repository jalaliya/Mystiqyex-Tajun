package seleniumdemo;



import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
         
		
		 WebDriver driver=new ChromeDriver();
         driver.get("https://leafground.com/button.xhtml");
         
 		//just clicking the button
        // driver.findElement(By.id("j_idt88:j_idt90")).click();
         
         
         //Trying another way of storing using webElement
//         WebElement locatingButton=  driver.findElement(By.id("j_idt88:j_idt90"));
//         locatingButton.click();
         
         //to get the position of button using point class
//        Point buttonPosition=locatingButton.getLocation();
//        int xValue= buttonPosition.getX();
//        int yValue=buttonPosition.getY();
//        System.out.println("X value:" +xValue + "Y value is:" +yValue);
       
        
        //to find the button colour
      // WebElement findButtonColor= driver.findElement(By.id("j_idt88:j_idt96"));
//      String colorName= findButtonColor.getCssValue("background-color");
//      System.out.println(colorName);
//      System.out.println("Color is:" +colorName);
        
      
      //to find the height and width of button
     WebElement heightWidthofButon= driver.findElement(By.id("j_idt88:j_idt94"));
     int heightofButton=heightWidthofButon.getSize().height;
     int widthofButton=heightWidthofButon.getSize().width;
     System.out.println("Height :" +heightofButton);
     System.out.println("Height :" +widthofButton);
     
     
     
     
	}

}
