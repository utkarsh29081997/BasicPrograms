package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class wiki {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.flipkart.com/");
		//Alert alert = driver.switchTo().alert();
		
/*		WebElement elem = driver.findElement(By.xpath("//select[@name='language']"));
		
		Select s = new Select(elem);
		s.selectByValue("hi");
		
		String label = driver.findElement(By.xpath("//label[@id='jsLangLabel']")).getText();
		System.out.println("Label value "+label);
		
		List<WebElement> list = s.getOptions();
		list.forEach(n->System.out.println(n.getText()));
*/		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
