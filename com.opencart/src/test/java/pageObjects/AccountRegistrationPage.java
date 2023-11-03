package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	//normal constructor+webdriver instance
public AccountRegistrationPage(WebDriver driver) {
	super (driver); //we are passing the driver instance to the parent class constructor
}

@FindBy(xpath="") WebElement txtFirstname;
@FindBy(xpath="") WebElement txtLastname;
@FindBy(xpath="") WebElement txtEmail;
@FindBy(xpath="") WebElement txtTelephone;
@FindBy(xpath="") WebElement txtPassword;
@FindBy(xpath="") WebElement txtConfirmPassword;
@FindBy(xpath="") WebElement chkdPolicy;
@FindBy(xpath="") WebElement btnContinue;
@FindBy(xpath="") WebElement msgConfirmation;

public void setFirstName(String fname) {
	txtFirstname.sendKeys(fname);
	
}
public void setLastName(String lname) {
	txtLastname.sendKeys(lname);
}
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}
public void setTelephone(String tel) {
	txtTelephone.sendKeys(tel);
}
public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void setConfirmPassword(String pwd)
{
	txtConfirmPassword.sendKeys(pwd);
}
public void setPrivacyPolicy() {
	chkdPolicy.click();
}
public void clickContinue() {
	btnContinue.click();
}
public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	}catch (Exception e) {
		return (e.getMessage());
	}
}
}
