package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize @FindBy elements
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[contains(@class, 'orangehrm-login-button')]")
	WebElement loginButton;
	
	Utility utility = new Utility();

	public void enterUsername(String username) {
		
		utility.waitForVisibility(usernameField);
		usernameField.sendKeys(username);
		System.out.println("username : " + username + " is assigned...");
	}

	public void enterPassword(String password) {

		utility.waitForVisibility(passwordField);
		passwordField.sendKeys(password);
		System.out.println("password : " + password + " is assigned...");
	}

	public void clickLogin() {
		loginButton.click();
	}

}
