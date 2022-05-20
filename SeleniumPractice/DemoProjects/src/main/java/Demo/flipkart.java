package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.className("eFQ30H"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
