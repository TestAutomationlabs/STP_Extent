package com.qa.testcases;

import java.io.File;
import java.io.IOException;

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
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;
import com.qa.pages.STPDetails;
import com.qa.pages.ToastMessages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListner.class)
public class STPTesting extends TestBase{

	//STPDetailsValidationPage validation;
	ITestResult testResult;
	CreateSTPPage create;
	HomePage home;
	ToastMessages toast;
	STPDetails details;
	
	ListPage list;
	//TestUtil time;
	
	ExtentTest test;
	ExtentReports report;


	public STPTesting()
	{
		super();
	}


	@BeforeClass(alwaysRun = true)
	public void setup() {
		initialization();
		report=ExtentFactory.Instance();
		create = new CreateSTPPage();	
		home = new HomePage();
		toast = new ToastMessages();
		details = new STPDetails();
	}

	@Test(priority = 9)
	public void DiscardButtonValidation() throws Exception
	{
		test = report.startTest("STPTesting--> Create STP Discard button Validation");
		Thread.sleep(20000);
		home.verifyHelpPopup();
		Thread.sleep(2000);
		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.closeHelppopup();
		Thread.sleep(3000);
		try
		{
		create.Discard().click();
		
		test.log(LogStatus.PASS, "Discard button clicked");
		}
		catch(Exception e)
		{
			
			test.log(LogStatus.FAIL, "Discard button not functioning as expected");
			TearDown(testResult);
		}	
	}

		//@Test(priority = 10)
		public void HelpTextValidation() throws Exception {

			test = report.startTest("STPTesting--> Create STP Help Text Validation");
			try {
			Thread.sleep(5000);
			home.verifyHelpPopup();
			Thread.sleep(1000);
			home.ClickOnSTPLink();
			Thread.sleep(1000);
			create.closeHelppopup();
			Thread.sleep(3000);
			create.HelpToggleValidation();
			test.log(LogStatus.PASS, "HelpToggleValidation is completed");
			}
			catch(Exception e)
			{
				test.log(LogStatus.FAIL, "Failed at Help Text Validation");	
				test.log(LogStatus.ERROR, e);
			}
		}
		

		//@Test(priority = 11)
		public void MandatoryFieldValidation() throws Exception
		{
			test = report.startTest("STPTesting-->Create STP Mandatory field validation");
				Thread.sleep(3000);
			try {

				create.closeHelppopup();
					for (int i=5; i<6 ; i++)
					{
					create.EnterMandatoryFields(i);
					toast.fullnameToast(i);
					toast.DescriptionToast(i);
					toast.CommunityOrganiserToast(i);
					toast.successfulToast(i);
					details.detailsValidation(5);

					}
				}
			catch(Exception e)
			{
				test.log(LogStatus.INFO, "An Exception occured while testing Mandatory fields");
				//test.log(LogStatus.FAIL, e);
			}
			
		}
		
	//	@Test(priority = 12)
		public void AllFieldValidation() throws Exception
		{
			test = report.startTest("STPTesting-->Create STP All Fields Validation");
			Thread.sleep(3000);
			try
			{
				if (create.Discard().isDisplayed())
				{
					create.Discard().click();
				}
			}
			catch(Exception e)
			{
				System.out.println("Discard Button not present. ready to go with home button");
			}
			home.verifyHelpPopup();
			Thread.sleep(2000);
			home.ClickOnSTPLink();
			Thread.sleep(2000);
			create.closeHelppopup();
			Thread.sleep(2000);
			try {

				create.EnterALLFields();
				Thread.sleep(2000);
				toast.successfulToast(6);
				details.detailsValidation(6);

			}
			catch(Exception e)
			{
				test.log(LogStatus.INFO, "All Field validation failed due to the below exception");
				//test.log(LogStatus.FAIL, e);
			}

			
		}

	@Test(priority = 13)
	public void MySTPTest() throws IOException
	{
		test = report.startTest("STPTesting-->Verify My STPs");
		try{
			
			home.verifyHomeIconClick();
			home.verifyHelpPopup();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Navigated to Home Page");
				try{
						home.testFindInMySTP();
				}
				catch(Exception e)
				{
					test.log(LogStatus.FAIL, "An Exception was found at MySTPs table");
					TearDown(testResult);
				}
			}
			catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Navigation to Home Page unsuccessful");
			TearDown(testResult);
	}
		
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