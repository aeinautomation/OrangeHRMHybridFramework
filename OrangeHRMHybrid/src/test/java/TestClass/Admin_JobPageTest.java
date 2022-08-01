package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.AdminPage;
import Pages.Admin_JobPage;
import Pages.Dashboard;
import Pages.LoginPage;

public class Admin_JobPageTest extends TestBase
{
	Dashboard dashboard;
	LoginPage loginpage;
	AdminPage adminpage;
	public Admin_JobPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launchApp();
		loginpage= new LoginPage();
		dashboard=loginpage.ValidateLoginCredintials(prop.getProperty("username"),prop.getProperty("password"));
		dashboard.clickon_Adminlink();
		
	}
	@AfterMethod
	public void teardown()
	{
		getDriver().quit();
	}
	
	@Test(priority = 1)
	public void verifyAddJobTest() throws InterruptedException
	{
		Thread.sleep(3000);
		Admin_JobPage adminjobpage = new Admin_JobPage();
		adminjobpage.verifyAddJob();
	}
}
