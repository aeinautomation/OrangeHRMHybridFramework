package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.LogoutPage;

public class LogoutTest extends TestBase

{
	LoginPage loginpage;
	LogoutPage logoutpage;
	Dashboard dashboard;
	public LogoutTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launchApp(); 
		dashboard=loginpage.ValidateLoginCredintials(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() 
	{
		getDriver().quit();
	}
	
	@Test
	public void ValidateLogoutTest()
	{
		LogoutPage logoutpage= new LogoutPage();
		
		logoutpage.ValidateLogoutbtn();
	}
	
}
