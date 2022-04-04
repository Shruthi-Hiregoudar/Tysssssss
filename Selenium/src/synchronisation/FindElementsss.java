package synchronisation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
        List<WebElement> webelements = driver.findElements(By.xpath("//a"));
        
        System.out.println(webelements);
        
        
        int cout = webelements.size();
        
        System.out.println(cout);
        
        for(WebElement w:webelements)
        {
        	String s=w.getText();
        	System.out.println(s);
        }
        
        
	}

}
