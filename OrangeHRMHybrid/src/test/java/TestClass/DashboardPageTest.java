package TestClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.AdminPage;
import Pages.Admin_JobPage;
import Pages.Dashboard;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase
{
	LoginPage loginpage;
	Dashboard dashboard;
	AdminPage admin;
	Admin_JobPage addjobpage;
	public DashboardPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launchApp();
		loginpage = new LoginPage();
		dashboard=loginpage.ValidateLoginCredintials(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown()
	{
		getDriver().quit();
	}
	
	@Test(priority = 1)
	public void Verify_AdminPage() throws InterruptedException
	{
		dashboard= new Dashboard();
		Thread.sleep(3000);
		dashboard.clickon_Adminlink();
		//dashboard.AdminPageCredintails(prop.getProperty("username"), prop.getProperty("employeename"));
		
	}
	
//	@Test(priority = 2)
//	public void Verify_admin_Add_buttonTest()
//	{
//		//dashboard.clickon_Adminlink();
//		dashboard.VerifyAdmin_Add_Button();
//	}
}

