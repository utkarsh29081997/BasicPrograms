package TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {

	static Properties prop;
	public static WebDriver driver;
	public testBase() {
		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
			prop.load(fip);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void initalization() {
		String browserName = prop.getProperty("browser");
		System.getProperty("webdriver.chrome.driver","C:\\Users\\utkarsh.singh\\Desktop\\Utkarsh\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
}
