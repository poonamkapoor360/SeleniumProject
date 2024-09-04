package masterpage;

import org.openqa.selenium.WebDriver;

import utility.AllLinks;

public class LoginPage implements AllLinks{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
	this.driver = driver;	
	}
	void validlogin()
	{
		//driver.findElement(e_address_xpath).clear();
		driver.findElement(e_address_xpath).sendKeys(e_address_value);
		//driver.findElement(password_xpath).click();

		//driver.findElement(password_xpath).clear();
		driver.findElement(password_xpath).sendKeys(pass_value);
		driver.findElement(signin_button_xpath).click();
	}
	
	/*@Test(priority=4)
	void invalid_password()
	{
		//driver.findElement(e_address_xpath).clear();
		driver.findElement(e_address_xpath).sendKeys(e_address_value);
		//driver.findElement(password_xpath).clear();
		driver.findElement(password_xpath).sendKeys(pass);
		driver.findElement(signin_button_xpath).click();
	}*/
	//@Test(priority=1)
	/*void blank_email()
	{
		//driver.findElement(e_address_xpath).clear();
		driver.findElement(e_address_xpath).sendKeys(blankemail);
		//driver.findElement(password_xpath).clear();
		driver.findElement(password_xpath).sendKeys(pass_value);
		driver.findElement(signin_button_xpath).click();
	}*/
	//@Test(priority=2)
	/*void blank_password()
	{
		driver.findElement(e_address_xpath).sendKeys(e_address_value);
		driver.findElement(password_xpath).clear();
		driver.findElement(password_xpath).sendKeys(blankpass);
		driver.findElement(signin_button_xpath).click();
	}*/
	/*@Test(priority=3)
	/*void invalid_username()
	{		
		driver.findElement(e_address_xpath).clear();
		driver.findElement(e_address_xpath).sendKeys(email);
		driver.findElement(password_xpath).clear();
		driver.findElement(password_xpath).sendKeys(pass_value);
		driver.findElement(signin_button_xpath).click();
	}*/
	
	
	
	

}
