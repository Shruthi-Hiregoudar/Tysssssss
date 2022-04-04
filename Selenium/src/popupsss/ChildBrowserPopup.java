package popupsss;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		
		Set<String> listofwindow = driver.getWindowHandles();
		System.out.println("list of windows "+listofwindow);
		
		for(String wss: listofwindow)
		{
			if(!wss.equals(parentwindow))
			{
				driver.switchTo().window(wss);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin");
			}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	}

}
