package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.AdminPage;
import Pages.Dashboard;
import Pages.LoginPage;

public class AdminpageTest extends TestBase 
{
	AdminPage admin;
	LoginPage loginpage;
	Dashboard dashboard;
	public AdminpageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		launchApp();
		loginpage= new LoginPage();
		dashboard=loginpage.ValidateLoginCredintials(prop.getProperty("username"),prop.getProperty("password"));
		//admin.AdminCLick();
		dashboard.clickon_Adminlink();
	}
	
//	@Test(priority = 1)
//	public void Verify_Admin_username()
//	{
//		admin.AdminPageCredintails(prop.getProperty("username"),prop.getProperty("employeename"));
//	}
	@Test(priority = 1)
	public void Verify_AdminPage() throws InterruptedException
	{
		Thread.sleep(3000);
		dashboard.clickon_Adminlink();
		//dashboard.AdminPageCredintails(prop.getProperty("username"), prop.getProperty("employeename"));
		
	}
	
	@Test(priority = 2)
	public void Verify_admin_Add_buttonTest()
	{
		AdminPage adminpage= new AdminPage();
		//dashboard.clickon_Adminlink();
		adminpage.VerifyAdmin_Add_Button();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		getDriver().close();
	}
}
