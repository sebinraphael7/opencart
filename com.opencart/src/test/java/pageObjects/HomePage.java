package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage (WebDriver driver) {
		super(driver);
	}
	//element
	@FindBy(xpath="") WebElement lnkMyaccount;
	@FindBy(xpath="") WebElement lnkRegister;
	
	//action method
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	public void clickRegister() {
		lnkRegister.click();
	}

}
