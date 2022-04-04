package synchronisation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sy6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    	WebDriver	driver =new ChromeDriver();
       driver.get("https://www.google.co.in/");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       List<WebElement> elements = driver.findElements(By.xpath("//a"));
       
       System.out.println(elements);
       int count = elements.size();
       
       System.out.println(count);
       
       
       for(WebElement w:elements)
       {
    	   String s=w.getText();
    	   System.out.println(s);
       }
       

	}

}
