
package com.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
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
	ExtentTest test;
	ExtentReports report;

	public String stptoolnews_valdn;
	public String successnews_valdn;
	// public String post_stptitle_vladn;

	public PostButtonTest() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		initialization();
		homepage = new HomePage();
		System.out.println("Browser launched of STP");
		String ClassName = this.getClass().getSimpleName().toString();
		//report = new ExtentReports("./Reports/Report of   "+ClassName+".html",true);
		report = new ExtentReports("./Reports/"+ClassName+".html",true);
        report.loadConfig(new File("./extent-config.xml"));
		// logger=report.startTest("PostPage");

		post = new PostPages();
	}

	@Test(priority=8)

	public void AddPostTest() throws Exception {

		test= report.startTest("Add Post test");
		Thread.sleep(20000);
		homepage.verifyHelpPopup(test);
		Thread.sleep(2000);
		homepage.ClickOnPostButton();
		System.out.println("Navigated to the AddPost");
		report.endTest(test);

	}
	@Test(priority=9)
	public void ClickOnPostButtonWithEmptyDetails() throws Exception
	{
		test=report.startTest("verifyEmptyPostButton");
		Thread.sleep(2000);
		post.ClickOnPostWithEmptyDetails(test);
		report.endTest(test);
	}

	@Test(priority=10)
	public void verifyCancelButtonTest() throws Exception
	{
		test= report.startTest("VerifyCancelbuttontest");
		Thread.sleep(2000);
		post.ClickOnCancelButton(test);
		System.out.println("Cancel button is validated");
		report.endTest(test);
	}

	@Test(priority=11)

	public void verifyPostPageTest() throws Exception {
		test= report.startTest("verifyPostPageTest");
		Thread.sleep(2000);
		homepage.ClickOnPostButton();
		System.out.println("Navigated to the AddPost for validating success stories");
		System.out.println("Navigated to the AddPost for validating success stories");
		post.verifySuccessStoriescategoryBox(test);
		report.endTest(test);
	}


@Test(priority=12)

	public void verifySuccessStoriesIcon() throws InterruptedException
	{
		test= report.startTest("verifySuccessStoriesIcon");
		Thread.sleep(2000);
		if(!homepage.STPSuccessStoriesIcon.isEnabled())
		{
			System.out.println("STP SuccessStories Icon button is not enabled");
		}
		else
		{
			homepage.STPSuccessStoriesIcon.click();
			test.log(LogStatus.PASS, "STP SuccessStories Icon button is enabled now");
			System.out.println("STP SuccessStories Icon button is enabled now");
			report.endTest(test);
		}
	}

@Test(priority=13)

	public void verifySuccessStoryNews() throws Exception {

		test= report.startTest("verifySuccessStoryNews");
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
		report.endTest(test);
	}


	@Test(priority=14)

	public void verifyPostbuttonClickAfterSuccessStories() throws IOException, Exception {
		test= report.startTest("ClickAfterSuccessStories");
		Thread.sleep(4000);
		 post.PostbuttonClickAfterSuccessStories(test);
		 System.out.println("Post button clicked after successs stories validation");
		 test.log(LogStatus.PASS, "Post button clicked after successs stories validation");
		 report.endTest(test);
	}

	@Test(priority=15)

	public void verifySTPToolStory() throws IOException, Exception {
		test= report.startTest("STPToolStory");
		post.verifySTPToolcategoryBox(test);
		System.out.println("STP Tool category validation");
		test.log(LogStatus.PASS, "STP Tool category validation is completed");
		report.endTest(test);
	}




	@Test(priority=16)

	public void verifySTPNews() throws Exception {
		// *[@id="root"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/span/div[1]
		test= report.startTest("verifySTPNews");
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
		report.endTest(test);
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

	@AfterClass(alwaysRun = true)
	public void TearDown() {
		driver.close();
		report.flush();
		report.close();
	}

}
