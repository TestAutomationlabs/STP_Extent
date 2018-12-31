package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;
import com.qa.pages.ToastMessages;

public class CreateSTPPagetest extends TestBase {
	
	CreateSTPPage create;
	HomePage home;
	ToastMessages toast;
	
	public CreateSTPPagetest()
	{
		super();
	}
 
	@BeforeClass
	public void setup()
	{
		initialization();
		create=new CreateSTPPage();
		home = new HomePage();
		toast = new ToastMessages();
	}
	
	@Test
  public void HelpTextValidation() throws Exception {
		
		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.HelpToggleValidation();
		
	}
	
	@Test
	public void MandatoryFieldValidation() throws Exception
	{
		for (int i=1; i<6 ; i++)
		{
		create.EnterMandatoryFields(i);
		toast.fullnameToast(i);
		toast.DescriptionToast(i);
		toast.CommunityOrganiserToast(i);
		toast.successfulToast(i);
		}
	}
	
	@Test
	public void AllFieldValidation() throws Exception
	{
		home.ClickOnSTPLink();
		Thread.sleep(1000);
		
	}

@AfterClass
public void CloseBrowser()
{
	//driver.close();
}
}
	
	