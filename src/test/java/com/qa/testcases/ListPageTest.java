package com.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.ExtentReportListner.ExtentFactory;
import com.qa.Util.CustomListner;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListner.class)
public class ListPageTest extends TestBase {

	HomePage home;
	ListPage list;
	ExtentTest test;
	ExtentReports report;

	public ListPageTest() {
		super();
	}

	
	@BeforeClass
	public void setup() {
		initialization();
		home = new HomePage();
		list = new ListPage();
		report=ExtentFactory.Instance();
	}
	
	
	
	@Test(priority = 14)
	//@Test
	public void SearchSTPTest() throws Exception
	{
		//test = report.startTest("Search Field Validation");	
		Thread.sleep(20000);
		home.verifyHelpPopup();
		Thread.sleep(2000);
		home.verifyListTabClick();
		Thread.sleep(2000);
		test=report.startTest("ListPageTest-->Verify SearchSTPTest of STP");
		test.log(LogStatus.PASS, "Navigated to the SearchSTP");
		list.searchSTP();
		
	}
	
	
	@Test (priority = 15)
    public void sharebutton() throws Exception
    {
//        test = report.startTest("Share mail Validation");
//        Thread.sleep(15000);
//        home.verifyHelpPopup(test);
        Thread.sleep(2000);
//        home.verifyListTabClick(test);
       // test=report.startTest("ListPageTest-->VerifyShareButton");
        list.clearSearchField();
        test.log(LogStatus.PASS, "Validated the clearSearch field of STP");
        Thread.sleep(2000);
        list.getlistSearch().sendKeys("FULLNAME120012");
        list.getlistSearch().sendKeys(Keys.RETURN);
        Thread.sleep(2000);
       // list.mailSharepopup(test);
        list.mailSharepopup();
       // report.endTest(test);
    }
	
	//@Test(priority = 16)
	//@Test
	public void categoryValidation() throws Exception
	{
		//Thread.sleep(5000);
		//test = report.startTest("Category Validation");	
//		Thread.sleep(25000);
//		home.verifyHelpPopup();
//		Thread.sleep(2000);
//		home.verifyListTab();
		Thread.sleep(3000);
		test=report.startTest("ListPageTest-->Verify ClearSearchFieldTest of STP");
		list.clearSearchField();
		test.log(LogStatus.PASS, "Validated the clearSearch field of STP");
		Thread.sleep(1000);
		list.FilterByCategory();
		test.log(LogStatus.PASS, "Validated the FilterBy category");
		
	}

	
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