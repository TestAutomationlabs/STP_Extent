
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
		homepage.verifyHelpPopup(test);
		System.out.println("Helppoup is present");
		report.endTest(test);
	}

	
	@Test(priority = 2)
	public void verifyHomeIconTest() {
		test = report.startTest("Home Icon Home Page");
		//Assert.assertTrue(homepage.verifyHomeIcon());
		homepage.verifyHomeIcon(test);
		System.out.println("homepage icon is present");
		report.endTest(test);
	}

	@Test(priority = 3)
	public void verifyListTabTest() throws Exception {
		test = report.startTest("List Tab Home Page");
		homepage.verifyListTab(test);
		System.out.println("ListPage is present");
		report.endTest(test);
	}
	
	@Test(priority = 4)
	public void verifyNetworkTabTest() throws Exception {
		test = report.startTest("Network Tab Home Page");
		homepage.verifyNetworkTab(test);
		System.out.println("NetworkPage is present");
		report.endTest(test);
	}
	
	@Test(priority = 5)
	public void verifyConnectionTabTest() throws Exception {
		test = report.startTest("Connection Tab Home Page");
		homepage.verifyConnectionTab(test);
		System.out.println("ConnectionPage is present");
		report.endTest(test);
	}
	
	@Test(priority = 6)
	public void verifySuccessStoriesIConTest() throws Exception {
		test = report.startTest("Success Stories ICon Home Page");
		homepage.VerifySuccessStoriesIconButton(test);
		System.out.println("ConnectionPage is present");
		report.endTest(test);
	}

	
	@Test(priority = 7)
	public void verifySTPToolIconTest() throws Exception {
		test = report.startTest("STP Tool Icon Home Page");
		homepage.VerifySTPToolIconButton(test);
		System.out.println("ConnectionPage is present");
		report.endTest(test);
	}


	@AfterClass
	public void TearDown() {
		driver.close();
		report.flush();
		report.close();
	}
}

