package windowHandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandelGuru99 {

	static WebDriver driver;

	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("http://demo.guru99.com/popup.php");

			WebElement ele = driver.findElement(By.xpath("//a[@target='_blank']"));
			ele.click();

			String parentWindow = driver.getWindowHandle();

			Set<String> s = driver.getWindowHandles();
			Iterator<String> iterator = s.iterator();

			while (iterator.hasNext()) {
				String childWindow = iterator.next();

				if (!parentWindow.equalsIgnoreCase(childWindow)) {

					driver.switchTo().window(childWindow);
					driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

					driver.findElement(By.name("btnLogin")).click();
					driver.close();

				}
			}
			driver.switchTo().window(parentWindow);
			System.out.println(ele.getText());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			driver.quit();
		}
	}

}
