package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.qa.Base.TestBase;
import com.qa.Util.TestUtil;
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;
import com.qa.pages.STPDetails;
import com.qa.pages.ToastMessages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


//This is uday's code
public class STPTesting extends TestBase{
	
	//STPDetailsValidationPage validation;
	CreateSTPPage create;
	HomePage home;
	ToastMessages toast;
	STPDetails details;
	ExtentTest test;
	ExtentReports report;
	ListPage list;
	TestUtil time;


	public STPTesting()
	{
		super();
	}
	
	
	@BeforeClass
	public void setup() {
		initialization();
//		String ClassName = this.getClass().getSimpleName().toString();
//		//report = new ExtentReports("./Reports/Report of   "+ClassName+".html",true);
//				report = new ExtentReports("./Reports/"+ClassName+".html",true);
//		report.loadConfig(new File("./extent-config.xml"));
		
		create = new CreateSTPPage();
		home = new HomePage();
		toast = new ToastMessages();
		details = new STPDetails();
		report = new HomePageTest().initializeExtentReport();
		//test = report.startTest("Add STP Validation");	
	}		
		
		@Test(priority = 8)
		public void discardValidation() throws InterruptedException
		{
			test = report.startTest("Create STP Discard Button Validation");	
			Thread.sleep(15000);
			
			report.endTest(test);
		}
		
		@Test(priority = 9)
		public void HelpTextValidation() throws Exception {
			
			test = report.startTest("Create STP Help Text Validation");	
			
			home.verifyHelpPopup(test);
			Thread.sleep(2000);
			home.ClickOnSTPLink();
			Thread.sleep(1000);
			create.closeHelppopup();
			Thread.sleep(3000);
			create.HelpToggleValidation(test);
			
			report.endTest(test);
			
		}

		@Test(priority = 10)
		public void MandatoryFieldValidation() throws Exception
		{
			test = report.startTest("Create STP Mandatory field validation");
			
			try {
					
					for (int i=5; i<6 ; i++)
					{
					create.EnterMandatoryFields(i, test);
					toast.fullnameToast(i, test);
					toast.DescriptionToast(i, test);
					toast.CommunityOrganiserToast(i, test);
					toast.successfulToast(i, test);
					details.detailsValidation(5);
					
					}
				}
			catch(Exception e)
			{
				test.log(LogStatus.INFO, "An Exception occured while testing Mandatory fields");
				test.log(LogStatus.FAIL, e);
			}
			report.endTest(test);
		}
		
		
		@Test(priority = 11)
		public void AllFieldValidation() throws Exception
		{
			test = report.startTest("Create STP All Fields Validation");	
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
			//home.verifyHelpPopup(test);
			Thread.sleep(2000);
			home.ClickOnSTPLink();
			Thread.sleep(2000);
			create.closeHelppopup();
			Thread.sleep(2000);
			try {
			
				create.EnterALLFields(test);
				Thread.sleep(2000);
				toast.successfulToast(6, test);
				details.detailsValidation(6);
				
			}
			catch(Exception e)
			{
				test.log(LogStatus.INFO, "All Field validation failed due to the below exception");
				test.log(LogStatus.FAIL, e);
			}
			
			report.endTest(test);
		}
	@AfterClass
	public void closeReporter()
	{
		//report.endTest(test);
		driver.close();
		report.flush();
		report.close();
	}	
}
