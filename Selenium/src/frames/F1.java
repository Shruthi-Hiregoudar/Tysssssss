package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		
		//driver.switchTo().frame("globalSqa");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("books");

	}

}
