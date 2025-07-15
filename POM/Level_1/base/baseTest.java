package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Test Execution Started...");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Browser Lanuched...");

//		Utility utility = new Utility();
//		utility.waitForPageToLoad();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Test Execution Completed...");

//		driver.quit();
	}

}
