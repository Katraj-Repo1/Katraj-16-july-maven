package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//li[@class='oxd-userdropdown']")
	public WebElement profile;
	
	@FindBy (xpath ="//a[text()='Logout']")
	public WebElement logoutlink;
	 
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProfile() {
		
		profile.click();
	}
	
	public void clickOnLogout() {
		
		logoutlink.click();
	}

}
