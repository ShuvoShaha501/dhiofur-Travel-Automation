package GhoifurTravelPageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractCompoenet.abstractCopmponent;

public class LandingPage extends abstractCopmponent{
	
	WebDriver driver;
//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(linkText="Book Appointment")
	WebElement Appoint;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="address")
	WebElement address;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	By contpage =By.name("name");
	
	public LandingPage goToHomePage() {
		driver.get("https://dhiofur.texrootsourcing.com");
    	Appoint.click();
    	LandingPage Homepage=new LandingPage(driver);
    	return Homepage;
    	
	}
	
	public ServicePage LaunchApplication(String Name, String Email, String Phone, String Address ) {
		
		readyToAppare(contpage);
		name.sendKeys(Name);
		email.sendKeys(Email);
		phone.sendKeys(Phone);
		address.sendKeys(Address);
		submit.click();
		ServicePage service=new ServicePage(driver);
 		return service;
		
	
	}
}