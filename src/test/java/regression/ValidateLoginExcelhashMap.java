package regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import utils.UtilKit;

public class ValidateLoginExcelhashMap extends BaseTest {
	
	@Test(dataProvider="getData")
	
public void ValidateLoginTest1(HashMap<String, String> dataMap) throws InterruptedException
{
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataMap.get("username"));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataMap.get("password"));
		
		//input[@name='login']
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), dataMap.get("Expected Title"));

}
	
	@DataProvider
	public Object[][]getData() throws IOException
	
	{
		HashMap<String, String>  hMap=UtilKit.getTestData("Tc-100");
		
		Object[][] data=new Object[1][1];
		
		data[0][0]=hMap;
		
		return data;
	}
	}
