package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
public AccountRegistrationPage(WebDriver driver) {
	super (driver);
}

@FindBy(xpath="") WebElement txtFirstname;
@FindBy(xpath="") WebElement txtLastname;
@FindBy(xpath="") WebElement txtEmail;
@FindBy(xpath="") WebElement txtTelephone;

}
