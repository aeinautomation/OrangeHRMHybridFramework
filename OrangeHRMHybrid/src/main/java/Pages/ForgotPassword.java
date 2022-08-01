package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class ForgotPassword extends TestBase
{
		@FindBy (xpath="//div[@id='forgotPasswordLink']/a")
	WebElement forgotpass;
	
	@FindBy (xpath="//input[@id='securityAuthentication_userName']")
	WebElement ForgotID;
	
	@FindBy (xpath="//input[@id='btnSearchValues']")
	WebElement resetbtn;
	
	@FindBy (xpath="//input[@id='btnCancel']")
	WebElement cancelbtn;
	
	public ForgotPassword()
	{
		PageFactory.initElements(getDriver(),this);
	}
	
	public Dashboard ValidateForgotPassword(String forgot) throws InterruptedException
	{
		Thread.sleep(3000);	
		forgotpass.click();
		ForgotID.sendKeys(forgot);
		//resetbtn.click();
		cancelbtn.click();
		return new Dashboard();
	}
	
}
