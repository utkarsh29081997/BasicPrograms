package alertOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoQAAlert {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement listOfAlert = driver.findElement(By.xpath(
				"//div[@class='left-pannel']//div[@class='element-group'][3]//following::div[@class='header-right'][1]"));
		// listOfAlert.click();

		WebElement alertList = driver.findElement(By.xpath(
				"//div[@class='left-pannel']//div[@class='element-group'][1]//following::div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-1']"));

		alertList.click();
		Thread.sleep(2000);

		WebElement AlertBtn5Sec = driver.findElement(By.xpath(
				"//div[@class='col-12 mt-4 col-md-6']//div[@id='javascriptAlertsWrapper']//button[@id='timerAlertButton']"));
		AlertBtn5Sec.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
