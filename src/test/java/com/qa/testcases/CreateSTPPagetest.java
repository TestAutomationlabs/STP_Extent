package com.qa.testcases;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Util.ExtentContent;
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;
import com.qa.pages.STPDetails;
import com.qa.pages.STPDetailsValidationPage;
import com.qa.pages.ToastMessages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateSTPPagetest extends TestBase {

	CreateSTPPage create;
	HomePage home;
	ToastMessages toast;
	STPDetailsValidationPage validation;
	STPDetails details;
	ExtentTest test;
	ExtentReports report;
	
	public CreateSTPPagetest()
	{
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		create = new CreateSTPPage();
		home = new HomePage();
		toast = new ToastMessages();
		//	validation = new STPDetailsValidationPage();
		details = new STPDetails();
		String classnm = getClass().getSimpleName();
		report = ExtentContent.reporter(classnm);
	}

	@Test(priority = 1)
	public void HelpTextValidation() throws Exception {
		//Reporter		
		test = report.startTest("Create STP Help Text Validation");
		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.HelpToggleValidation();

	}

	@Test(priority = 2)

	public void MandatoryFieldValidation() throws Exception
	{
		//test = report.startTest("Create STP Mandatory field validation");
		for (int i=1; i<6 ; i++)
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
		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.EnterALLFields();
		Thread.sleep(3000);
		toast.successfulToast(6);
		//validation.detailsValidation(6);
		
		
	}

@AfterClass
public void CloseBrowser(ITestResult result)
{
	if (result.getStatus() == ITestResult.FAILURE)
	{
		test.log(LogStatus.FAIL, "Test Failed at "+ result.getName());	
		test.log(LogStatus.FAIL, "Error accured was:"+ result.getThrowable());
	}
	else if (result.getStatus() == ITestResult.SKIP)
	{
		test.log(LogStatus.SKIP, "Test skipped at "+ result.getName());
		test.log(LogStatus.SKIP, "Error accured was:"+ result.getThrowable());
	}
	report.endTest(test);
	report.flush();
	report.close();
	
	driver.close();
}
}
