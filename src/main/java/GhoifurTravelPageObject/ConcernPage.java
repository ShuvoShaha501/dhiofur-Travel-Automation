package GhoifurTravelPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractCompoenet.abstractCopmponent;

public class ConcernPage extends abstractCopmponent{
	
	WebDriver driver;
	public ConcernPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(css="[href*='/all-concern']")
	WebElement concern;
	
	@FindBy(css="[href*='/concern-name']")
	WebElement concernName;
	
	By conName =By.cssSelector("[href*='/concern-name']");
	
	
	
	public ConcernPage goToConcernPage() {
		concern.click();
		readyToAppare(conName);
		concernName.click();
		ConcernPage concerntext=new ConcernPage(driver);
		return concerntext;
	
	}
	public String concernPageVerify() {
		String Concern=driver.findElement(By.cssSelector("[class*='journal_title']")).getText();
		return Concern;
	}



	
}
