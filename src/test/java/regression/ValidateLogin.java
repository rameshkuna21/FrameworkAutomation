package regression;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseTest;

public class ValidateLogin extends BaseTest {
	
	@Test
public void ValidateLoginTest() throws InterruptedException
{
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rameshkuna96");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ramesh@1610");
		
		//input[@name='login']
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Thread.sleep(3000);
}
	

}
