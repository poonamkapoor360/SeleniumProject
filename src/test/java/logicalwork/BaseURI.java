package logicalwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseURI {
	
	WebDriver driver;
	
	public WebDriver Open_Webpage(String base_url) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		return driver;
	}

}
