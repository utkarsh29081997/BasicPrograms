package Demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.http.protocol.HTTP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrlWorkings {

	static WebDriver driver;

	public static void main(String[] args) {
		HttpURLConnection con =null;
		String home = "http://www.zlti.com";
		int respCode;

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(home);
		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {
			String url;
			url = it.next().getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if (!url.startsWith(home)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			try {
				con = (HttpURLConnection) (new URL(url).openConnection());
			//	con.setRequestMethod("HEAD");
			//	con.connect();
				
				respCode = con.getResponseCode();
				 
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				driver.quit();
			}

		}
	}

}
