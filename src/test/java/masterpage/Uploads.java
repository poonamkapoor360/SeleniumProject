package masterpage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.AllLinks;

public class Uploads implements AllLinks {
	WebDriver driver;
	
	public Uploads(WebDriver driver)
	{
		this.driver = driver;
			
	}
	
	public void uploadpost() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(uploadpost).click();
		
					
		Thread.sleep(10000);
		
		 
		//wait.until(ExpectedConditions.presenceOfElementLocated (group1));
		driver.findElement(group1).click();

		
		Thread.sleep(2000);

		WebElement element = driver.findElement(subgroup1);

		//Actions actions = new Actions(driver);

		//actions.moveToElement(element).click().perform();
		
		driver.findElement(subgroup1).click();
		driver.findElement(subgroup2).click();
		Thread.sleep(2000);
		driver.findElement(postto).click();
		driver.findElement(selectbusiness).click();	
		driver.findElement(postto).sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		//driver.findElement(uploadphoto).sendKeys("C:\\Users\\AGL\\Desktop\\bikaner\\356kb.jpg");
		//Thread.sleep(2000);
		
		/*WebElement UploadImg = driver.findElement(uploadphoto);
		  UploadImg.click();
			Thread.sleep(3000);

		  WebElement frame =driver.switchTo().activeElement();
			Thread.sleep(3000);

		  frame.sendKeys("C:\\Users\\AGL\\Desktop\\bikaner\\356kb.jpg");*/
		  WebElement UploadImg = driver.findElement(By.xpath("//input[@id='upload-photo']"));
		  UploadImg.sendKeys("C:\\Users\\AGL\\Desktop\\bikaner\\356kb.jpg");
		
				
		WebElement cap = driver.findElement(caption);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cap);
				
		cap.sendKeys("Test Caption");
		System.out.println("Caption Text is : " +cap.getText());
		
		Thread.sleep(2000);
		driver.findElement(cta).click();		 
		WebElement element1 = driver.findElement(selectcta);
		
		        // presenceOfElementLocated condition
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.presenceOfElementLocated(selectcta));
		
	    element1.click();
		System.out.println(element.getText());
		
		Thread.sleep(2000);
		WebElement url = driver.findElement(ctaurl);
		url.click();
		url.sendKeys("https://gmail.com");
	
	driver.findElement(post).click();
	}
		
}


