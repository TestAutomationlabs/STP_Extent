package com.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Util.CustomListner;
import com.qa.pages.HomePage;
import com.qa.pages.STPDetailsValidationPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListner.class)
public class STPDetailsVAlidationTest extends TestBase {
	HomePage homepage;
	STPDetailsValidationPage stpdetails;
	ExtentTest test;
	ExtentReports report;

	public STPDetailsVAlidationTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException {
		initialization();
		Thread.sleep(3000);
		homepage = new HomePage();
		System.out.println("Browser launched of STP");
		String ClassName = this.getClass().getSimpleName().toString();
		//report = new ExtentReports("./Reports/Report of   "+ClassName+".html",true);
				report = new ExtentReports("./Reports/"+ClassName+".html",true);
        report.loadConfig(new File("./extent-config.xml"));
		stpdetails = new STPDetailsValidationPage();

	}
	@Test(priority=24)
	public void HelpPoupTest() throws Exception
	{
		test= report.startTest("HelpPopup test");
		Thread.sleep(20000);
		homepage.verifyHelpPopup(test);
		System.out.println("Validation of helpopup is completed");
		test.log(LogStatus.PASS, "Validation of helpopup is completed");
		homepage.verifyHelpPopup(test);
		report.endTest(test);
	}
	
	@Test(priority = 25)
	public void CreateSTPValidateTest() throws Exception {
		test= report.startTest("STP Link Validation");
		homepage.ClickOnSTPLink();
		System.out.println("User tap on STPButton");
		test.log(LogStatus.PASS, "User tap on STPButton");
		Thread.sleep(1000);
		stpdetails.closeHelppopup();
		test.log(LogStatus.PASS, "User tap on ClosePopupButton for STP");
		System.out.println("User tap on ClosePopupButton for STP");
		//homepage.ClickOnSTPToolIcon();
		//test.log(LogStatus.PASS, "Click on STP Tool Icon");
		report.endTest(test);
		
	}
	
	

	@Test(priority = 26)
	public void STPDetails() throws IOException, InterruptedException {
		test= report.startTest("STP Details Validation");
		stpdetails = new STPDetailsValidationPage();
		stpdetails.STPFields();
		System.out.println("User is validating Details page");
		test.log(LogStatus.PASS, "User is validating Details page");
		report.endTest(test);
	}

	@Test(priority = 27)
	public void verifyUserNameTest() {
		test= report.startTest("UserNameValidation");
		Assert.assertTrue(stpdetails.verifyCorrectUserName());
		System.out.println("Username text label is present");
		test.log(LogStatus.PASS, "UUsername text label is present. Hence UsernameValidation is Completed");
		report.endTest(test);
	}

	@Test(priority =28)
	public void validateUserLabelTest() throws Exception {
		test= report.startTest("ValidateUserLabel");
		stpdetails.validateuserlabel();
		System.out.println("Validation completed for userlabel");
		test.log(LogStatus.PASS, "User label is present. Hence Userlabel Validation is Completed");
		report.endTest(test);
	}

	@Test(priority = 29)
	public void verifyDescriptionLabelTest() throws Exception {
		test= report.startTest("DescriptionLabel");
		stpdetails.validatedescrptionlabel();
		System.out.println("Validation completed for descritption label");
		test.log(LogStatus.PASS, "Description present. Hence Description Validation is Completed");
		report.endTest(test);
	}

	@Test(priority = 30)
	public void verifyResourceValidationTest() throws Exception {
		test= report.startTest("ResourceValidation");
		stpdetails.resourcesvalidation();
		System.out.println("Resource validation is completed");
		test.log(LogStatus.PASS, "Resource validation is completed");
		report.endTest(test);
	}
	@Test(priority = 31)
	public void verifyIntrestingButtonTest() throws Exception {
		test= report.startTest("IntrestingButtonValidation");
		stpdetails.verifyIntrestingButton();
		System.out.println("Naviagated to Intresting page");
		homepage.verifyHomeIconClick();
		System.out.println("homepage icon is present");
		test.log(LogStatus.PASS, "Intresting Button validation is completed");
		report.endTest(test);
	}

	@Test(priority = 32)
	public void verifyIntrestingSTPSList() {
		int passcase = 0;
		test= report.startTest("IntrestingSTPSList");
		List<WebElement> intrestinglist = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div/div"));
		int interstinglistsize = intrestinglist.size();
		System.out.println("size of intresting list is" + interstinglistsize);

		for (int i = 0; i < interstinglistsize; i++) {
			System.out.println(intrestinglist.get(i).getText());

			if (intrestinglist.get(i).getText().equalsIgnoreCase(STPDetailsValidationPage.STPTextbox)) {
				System.out.println("Actual and expected details matched, Hence Intresting details are marking as "
						+ "passed test case");
				test.log(LogStatus.PASS, "Intresting STPsList is completed");
				passcase++;
				break;
			

		}
		if (passcase== 0)
		{
			test.log(LogStatus.FAIL, "Intresting STPsList is failed");
		}
	}
		report.endTest(test);
	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}

}
