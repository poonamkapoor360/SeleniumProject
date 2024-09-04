package utility;

import org.openqa.selenium.By;

public interface AllLinks {
	
	String base_url = "https://devgbptool.glocal360.ai/";
	
	
	//Locators 	|| login page
	By e_address_xpath = By.xpath("//input[@type='email']");
	By password_xpath = By.xpath("//input[@type='password']");
	By signin_button_xpath = By.xpath("//button[contains(text() , 'Sign In')]");
	
	
	//variable || login page
	String e_address_value = "poonam.kapoor@adglobal360.com";
	String pass_value = "AGL2913";
	
	String email = "poonam@adglobal.com";
	String pass = "AG";
	
	String blankemail = "";
	String blankpass = "";
	
	//Locators ||  Overview Page
	//By overview = By.xpath("//a[@title='Overview' && @class='active']");
	By overview = By.xpath("//a[@title='Overview']");
	
	//By overview = By.xpath("//div[@class='flex flex-col w-16 bg-black h-screen']/a[@title='Overview']");
//By overview = By.xpath("//div[@class='p-4 text-gray-300 flex flex-col items-center justify-center hover:bg-gray-700 cursor-pointer bg-gray-700'])[1]");
	By group = By.xpath("//p[contains(text(), 'Test')]");
	By subgroup = By.xpath("//div[contains(text(), 'GMB TOOL')]");
	By child = By.xpath("//div[contains(text(), '20June')]");
	By setup = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-11s93gz-MuiButtonBase-root-MuiButton-root']");
   By businessname = By.xpath("//input[@id=\':rt:\']");
   //By businessname = By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-dj7bjd-MuiInputBase-root-MuiOutlinedInput-root']");
    
    By businesscategory = By.xpath("//input[@id='combo-box-demo']");
    By next = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary !text-xs px-5 py-2 css-1plxawj-MuiButtonBase-root-MuiButton-root']");
    
    //Uploads
    By uploadpost= By.xpath("(//img[@alt='upload'])");
    By group1 =By.xpath("//p[contains(text(), 'AGL analytics')]");
    By subgroup1 = By.xpath("//div[contains(text(), 'Adglobal Accounts')]");
    By subgroup2 = By.xpath("//div[contains(text(), 'Ungrouped')]");
    By postto = By.xpath("//input[@name='businessName']");
    By selectbusiness = By.xpath("(//input[contains(@type,'checkbox')])[2]");
    By uploadphoto = By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div[2]/div/div/div/div[1]/div[1]/div/form/div[3]/div/div[1]/div/div[2]/label/span");
    By caption = By.xpath("(//textarea[@id='outlined-multiline-static'])[1]");
    By cta = By.xpath("//input[@id='combo-box-demo']");
    By selectcta = By.xpath("//li[@id='combo-box-demo-option-1']");
    By ctaurl = By.xpath("//input[@placeholder='Enter CTA URL']");
    By post = By.xpath("//button[@type='submit']");
    
}
