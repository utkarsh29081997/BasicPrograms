package Demo;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicTableHandel {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		boolean d = driver.getTitle().contains("OrangeHRM");
		System.out.println(d);
		WebElement e = driver.findElement(By.xpath("//a//b[contains(text(),'Admin')]"));
		Actions action = new Actions(driver);
		action.doubleClick(e).perform();
		
		//e.click();
		List<WebElement> listofEmpname = driver.findElements(By.xpath("//table[@id='resultTable']//td[4]"));
		listofEmpname.forEach((n)->System.out.println(n.getText()));
		
		/*
		 * for(WebElement l : listofEmpname) { System.out.println(l.getText()); }
		 */
		//System.out.println(e.getCssValue("background-color"));
		Thread.sleep(3000);
		driver.quit();
		
	}

}
