package TestClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.Dashboard;
import Pages.LoginPage;

public class LoginPageTest extends TestBase
{
	Dashboard dashboard;
	LoginPage loginpage;
	
	
	public LoginPageTest()
	{
		super();
	}
	@Parameters("browser")
	@BeforeMethod
	public void setup()
	{
		launchApp(); 
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(priority = 1)
	public void ValidateTitleTest()
	{
		loginpage=new LoginPage();
		System.out.println("xdcgfhbjk");
		String title=getDriver().getTitle();
		Assert.assertEquals(title,"OrangeHRM");
		
	}//
	
//	@Test(priority = 2)
//	public void ValidateLogoTest() 
//	{
//		loginpage=new LoginPage();
//		boolean flag= loginpage.ValidateLogo();
//		Assert.assertTrue(flag);
//	}
	
	@Test(priority = 2)
	public void ValidateLoginCredinatilTest() throws InterruptedException
	{
		Thread.sleep(3000);
		//WebDriver wait =new WebDriver(driver,3);
		loginpage=new LoginPage();
		dashboard=loginpage.ValidateLoginCredintials(prop.getProperty("username"),prop.getProperty("password"));
	}
	
//	@Test(priority = 3)
//	public void ValidateLogoutTest()
//	{
//		LogoutPage logoutpage= new LogoutPage();
//		dashboard=logoutpage.ValidateLogoutbtn();
//	}
//	@Test(priority = 4)
//	public void ValidateForgotpassTest()
//	{
//	  forgotpage= new ForgotPassword();
//	  dashboard=forgotpage.ValidateForgotPassword(prop.getProperty("username"));
//	}
}
