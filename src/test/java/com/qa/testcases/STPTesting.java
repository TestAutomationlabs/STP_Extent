package com.qa.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.qa.Base.TestBase;
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;
import com.qa.pages.STPDetails;
import com.qa.pages.STPDetailsValidationPage;

import com.qa.pages.ToastMessages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class STPTesting extends TestBase{
	
	//STPDetailsValidationPage validation;
	CreateSTPPage create;
	HomePage home;
	ToastMessages toast;
	STPDetails details;
	ExtentTest test;
	ExtentReports report;
	ListPage list;


	public STPTesting()
	{
		super();
	}
	

	@BeforeClass
	public void setup() {
		initialization();
		create = new CreateSTPPage();
		home = new HomePage();
		toast = new ToastMessages();
		details = new STPDetails();
	}
		@Test(priority = 1)
		public void HelpTextValidation() throws Exception {
			//Reporter		
			//test = report.startTest("Create STP Help Text Validation");
			//Thread.sleep(5000);
			
			//WebDriverWait wait = new WebDriverWait(driver, 45, 1000);
			
			
			
			Thread.sleep(20000);
			
			home.Closepopup();
			Thread.sleep(2000);
			home.ClickOnSTPLink();
			Thread.sleep(1000);
			create.closeHelppopup();
			Thread.sleep(3000);
			create.HelpToggleValidation();
		}

		@Test(priority = 2)
		public void MandatoryFieldValidation() throws Exception
		{
			//test = report.startTest("Create STP Mandatory field validation");
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
		
		@Test(priority = 3)
		public void AllFieldValidation() throws Exception
		{
			//test = report.startTest("Create STP All Field Validation");
			
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
			home.Closepopup();
			
			home.ClickOnSTPLink();
			Thread.sleep(1000);
			create.closeHelppopup();
			create.EnterALLFields();
			Thread.sleep(2000);
			toast.successfulToast(6);
			details.detailsValidation(6);
			//validation.detailsValidation(6);
		}

	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}	
}
