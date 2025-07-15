package testCases;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		System.out.println("username assignation completed...");

		login.enterPassword("admin123");
		System.out.println("password assignation completed...");

		login.clickLogin();

	}
}
