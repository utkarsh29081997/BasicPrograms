package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			WebElement ele = driver.findElement(By.xpath("//div[@class='span12']//following::h1"));
			System.out.println(ele.getText());
			/*js.executeScript("arguments[0].style.border = '3px solid red'", ele);
			
			String id=ele.getAttribute("id"); System.out.println(id);*/
			
			WebElement drag = driver.findElement(By.xpath("//div[@id='products']//following::li[@id='credit2']"));
			System.out.println(drag.getAttribute("id"));
			WebElement drop = driver.findElement(By.xpath("//ol[@id='bank']//li"));

			Actions act = new Actions(driver);
			act.dragAndDrop(drag, drop).perform();
			
	//		js.executeScript("window.scrollBy(0,100");
			
			Thread.sleep(3000);
			// driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
			System.out.println("Executed");
		}
	}

}
