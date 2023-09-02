package smoke;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import keywords.ApplicationKeywords;
import utils.UtilKit;

public class ValidateSearchHotel extends BaseTest {
	
	
	@Test(dataProvider = "getData")
	public void validateSearchHotelTest(HashMap<String, String> dataMap) throws InterruptedException
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
app.openBrowser();
		
		app.type("usernameTextBox", dataMap.get("username"));
		app.type("passwordTextBox", dataMap.get("password"));
		app.click("loginButton");
		Thread.sleep(3000);
		app.validateTitle(dataMap.get("Expected Title1"));
		
		app.selectOptionFromDropdown("locationDropdown", dataMap.get("Location"));
		Thread.sleep(3000);
		app.selectOptionFromDropdown("hotelsDropdown", dataMap.get("Hotels"));
		app.selectOptionFromDropdown("roomTypeDropdown", dataMap.get("Room Type"));
		app.selectOptionFromDropdown("noOfRoomsDropdown", dataMap.get("Number of Rooms"));
		app.clear("checkInDateTextbox");
		app.type("checkInDateTextbox", dataMap.get("Check In Date"));
		
		app.clear("checkOutDateTextbox");
		app.type("checkOutDateTextbox", dataMap.get("Check Out Date"));
		
		app.selectOptionFromDropdown("adultsPerRoomDropdown", dataMap.get("Adults per Room"));
		app.selectOptionFromDropdown("childrenPerRoomDropdown", dataMap.get("Children per Room"));
		
		app.click("searchButton");
		
		Thread.sleep(3000);
		
		app.validateTitle(dataMap.get("Expected Title2"));
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
					
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestData("TC-102");;
		
		return data;
		
		
		
	}
}
