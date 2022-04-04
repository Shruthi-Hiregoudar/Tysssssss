package actionsss;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class An1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		
		Actions a= new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		a.moveToElement(ele).click().build().perform();
		
		WebElement cellphone =driver.findElement(By.xpath("//a[contains(text()='Cell phones')]"));
		a.moveToElement(cellphone).click().perform();
		
		

	}

}
