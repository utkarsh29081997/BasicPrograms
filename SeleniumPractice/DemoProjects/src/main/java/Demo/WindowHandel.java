package Demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlInlineBinaryData;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandel {

	static WebDriver driver;
	

	public static void Screenshotss() {
		File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir") + "\\Screenshots");
		File[] a = f.listFiles();
		System.out.println(a.length);
		int b = a.length + 1;
		File destFile = new File(System.getProperty("user.dir") + "\\Screenshots\\Screenshot(" + b + ").jpg");
		try {
			FileUtils.copyFile(sc, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/popup.php");

			WebElement element = driver.findElement(By.xpath("//a[@target='_blank']"));
			element.click();
			// Parent Window
			String parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
			Screenshotss();
			// Set<String> s1 = driver.getWindowHandles();

			Set<String> s1 = new HashSet<>();
			s1.addAll(driver.getWindowHandles());
			System.out.println(s1);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			// String []wind = s1.toArray(new String[s1.size()]);
			List<String> wind = new ArrayList<String>(s1);
			
			// wait.until(ExpectedConditions.)

			for (int i = 0; i <= wind.size() - 1; i++) {
				String childWindow = wind.get(i);
				System.out.println(childWindow);

				if (!parentWindow.equalsIgnoreCase(childWindow)) {
					driver.switchTo().window(childWindow);
					driver.findElement(By.name("emailid")).sendKeys("Abcd@abc.com");
					Screenshotss();
					Thread.sleep(1000);
					driver.close();
				}
			}

			driver.switchTo().window(parentWindow);

	/*		Iterator<String> i1 = s1.iterator();
			while (i1.hasNext()) {
				String childWindow = i1.next();
				System.out.println(childWindow);

				if (!parentWindow.equalsIgnoreCase(childWindow)) {
					driver.switchTo().window(childWindow);
					driver.findElement(By.name("emailid")).sendKeys("Abcd@abc.com");
					Thread.sleep(1000);
					driver.close();
				}

				driver.switchTo().window(parentWindow);
			}
*/		
		/*
		 
		 @DataProvider(name="Hello")
		 public Object[][] getData(){
		 return new Object[][]{
		 
		 };
		 }
		  
		  */	
		} finally {
			driver.quit();
		}
	}

}
