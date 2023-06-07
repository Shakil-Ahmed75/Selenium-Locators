package setUpWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_driver_base {

	public static WebDriver driver;
	
	@BeforeSuite
	public static void setDriver() 
	{
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterSuite
	public static void closeWindows() 
	{
		driver.close();
		//driver.quit();
	}
}
