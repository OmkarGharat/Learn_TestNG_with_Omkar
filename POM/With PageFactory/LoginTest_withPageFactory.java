package TestNGPractice.Day47_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest_withPageFactory {
    private WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    @Test
    public void testLoginWithInvalidUsernameLocator() {
        LoginPage_withPageFactory loginPage = new LoginPage_withPageFactory(driver);
        loginPage.enterUsername("Admin"); // This will now fail immediately
    }
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
