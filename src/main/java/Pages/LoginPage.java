package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='LOG IN']")
	private WebElement login;
	
	@FindBy(xpath = "//button[@id='onesignal-slidedown-cancel-button']")
	private WebElement popupwindow;

	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
		
	}
	
	public void Sendusername() {
		
		username.click();
		
		username.sendKeys("automationuser");
		
		password.click();
		
	
		
	}
	
	public void Sendpassword() {
		
		password.click();
		
		password.sendKeys("grampower");
		
		password.click();
		
	}
	
	public void ClickOnLogin(){
		
		login.click();
		
		login.click();
		
		//Thread.sleep(100);
		
	}
	
	public void HandlePopupWindow() {
		
		popupwindow.click();
		
	}
	
	
	
//	public String getTitleOfPage()
//	{
//		String titleofpage = driver.getTitle();
//		
//		return titleofpage;
//	}
	
}
