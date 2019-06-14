
package com.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListner.class)

public class HomePageTest extends TestBase {
	HomePage homepage;
	ExtentReports report;
	ExtentTest test;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		report=ExtentFactory.Instance();
		homepage = new HomePage();
		
//		test=report.startTest("Verify HomePage of STP");
		System.out.println("Browser launched of STP");
		

	}

	@Test(priority=1)
	public void verifyHelpPopupTest() throws Exception, InterruptedException {
		test=report.startTest("HomePage-->VerifyHelpPOpup");
		homepage.verifyHelpPopup();
		System.out.println("Helppoup is present");
		test.log(LogStatus.PASS, "Helppoup is present");
		//report.endTest(test);

	}

	
	@Test(priority = 2)
	public void verifyHomeIconTest() {
		test=report.startTest("HomePage-->verifyHomeIconTest");
		Assert.assertTrue(homepage.verifyHomeIcon());

		System.out.println("homepage icon is present");
		test.log(LogStatus.PASS, "homepage is present");
		//report.endTest(test);
	}

	@Test(priority = 3)
	public void verifyListTabTest() throws InterruptedException {
		test=report.startTest("HomePage-->verifyListTabTest");
		homepage.verifyListTab();
		System.out.println("HomePage-->ListPage is present");
		test.log(LogStatus.PASS, "ListPage is present");
		//report.endTest(test);
	}
	
	@Test(priority = 4)
	public void verifyNetworkTabTest() throws InterruptedException {
		test=report.startTest("HomePage-->verifyNetworkTabTest");
		homepage.verifyNetworkTab();
		System.out.println("HomePage-->NetworkPage is present");
		test.log(LogStatus.PASS, "Networktab is present ");
		//report.endTest(test);
	}
	
	@Test(priority = 5)
	public void verifyConnectionTabTest() throws InterruptedException {
		test=report.startTest("HomePage-->verifyConnectionTabTest");
		homepage.verifyConnectionTab();
		System.out.println("HomePage-->ConnectionPage is present");
		test.log(LogStatus.PASS, "Connectiontab is present ");
		//report.endTest(test);

	}
	
	@Test(priority = 6)
	public void verifySuccessStoriesIConTest() throws InterruptedException {
		test=report.startTest("HomePage-->verifySuccessStoriesIconTest");
		homepage.VerifySuccessStoriesIconButton();
		System.out.println("success stories icon is displayed");
		test.log(LogStatus.PASS, "SuccessStories icon is displayed ");
		//report.endTest(test);


	}

	
	@Test(priority = 7)
	public void verifySTPToolIconTest() throws InterruptedException {
		test=report.startTest("HomePage-->verifySTPToolIconTest");
		homepage.VerifySTPToolIconButton();
		System.out.println("ConnectionPage is present");
		test.log(LogStatus.PASS, "STPToolIconButton is displayed");
		//report.endTest(test);

	}


	@Test(priority = 8)
    public void VerifyHelpMark() throws InterruptedException
    {
		test=report.startTest("HomePage-->verifyHelpMarkTest");
        homepage.getHelpMark();
        Thread.sleep(1000);
        homepage.getCloseHelpMark();
        test.log(LogStatus.PASS, "HelpMark is Displayed and validated");
       
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

