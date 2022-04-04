package selecttt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sl1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shruthi/Downloads/dropDown%20(1).html");
		
		WebElement dropdownmwnu=driver.findElement(By.xpath("//select[@id='s1']"));
		
		Select s=new Select(dropdownmwnu);
		Thread.sleep(2000);
		s.selectByVisibleText("Project");
		}

}
