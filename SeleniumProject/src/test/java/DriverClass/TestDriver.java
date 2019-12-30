package DriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestDriver {
	WebDriver driver =null;
String BrowserName;

	
	@Before
	public void beforeMethod() {
		
		System.out.println("before method is exected  ------");
		// TODO Auto-generated constructor stub
		BrowserName = System.getProperty("Browser");
		System.out.println("The browser name is : " + BrowserName);
		if(BrowserName.equalsIgnoreCase("Chrome") || BrowserName.equalsIgnoreCase("CH")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("FireFox") || BrowserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			FirefoxOptions options=new FirefoxOptions();
			driver=new FirefoxDriver();
			
		}
			
			else if (BrowserName.equalsIgnoreCase("Internetexplorer") || BrowserName.equalsIgnoreCase("IE")) {
				
				System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
				
				InternetExplorerOptions options= new InternetExplorerOptions();
				options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				options.ignoreZoomSettings();
				driver=new InternetExplorerDriver(options);
				
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		// TODO Auto-generated constructor stub
	}
		
	@After
	public void afterMethod() {
			if (driver != null) {
			driver.quit();
			
		}}
	
		
	}
