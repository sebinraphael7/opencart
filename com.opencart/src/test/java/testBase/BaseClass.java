package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	public WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	//for generating random string
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
	}
	
	public String randomeNumber()
	{
		String generatedString2=RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
	
	public String randomAlphaNumeric() {
		String st=RandomStringUtils.randomAlphabetic(4);
		String num=RandomStringUtils.random(3);
		return (st+"#"+num);
		
	}
}
