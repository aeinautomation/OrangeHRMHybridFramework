package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class LogoutPage extends TestBase
{
	@FindBy (xpath="//div[@id='wrapper']/div/a[2]")
	WebElement logout;
	
	public LogoutPage()
	{
		PageFactory.initElements(getDriver(),this);
	}
	public LoginPage ValidateLogoutbtn()
	{
		logout.click();		
		return new LoginPage();
	}
}
