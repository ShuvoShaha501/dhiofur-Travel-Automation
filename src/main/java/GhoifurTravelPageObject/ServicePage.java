package GhoifurTravelPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractCompoenet.abstractCopmponent;


public class ServicePage extends abstractCopmponent {

	
	WebDriver driver;
	public ServicePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}

	
	@FindBy(css="[class='menu-item-has-children']")
	WebElement hover;
	
	@FindBy(css="[href*='/service/visa-processing']")
	WebElement visaProcessing;
	
	@FindBy(css="[href*='/service/package-tour']")
	WebElement packagetour;
	
	@FindBy(css="[href*='/service/hajj-umrah-services']")
	WebElement hajjUmrah;
	
	
	
	@FindBy(css="[href*='/service/air-ticketing']")
	WebElement airTicketing;
	
	By submenu= By.cssSelector("[href*='/service/air-ticketing']");


	
 	
	public ConcernPage goToSubmenu() {
	    Actions action = new Actions(driver);
	    
	    // Hover over the main menu item and then click on the submenu
	    action.moveToElement(hover).click(visaProcessing).perform();
	   // readyToAppare(submenu);
	    
	    action.moveToElement(hover).click(packagetour).perform();
	   // readyToAppare(submenu);
	    
	    action.moveToElement(hover).click(hajjUmrah).perform();
	    //readyToAppare(submenu);
	    
	    action.moveToElement(hover).click(airTicketing).perform();
	    
	    
	    return new ConcernPage(driver);
	}
}