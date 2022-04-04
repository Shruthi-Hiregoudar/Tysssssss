package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		 
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();
		 

	}

}
