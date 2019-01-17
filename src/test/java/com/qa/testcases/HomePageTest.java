
package com.qa.testcases;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.STPDetailsValidationPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageTest extends TestBase {
	HomePage homepage;
	ExtentTest test;
	ExtentReports report;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();

		homepage = new HomePage();
		System.out.println("Browser launched of STP");
		String ClassName = this.getClass().getSimpleName().toString();
		report = new ExtentReports("./Reports/Report of   "+ClassName+".html",true);
		report.loadConfig(new File("./extent-config.xml"));

	}

	@Test(priority=1)
	public void verifyHelpPopupTest() throws Exception {
		test = report.startTest("Help pop-up in Home Page");	
		homepage.verifyHelpPopup();
		System.out.println("Helppoup is present");
		report.endTest(test);
	}

	
	@Test(priority = 2)
	public void verifyHomeIconTest() {
		Assert.assertTrue(homepage.verifyHomeIcon());

		System.out.println("homepage icon is present");

	}

	@Test(priority = 3)
	public void verifyListTabTest() throws Exception {
		homepage.verifyListTab(test);
		System.out.println("ListPage is present");

	}
	
	@Test(priority = 4)
	public void verifyNetworkTabTest() throws Exception {
		homepage.verifyNetworkTab();
		System.out.println("NetworkPage is present");

	}
	
	@Test(priority = 5)
	public void verifyConnectionTabTest() throws Exception {
		homepage.verifyConnectionTab();
		System.out.println("ConnectionPage is present");

	}
	
	@Test(priority = 6)
	public void verifySuccessStoriesIConTest() throws Exception {
		homepage.VerifySuccessStoriesIconButton();
		System.out.println("ConnectionPage is present");

	}

	
	@Test(priority = 7)
	public void verifySTPToolIconTest() throws Exception {
		homepage.VerifySTPToolIconButton();
		System.out.println("ConnectionPage is present");

	}


	@AfterClass
	public void TearDown() {
		driver.close();
		report.flush();
		report.close();
	}
}

