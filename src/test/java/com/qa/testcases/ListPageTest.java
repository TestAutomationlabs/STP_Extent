package com.qa.testcases;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ListPageTest extends TestBase {

	HomePage home;
	ListPage list;
	ExtentTest test;
	ExtentReports report;

	public ListPageTest() {
		super();
	}

	//This is uday's code
	@BeforeClass
	public void setup() {
		initialization();
		home = new HomePage();
		String ClassName = this.getClass().getSimpleName().toString();
		
		list = new ListPage();
		report = new HomePageTest().initializeExtentReport();
		report = new ExtentReports("./Reports/Report of   "+ClassName+".html",true);
				report = new ExtentReports("./Reports/"+ClassName+".html",true);
				report.loadConfig(new File("./extent-config.xml"));
		//test = report.startTest("List Tab Validation");	
	}
	
	@Test(priority = 11)
	//@Test(priority = 1)
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
	//@Test(priority = 2)
	public void categoryValidation() throws Exception
	{
		//Thread.sleep(5000);
		test = report.startTest("Category Validation");	
//		Thread.sleep(25000);
//		home.verifyHelpPopup();
//		Thread.sleep(2000);
//		home.verifyListTab();
		Thread.sleep(3000);
		list.clearSearchField();
		Thread.sleep(1000);
		list.FilterByCategory(test);
		report.endTest(test);
	}

	
	@AfterClass(alwaysRun = true)
	public void TearDown() {
		
		driver.close();
		report.flush();
		report.close();
	}
	
	@AfterSuite
	public void terminateReport()
	{
//		report.endTest(test);
		report.flush();
		report.close();
	}
}