package Demo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");

		driver = new ChromeDriver();
		/*
		 * driver.get(
		 * "https://www.google.com/search?q=youtube&rlz=1C1GCEU_enIN984IN984&oq=yout&aqs=chrome.0.35i39i355j46i39i199i465j69i57j0i67l2j0i67i433j0i433i512j0i67l2j0i131i433i512.2303j0j15&sourceid=chrome&ie=UTF-8"
		 * ); List<WebElement> list = driver.findElements(By.tagName("a"));
		 * 
		 * for(WebElement e : list) { System.out.println(e.getText()); }
		 */

		driver.get("http://demo.guru99.com/test/web-table-element.php");

		String xpath = "//table[@class='dataTable']//tbody//tr";

		List<WebElement> list = driver.findElements(By.xpath(xpath));

		String dynamic;
		int count = 2;
		for (int i = 1; i <= list.size(); i++) {
			dynamic = xpath + "[" + i + "]" + "//td[" + count + "]";
			System.out.println(driver.findElement(By.xpath(dynamic)).getText());
		}

		driver.quit();

	}

}
