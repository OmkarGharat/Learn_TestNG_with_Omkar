package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeLoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void LoginTest() {
		PracticeLoginPage loginPage = new PracticeLoginPage(driver);
		loginPage.EnterUserName("Admin");
		loginPage.EnterPassword("admin123");
		loginPage.ClickOnLoginBtn();
	}
	
	@AfterClass
	void exit() {
		driver.quit();
	}
}
