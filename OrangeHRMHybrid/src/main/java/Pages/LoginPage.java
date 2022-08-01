package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class LoginPage extends TestBase 
{
	//Page Factory
	@FindBy (xpath="//input[@name='txtUsername']")
	WebElement username;
	
	@FindBy (xpath="//input[@name='txtPassword']")
	WebElement password;
	
	@FindBy (xpath="//input[@name='Submit']")
	 WebElement submitbtn;
	
	@FindBy (xpath = "//div[@id='divLogo']/img")
	 WebElement CRMLogo;
	
	//Constructor
	public LoginPage()
	{
		//Initialization of element 
		//Driver -for driver
		//this- for current class objects.
		PageFactory.initElements(getDriver(), this);
	}
	
	//Action Declaration
	public String ValidateTitle()
	{
		return getDriver().getTitle();
	}
	
	public boolean ValidateLogo()
	{
		return CRMLogo.isDisplayed();
	}
	
	public Dashboard ValidateLoginCredintials(String un,String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		submitbtn.click();
		
		return new Dashboard();
	} 
}

