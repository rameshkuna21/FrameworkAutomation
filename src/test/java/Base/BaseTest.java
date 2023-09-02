package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	
	public FileInputStream fis1;
	public static Properties configProp;
	public FileInputStream fis2;
	public static Properties locatorsProp;
	@BeforeTest
	public void fileSetUp() throws IOException
	{
		 fis1=new FileInputStream("Properties\\config.properties");
		 configProp=new Properties();
		configProp.load(fis1);
		
		 fis2=new FileInputStream("Properties\\locators.properties");
		 locatorsProp=new Properties();
		locatorsProp.load(fis2);
		
		
	}
	
	@AfterTest
	public void fileClose()
	{
		
	}
	
	//@BeforeMethod
	public void setUp() throws IOException
	{
		/*
		 * FileInputStream fis=new FileInputStream("config.properties");
		 * 
		 * Properties pr=new Properties();
		 * 
		 * pr.load(fis);
		 * 
		 * String browserName=pr.getProperty("browser");
		 * 
		 * if(browserName.equalsIgnoreCase("chrome")) {
		 * 
		 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); } else
		 * if(browserName.equalsIgnoreCase("firefox")) {
		 * 
		 * WebDriverManager.firefoxdriver().setup();
		 * 
		 * driver=new FirefoxDriver();
		 * 
		 * } else if(browserName.equalsIgnoreCase("edge")) {
		 * 
		 * WebDriverManager.edgedriver().setup();
		 * 
		 * driver=new EdgeDriver();
		 * 
		 * }
		 * 
		 * driver.get(pr.getProperty("url"));
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(
		 * pr.getProperty("implicitWait"))));
		 */
	}

	//@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
}
