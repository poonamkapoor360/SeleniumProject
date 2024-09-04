package masterpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import logicalwork.BaseURI;
import utility.AllLinks;

public class IndexPage implements AllLinks {	
	WebDriver driver;
	BaseURI obj;	
	LoginPage log;
	Overview overview; 
	@BeforeTest
	void SetUp() throws InterruptedException
	{
		obj = new BaseURI();
		driver = obj.Open_Webpage(base_url);
		
	}	
	@Test(priority=1)
	void loginMethods()
	{
		log = new LoginPage(driver);
		//log.blank_email();
		//log.blank_password();
		log.validlogin();
	}
	@Test(priority=2,enabled = false)
	void businessProfile() throws InterruptedException
	{
		overview = new Overview(driver);
		overview.setUp();
		overview.createBusiness();
	}
	@Test(priority=3)
	void BulkPost() throws InterruptedException
	{
		Uploads up = new Uploads(driver);
		up.uploadpost();
		
	}
	@AfterTest(enabled = false)
	void CloseBrowser()
	{driver.close();
	}
	
	
	}
	



