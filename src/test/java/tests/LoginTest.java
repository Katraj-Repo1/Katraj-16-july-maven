package tests;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.PropReader;

public class LoginTest extends BaseTest {
	
	
	public LoginPage lp;
	
public  void initObject() {
		
		lp=new LoginPage(driver);
	}
	
	@BeforeClass
	public void init() {
		
		//launching
		
		
		//step-5 creating objects
		initObject();
		
		
	}
	
	@Test
	public void login() throws InterruptedException, FileNotFoundException {
		//step-1 enter cred
		lp.enterCred(PropReader.readProperties("user"), PropReader.readProperties("pass"));
		System.out.println("user name & password entered successfully");
		
		//step-2
		lp.clickButton();
		Thread.sleep(3000);
		System.out.println("successfully clicked on button");
		
	}
	
	


}
