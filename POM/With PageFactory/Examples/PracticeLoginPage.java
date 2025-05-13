package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeLoginPage {

	WebDriver driver;

	PracticeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// with PageFactory
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement UserNameField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement PasswordField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginBtnField;
	
	public void EnterUserName(String username) {
		UserNameField.sendKeys(username);
		System.out.println("username entered");
	}
	
	public void EnterPassword(String password) {
		PasswordField.sendKeys(password);
		System.out.println("password entered");
	}
	
	public void ClickOnLoginBtn() {
		LoginBtnField.click();
		System.out.println("login btn clicked");
	}
}
