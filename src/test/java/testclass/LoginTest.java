package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import extentlisteners.TestNGListeners;

public class LoginTest extends TestNGListeners{
	
	@Test(priority = 1)
	public void LoginToGrampower()
	
	{
		
		LoginPage login = new LoginPage(driver);
		
		LoginPage.Sendusername();
		
		//test.info("Entered Username");
		
		LoginPage.Sendpassword();

		
		//test.info("Entered Password");
		
		LoginPage.ClickOnLogin();
		
		test.info("Click on Login Button");
		
		LoginPage.HandlePopupWindow();
		
		test.info("Handle Popup Window");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(priority = 1)
//	public void validateTitle()
//	{
//		LoginPage login = new LoginPage(driver);
//		
//		String title = homepage.getTitleOfPage();
//		
//		test.info("Fetched the title of page");
//		
//		String expected = "Mumbai";
//		
//		boolean ispresent = title.contains(expected);
//		
//		Assert.assertEquals(ispresent, true);
//		
//		test.info("Title of page has been validated");
//		
//	}
//	
//	@Test(priority = 2)
//	public void navToSingleMalt()
//	{
//		homepage.clickOnSpirit();
//		
//		test.info("Clicked on single malt");
//		
//		homepage.navToProductPage();
//		
//		test.info("Navigated to product page");
//	}

}

