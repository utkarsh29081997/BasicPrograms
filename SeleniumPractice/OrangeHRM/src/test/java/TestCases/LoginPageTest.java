package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginPageTest extends LoginPage {
	
	LoginPage loginPage;
	
	@BeforeTest
	public void setup() {
		initalization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void testCredentials() {
		loginPage.sendValues();
	}
	

}
