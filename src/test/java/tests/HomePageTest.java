package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest {
	
	
	
	public HomePage hp;
	
public  void initObject() {
		
		
		hp =new HomePage(driver);
	}
	
	@BeforeClass
	public void init() {
		
		//step-5 creating objects
		initObject();
		
		
	}
	
	
	@Test (priority=2)
	public void logout() throws InterruptedException {
		
		hp.clickOnProfile();
		hp.clickOnLogout();
		Thread.sleep(3000);
		
	}
	@Test (priority=1)
	public void verifyTitle() {
		
		Assert.assertEquals(driver.getTitle(), "HRM", "Title does not matched");
	}
	
	@AfterClass
	public void teardDown() {
		
		
	}

}
