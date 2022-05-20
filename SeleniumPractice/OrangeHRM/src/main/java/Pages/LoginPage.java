package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.testBase;

public class LoginPage extends testBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	static WebElement userNameInput;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	static WebElement pswdinput;
	
	public static void sendValues() {
		userNameInput.sendKeys("Admin");
		pswdinput.sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
}
