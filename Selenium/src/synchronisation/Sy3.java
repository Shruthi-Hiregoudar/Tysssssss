package synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	
		WebDriverWait wait=new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Register']")));
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		
	}

}
