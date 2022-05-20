package Demo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverTest {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//driver//chromedriver.exe");
		
		driver =  new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/testng-interview-questions/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		WebElement target = driver.findElement(By.xpath("//div[@class='entry-content single-content']//p//b[contains(text(),'What are the advantages')]"));
		Actions act =  new Actions(driver);
		act.moveToElement(target);
		System.out.println("executed");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
