package TestNGPractice.Day47_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_withPageFactory {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // Constructor
    public LoginPage_withPageFactory(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    // Action Methods with explicit waits
    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameField));
		usernameField.clear();
		usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }
}
