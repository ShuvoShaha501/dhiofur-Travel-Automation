package GhoifurTravelPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractCompoenet.abstractCopmponent;

public class OurBlog extends abstractCopmponent{
	WebDriver driver;
	
	public OurBlog(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(css="[href*='all-blogs']")
		WebElement concernClick;
		
		@FindBy(css="[class='btn btn-secondary']")
		WebElement content;
		
	
	
	public void GoToOurBlog() {
		concernClick.click();
		content.click();
		
				
	}
	
	public String OurBlogVerify() {
		
		String ContentText=driver.findElement(By.cssSelector("[class='journal_title mt-2 mb-2']")).getText();
		return ContentText;
	}


}