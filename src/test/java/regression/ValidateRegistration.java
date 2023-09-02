package regression;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import utils.UtilKit;

public class ValidateRegistration extends BaseTest {
	
	@Test(dataProvider="getData")
	
	public void ValidateRegistrationTest( HashMap<String, String> dataMap) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataMap.get("Username"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataMap.get("Password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(dataMap.get("Confirm Password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(dataMap.get("Full Name"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(dataMap.get("Email Address"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(dataMap.get("Captcha Text"));
		Thread.sleep(3000);
	}
	
	@DataProvider
	
	public Object[][]getData() throws IOException
	{
     HashMap<String, String>  hMap=UtilKit.getTestData("Tc-101");
		
		Object[][] data=new Object[1][1];
		
		data[0][0]=hMap;
		
		return data;
	}

}
