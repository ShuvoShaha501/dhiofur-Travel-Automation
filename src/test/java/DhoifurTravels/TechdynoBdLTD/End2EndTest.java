package DhoifurTravels.TechdynoBdLTD;



import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

import GhoifurTravelPageObject.ConcernPage;
import GhoifurTravelPageObject.LandingPage;
import GhoifurTravelPageObject.OurBlog;
import GhoifurTravelPageObject.ServicePage;
import TestComponents.BaseTest;

public class End2EndTest extends BaseTest{

	@Test

	public void E2ETestCase() throws IOException{
		LandingPage Homepage=launchApp();
		ServicePage service=Homepage.LaunchApplication("Shuvo Shaha", "Shuvoshaha501@gmail.com", "01797520704", "mirpur 10,Dhaka-1216");
		ConcernPage conceernPage=service.goToSubmenu();
		ConcernPage concerntext=conceernPage.goToConcernPage();
		String Concern=concerntext.concernPageVerify();
		//String Concern=driver.findElement(By.cssSelector("[class*='journal_title']")).getText();
		Assert.assertEquals(Concern , "Concern name");
		OurBlog ourBlog=new OurBlog(driver);
		ourBlog.GoToOurBlog();
		String ContentText=ourBlog.OurBlogVerify();
		Assert.assertEquals(ContentText, "To Improve Your Express Entry Applications");
		driver.close();
	}

}
