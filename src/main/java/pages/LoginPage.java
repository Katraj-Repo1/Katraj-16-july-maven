package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameBox;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement passwordBox;
	
	@FindBy (xpath ="//button[text()=' Login ']")
	private WebElement button;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterCred(String username, String password) {
		
		usernameBox.sendKeys(username);
		
		passwordBox.sendKeys(password);
		
	}
	
	public void clickButton() {
		
		button.click();
	}
	

}
