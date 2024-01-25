package TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GhoifurTravelPageObject.LandingPage;


public class BaseTest {
	public WebDriver driver;
	public WebDriver DriverInstall() {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
		    return driver;
		}
	
	
	 public LandingPage launchApp() throws IOException {
		
		driver= DriverInstall();
		LandingPage Homepage=new LandingPage(driver);
		Homepage.goToHomePage();
		return Homepage;
		
		}
	}


