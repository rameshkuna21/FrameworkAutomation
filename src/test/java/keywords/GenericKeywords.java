package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords extends BaseTest {

	public void openBrowser() {

		String browserName = configProp.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("firefox"))
		{

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} 
		else if (browserName.equalsIgnoreCase("edge")) 
		{

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		}

		driver.get(configProp.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitWait"))));

	}
	
	
	public void type(String locatorKey, String text)
	{
		getElement(locatorKey).sendKeys(text);
	}
	
	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public WebElement getElement(String locatorKey)
	{
		WebElement element=null;
		
		element=driver.findElement(getLocator(locatorKey));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
		return element;
	}
	
	public By getLocator(String locatorKey)
	{
		By by=null;
		
		if(locatorKey.endsWith("_id"))
		{
			by=By.id(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_name"))
		{
			by=By.name(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_name"))
		{
			by=By.linkText(locatorsProp.getProperty(locatorKey));
		}
		else
		{
			by=By.xpath(locatorsProp.getProperty(locatorKey));
		}
		
		return by;
				
	}
	
	public void selectOptionFromDropdown(String locatorKey,String option)
	{
		new Select(getElement(locatorKey)).selectByVisibleText(option);
	}

	public void clear(String locatorKey)
	{
		getElement(locatorKey).clear();
	}
}