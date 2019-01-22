package com.qa.testcases;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Util.CustomListner;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

//@Listeners(CustomListner.class)
public class ListPageTest extends TestBase {

	HomePage home;
	ListPage list;
	ExtentTest test;
	ExtentReports report;

	public ListPageTest() {
		super();
	}


	@BeforeClass
	public void setup() {
		initialization();
		String ClassName = this.getClass().getSimpleName().toString();
		home = new HomePage();
		list = new ListPage();
		report = new ExtentReports("./Reports/Report of   "+ClassName+".html",true);
		report.loadConfig(new File("./extent-config.xml"));
	}

	@Test(priority = 11)
	public void SearchSTPTest() throws Exception
	{
		test = report.startTest("Search Field Validation");
		Thread.sleep(25000);
		home.verifyHelpPopup(test);
		Thread.sleep(2000);
		home.verifyListTabClick(test);
		Thread.sleep(2000);
		list.searchSTP(test);
		report.endTest(test);
	}

	@Test(priority = 12)
	public void categoryValidation() throws Exception
	{
		test = report.startTest("Category Validation");
//		Thread.sleep(25000);
//		home.verifyHelpPopup();
//		Thread.sleep(2000);
//		home.verifyListTab();
		Thread.sleep(2000);
		list.clearSearchField();
		Thread.sleep(1000);
		list.FilterByCategory(test);
		report.endTest(test);
	}

	@AfterClass
	public void TearDown() {

		driver.close();
		report.flush();
		report.close();
	}
}
