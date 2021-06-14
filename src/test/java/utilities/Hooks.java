package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void InitializWebDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C://SDETAutomation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
	}
	
	@After
	public void endWebDriver() {
		driver.quit();
	}

}
