package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {
	@Test
	void test_account_Registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		regpage.setFirstName("abc");
		regpage.setLastName("xyz");
		regpage.setEmail("abcxyz@gmail.com");
		regpage.setTelephone("123456");
		regpage.setPassword("test@123");
		regpage.setConfirmPassword("test@123");
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		
	}
}
