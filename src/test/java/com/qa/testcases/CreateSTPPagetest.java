package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;
import com.qa.pages.STPDetailsValidationPage;
import com.qa.pages.ToastMessages;

public class CreateSTPPagetest extends TestBase {

	CreateSTPPage create;
	HomePage home;
	ToastMessages toast;
	STPDetailsValidationPage validation;
	
	
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
		
	}

	@Test(priority = 1)
	public void HelpTextValidation() throws Exception {

		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.HelpToggleValidation();

	}

	@Test(priority = 2)

	public void MandatoryFieldValidation() throws Exception
	{
		for (int i=1; i<6 ; i++)
		{
		create.EnterMandatoryFields(i);
		toast.fullnameToast(i);
		toast.DescriptionToast(i);
		toast.CommunityOrganiserToast(i);
		toast.successfulToast(i);
		validation.detailsValidation(5);
		
		}
	}
	
	@Test(priority = 3)
	public void AllFieldValidation() throws Exception
	{
		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.EnterALLFields();
		Thread.sleep(3000);
		toast.successfulToast(6);
		validation.detailsValidation(6);
		
		
	}

@AfterClass
public void CloseBrowser()
{
	driver.close();
}
}
