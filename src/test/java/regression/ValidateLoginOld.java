package regression;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateLoginOld {
	
	WebDriver driver;
	
	@BeforeMethod

	public void setup()
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@Test
	
	public void validateLogin() throws InterruptedException
	
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rameshkuna96");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ramesh@1610");
		
		//input[@name='login']
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
