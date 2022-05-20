package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableGuru99 {

	static WebDriver driver;

	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			String xpath = "//div[@Id='leftcontainer']//child::div[4]//child::a";
			List<WebElement> list = driver.findElements(By.xpath(xpath));
			String dynamic;
			for (int i = 1; i <= list.size(); i++) {
				dynamic = xpath + "[" + i + "]";
				// System.out.println(dynamic);
				System.out.println(driver.findElement(By.xpath(dynamic)).getText());
			}

			List<WebElement> table_col = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
			
			table_col.forEach((n)->System.out.println("Table Column heading "+n.getText()));
			String xpath_01 = "//table[@class='dataTable']//td//following::a";
			List<WebElement> table_row_value = driver.findElements(By.xpath(xpath_01));
			String dynamic_01;
			for (int i = 1; i <= table_row_value.size()-1; i++) {
				dynamic_01 = xpath_01 + "[" + i + "]";
				// System.out.println(dynamic);
				System.out.println("Values : "+driver.findElement(By.xpath(dynamic_01)).getText());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
