package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.Dashboard;
import Pages.ForgotPassword;

public class ForgotPassTest extends TestBase
{
	ForgotPassword forgotpage;
	Dashboard dashboard;
	public ForgotPassTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		launchApp(); 
	}
	
	@AfterMethod
	public void teardown()
	{
		getDriver().quit();
	}
	@Test
	public void ValidateForgotpassTest() throws InterruptedException
	{
	  forgotpage= new ForgotPassword();
	  dashboard=forgotpage.ValidateForgotPassword(prop.getProperty("username"));
	}
}
