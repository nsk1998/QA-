package testclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Pages.LoginPage;
import Pages.ProductPage;
//import utility.ConfigReader;

public class BaseTest {

	public static WebDriver driver;
	public LoginPage LoginPage;
	
//	public ProductPage productpage;
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
//		ConfigReader cr = new ConfigReader();
		
		String browsername = ("edge");
		{
		driver = new EdgeDriver();
		}
		
		 String url = ("https://data.grampower.com/hes/");
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	public void createObject()
	{
		LoginPage = new LoginPage(driver);
//		 productpage = new ProductPage(driver);
	}
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.quit();
//	}

}

