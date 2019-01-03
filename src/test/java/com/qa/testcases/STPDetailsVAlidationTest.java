package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.STPDetailsValidationPage;



public class STPDetailsVAlidationTest extends TestBase{
HomePage homepage;
STPDetailsValidationPage stpdetails;
	
	public STPDetailsVAlidationTest()
	{
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();

		homepage = new HomePage();
		stpdetails = new STPDetailsValidationPage();

	}
	
	@Test(priority=1)
	public void CreateSTPValidateTest() {
		homepage.ClickOnSTPLink();
		System.out.println("User tap on STPButton");
	}
	
	@Test(priority=2)
	public void STPDetails() throws IOException, InterruptedException {
		stpdetails=new STPDetailsValidationPage();
		stpdetails.STPFields();
		System.out.println("User is validating Details page");
	}
	
	@Test(priority=3)
	public void verifyUserNameTest()
	{
			Assert.assertTrue(stpdetails.verifyCorrectUserName());
			System.out.println("Username text label is present");
		}
	
	@Test(priority=4)
	public void validateUserLabelTest() throws Exception
	{
		stpdetails.validateuserlabel();
		System.out.println("Validation completed for userlabel");
		
	}
	
	@Test(priority=5)
	public void verifyDescriptionLabelTest() throws Exception
	{
		stpdetails.validatedescrptionlabel();
		System.out.println("Validation completed for descritption label");
		
		}
	
	@Test(priority=6)
	public void verifyResourceValidationTest() throws Exception
	{
		stpdetails.resourcesvalidation();
		System.out.println("Resource validation is completed");
		
		}
	
	}


