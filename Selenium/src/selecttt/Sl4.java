package selecttt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shruthi/Downloads/dropDown%20(1).html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='m1']"));
		
         Select s= new Select(dropdown);
         List<WebElement> sortby = s.getOptions();
         
         for(int i=0;i<sortby.size();i++)
         {
        	 WebElement w = driver.findElement(By.xpath("//select[@id='m1']"));
        	 Select s1= new Select(w);
        	 s1.selectByIndex(i);
        	 
        	 
         }
   
         

	}

}
