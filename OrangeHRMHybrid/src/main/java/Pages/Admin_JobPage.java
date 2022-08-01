package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class Admin_JobPage extends TestBase
{
	@FindBy (xpath="//a[@id='menu_admin_viewAdminModule']")
	WebElement admin;
	
	@FindBy (xpath="//div[@id=\"wrapper\"]/div[2]/ul/li/ul/li/a[@id=\"menu_admin_UserManagement\"]")
	WebElement usermanagement;
	//Add job
	
	@FindBy (xpath="//a[text()=\"Job\"]")
	WebElement job;
	
	@FindBy (xpath="//div[@id=\"mainMenu\"]/ul/li/ul/li/ul/li/a[@id=\"menu_admin_viewJobTitleList\"]")
	WebElement jobtitlelist;
	
	@FindBy (xpath="//input[@id=\"btnAdd\"]")
	WebElement addjob;
	
	@FindBy (xpath="//input[@id=\"btnDelete\"]")
	WebElement deletejob;
	
	//addjob
	@FindBy (xpath="//input[@id=\"jobTitle_jobTitle\"]")
	WebElement jobtitle;
	
	@FindBy (xpath="//textarea[@id=\"jobTitle_jobDescription\"]")
	WebElement jobDesciption;
	
	@FindBy (xpath="//input[@id=\"jobTitle_jobSpec\"]")
	WebElement photo;
	
	@FindBy (xpath="//textarea[@id=\"jobTitle_note\"]")
	WebElement note;
	
	@FindBy (xpath="//input[@id=\"btnSave\"]")
	WebElement save;
	
	@FindBy (xpath="//input[@id=\"btnCancel\"]")
	WebElement cancel;
	
	public Admin_JobPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	

	public void  verifyAddJob() throws InterruptedException
	{	
		admin.click();
		Actions action= new Actions(getDriver());
		action.moveToElement(job).build().perform();
		jobtitlelist.click();
		Thread.sleep(3000);
		addjob.click();
		//deletejob.click();
		
		jobtitle.sendKeys("Developer");
		jobDesciption.sendKeys("@@@@@@@@@@@@@@@@@@@@@@LKJIVUCYTXTEXCYVGKHUBJNKMLiuytxreyctfugvybhunjim");
		Thread.sleep(5000);
		photo.sendKeys("C:\\Users\\QurratulAeinMohammad\\eclipse-workspace\\OrangeHRMHybrid\\Images\\back.jpg");
		
		note.sendKeys("lkjbhuvygtcre43zwetxyrctvuigbhunjiomozesxtdrcyftvugybhunjimo");
		save.click();
	}
}
