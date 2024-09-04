package masterpage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.AllLinks;

public class Overview implements AllLinks {
	WebDriver driver;
	
		public Overview (WebDriver driver)
			{
			this.driver=driver;
			}
			
	void setUp() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Overview' and @class='active']")));
		//element.click();
	Thread.sleep(5000);
	driver.findElement(overview).click();
	Thread.sleep(5000);
	driver.findElement(group).click();
	Thread.sleep(5000);
	driver.findElement(subgroup).click();
	driver.findElement(child).click();
	Thread.sleep(5000);
	driver.findElement(setup).click();
	}

	void createBusiness() throws InterruptedException
	{
		//Thread.sleep(20000);

		driver.findElement(businessname).click();
		driver.findElement(businessname).sendKeys("Om Fast Food");
		//Thread.sleep(2000);
		//driver.findElement(businesscategory).click();
		//Thread.sleep(2000);

		//driver.findElement(businesscategory).sendKeys("Restaurant");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement dropdownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(businesscategory));
		dropdownOption.sendKeys("Res");
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	    driver.findElement(next).click();
	    		
	}
}