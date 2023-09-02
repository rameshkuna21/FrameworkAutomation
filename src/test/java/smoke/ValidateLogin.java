package smoke;

import org.testng.annotations.Test;

import Base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLogin extends BaseTest {
	
	@Test
	public void validateLoginTest() throws InterruptedException
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.type("usernameTextBox", "rameshkuna96");
		
		Thread.sleep(3000);
		
		app.type("passwordTextBox", "Ramesh@1610");
		
		Thread.sleep(3000);
		
		app.click("loginButton");
		
		Thread.sleep(3000);
		
	}

}