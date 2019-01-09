package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.ExtentReportListner.ExtentReport;
import com.qa.pages.HomePage;
import com.qa.pages.STPDetailsValidationPage;
import com.relevantcodes.extentreports.LogStatus;
import com.qa.ExtentReportListner.ExtentReportNG;

public class HomePageTest extends TestBase {
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();

		homepage = new HomePage();

		System.out.println("Browser launched of STP");

	}

	@Test
	public void verifyHomeIconTest() {
		Assert.assertTrue(homepage.verifyHomeIcon());

		System.out.println("homepage icon is present");

	}

	@Test(priority = 2)
	public void verifyListTabTest() throws Exception {
		homepage.verifyListTab();
		System.out.println("Naviagated to listpage");

	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}
}
