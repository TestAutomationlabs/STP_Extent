
package com.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.ExtentReportListner.ExtentFactory;
import com.qa.Util.CustomListner;
import com.qa.Util.TestUtil;
import com.qa.pages.HomePage;
import com.qa.pages.PostPages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListner.class)
public class PostButtonTest extends TestBase {
	HomePage homepage;
	PostPages post;
	ExtentReports report;
	ExtentTest test;

	public String stptoolnews_valdn;
	public String successnews_valdn;
	// public String post_stptitle_vladn;

	public PostButtonTest() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		initialization();
		report=ExtentFactory.Instance();
		homepage = new HomePage();
		System.out.println("Browser launched of STP");

		post = new PostPages();
		
		//test=report.startTest("PostPageTest-->Verify PostPage of STP");
	}

	@Test(priority = 17)
	
	public void AddPostTest() throws Exception {
		
		Thread.sleep(20000);
		homepage.verifyHelpPopup();
		Thread.sleep(2000);
		test=report.startTest("PostPageTest-->Verify AddPostTest of STP");
		homepage.ClickOnPostButton();
		System.out.println("Navigated to the AddPost");
		test.log(LogStatus.PASS, "Navigated to the AddPost");

	}
//	@Test(priority = 14)
//	public void ClickOnPostButtonWithEmptyDetails() throws Exception
//	{
//		test=report.startTest("verifyEmptyPostButton");
//		Thread.sleep(2000);
//		post.ClickOnPostWithEmptyDetails(test);
//		report.endTest(test);
//	}
	
	@Test(priority = 18)
	public void verifyCancelButtonTest() throws Exception
	{
		
		Thread.sleep(2000);
		test=report.startTest("PostPageTest-->Verify CancelButtonTest of STP");
		post.ClickOnCancelButton();
		System.out.println("Cancel button is validated");
		test.log(LogStatus.PASS,"Cancel button is validated");
	}

	@Test(priority = 19)
	
	public void verifyPostPageTest() throws Exception {
		
		Thread.sleep(2000);
		test=report.startTest("PostPageTest-->Verify PostPageTest of STP");
		homepage.ClickOnPostButton();
		System.out.println("Navigated to the AddPost for validating success stories");
		post.verifySuccessStoriescategoryBox();
		test.log(LogStatus.PASS, "Navigated to the AddPost for success stories");
	}
	
	
@Test(priority = 20)
	
	public void verifySuccessStoriesIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		test=report.startTest("PostPageTest-->verifySuccessStoriesIcon of STP");
		Thread.sleep(2000);
		if(!homepage.STPSuccessStoriesIcon.isEnabled())
		{
			System.out.println("STP SuccessStories Icon button is not enabled");
		}
		else
		{
			homepage.STPSuccessStoriesIcon.click();
			System.out.println("STP SuccessStories Icon button is enabled now");
			test.log(LogStatus.PASS, "STP SuccessStories Icon button is enabled now");
		}
	}
	
@Test(priority = 21)
	
	public void verifySuccessStoryNews() throws Exception {
			
	test=report.startTest("PostPageTest-->verifySuccessStoryNews of STP");
		
		// *[@id="root"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/span/div[1]
		String beforexpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[";
		String afterxpath = "]/span/div[1]";
		int success_rowcount = homepage.Successwebtablerows.size();
		System.out.println("STP Webtable rowcount is " +success_rowcount);
		

		for (int i = 1; i < success_rowcount; i++) {
			String success_name = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();
			System.out.println("Success name is " +success_name);
			if (success_name.contains(post.Success_titledata_valdn)) {
				successnews_valdn = homepage.Success_EnteredSTPToolData.getText();
				System.out.println("Success News data validation" + successnews_valdn);
				break;
				
			}
		}
		test.log(LogStatus.PASS, "STP SuccessStoryNews is Verified");
			
	}


	@Test(priority = 22)
	
	public void verifyPostbuttonClickAfterSuccessStories() throws IOException, Exception {
		test=report.startTest("PostPageTest-->verifyPostbuttonClickAfterSuccessStories validation in STP");
		Thread.sleep(4000);
		 post.PostbuttonClickAfterSuccessStories();
		 System.out.println("Post button clicked after successs stories validation");
		 test.log(LogStatus.PASS, "Post button clicked after successs stories validation");
	}

	@Test(priority = 23)
	
	public void verifySTPToolStory() throws IOException, Exception {
		test=report.startTest("PostPageTest-->verifySTPToolStory of STP");
		Thread.sleep(1000);
		post.verifySTPToolcategoryBox();
		System.out.println("STP Tool category validation");
		test.log(LogStatus.PASS, "STP Tool category validation is completed");
		
	}
	

	

	@Test(priority = 24)
	
	public void verifySTPNews() throws Exception {
		// *[@id="root"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/span/div[1]
		test=report.startTest("PostPageTest-->verifySTPNews of STP");
		Thread.sleep(3000);
		homepage.STPSuccessStoriesIcon.click();
		System.out.println("STP SuccessStories Icon button is disabled now");
		System.out.println("Now STP Tool Icon is to validate the STPNews List");
		
		String beforexpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[";
		String afterxpath = "]/span/div[1]";
		int stp_rowcount = homepage.STPwebtablerows.size();
		System.out.println("STP row count is " +stp_rowcount);

		for (int i = 1; i < stp_rowcount; i++) {
			String stp_name = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();
			System.out.println("STP name is" +stp_name);
			if (stp_name.contains(post.stp_titledata_valdn)) {
				stptoolnews_valdn = homepage.STP_EnteredSTPToolData.getText();
				System.out.println("STP News data validation" + stptoolnews_valdn);
				break;

			}

		}
		test.log(LogStatus.PASS, "STPNews is Verified");
		
	}
	

	/*
	 * @Test(priority=5) public void verifySTPToolIcon() throws Exception {
	 * homepage.ClickOnSTPToolIcon();
	*
	 * List<WebElement>stpnews_list=driver.findElements(By.
	 * xpath("//div[@class='news-title fs-15p font-weight-bold break-word']"));
	 * System.out.println("size of stpnews_list is" +stpnews_list);
	 * 
	 * stptooldata_valdn=homepage.EnteredSTPToolData.getText();
	 * System.out.println("Stptooldatavaliation is " +stptooldata_valdn);
	 * 
	 * 
	 * if(stptooldata_valdn.equalsIgnoreCase(post.titledata_valdn)) {
	 * 
	 * //Assert.assertEquals(stptooldata_valdn, post.titledata_valdn);
	 * System.out.println(" Actual and expected results is matched ");
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
	
	@AfterMethod
	public void TearDown(ITestResult testResult) throws IOException
	{
		if(testResult.getStatus()==ITestResult.FAILURE)
		{
			//takeScreenshotAtEndOfTest(testResult.getMethod().getMethodName());
			String path=TestBase.Screenshot(driver,  testResult.getName());
			String imgPath=test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "VerifyTestresults", imgPath);
		}
		
	}
	

	@AfterClass(alwaysRun = true)
public void CloseConnection() {
	driver.close();
		report.endTest(test);
		report.flush();
	}
}

