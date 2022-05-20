package dynamicTableHandeling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableColumnHead {

	static WebDriver driver;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver/chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("http://demo.guru99.com/test/web-table-element.php");

			String ele = "//div[@id='leftcontainer']//child::div[4]//child::a";

			List<WebElement> list = driver.findElements(By.xpath(ele));
			for (int i = 1; i <= list.size(); i++) {
				 String dynamic = ele+"["+i+"]";
				System.out.println(driver.findElement(By.xpath(dynamic)).getText());

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
