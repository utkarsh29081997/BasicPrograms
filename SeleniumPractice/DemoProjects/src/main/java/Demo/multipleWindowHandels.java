package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowHandels {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\utkarsh.singh\\Desktop\\Utkarsh\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(@href,'../articles_popup.php')]")).click();
		driver.manage().deleteAllCookies();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Abc");
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
		driver.quit();
	}

}
