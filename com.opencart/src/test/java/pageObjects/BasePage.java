package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
// base class contains reusable components
public class BasePage 
{
	WebDriver driver;		//webdriver variable
	
	//constructor for every page object class
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
