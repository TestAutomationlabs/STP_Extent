package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.qa.Base.TestBase;
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;
import com.qa.pages.STPDetails;
import com.qa.pages.ToastMessages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class STPTesting extends TestBase {

	CreateSTPPage create;
	HomePage home;
	ToastMessages toast;
	STPDetails details;
	ExtentTest test;
	ExtentReports report;
	ListPage list;

	public STPTesting() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		create = new CreateSTPPage();
		home = new HomePage();
		toast = new ToastMessages();
		list = new ListPage();
		details = new STPDetails();
	}

	@Test(priority = 1)
	public void HelpTextValidation() throws Exception {
		home.ClickOnSTPLink();
		Assert.assertTrue(true);
		Thread.sleep(1000);
		create.HelpToggleValidation();
	}

	@Test(priority = 2)
	public void MandatoryFieldValidation() throws Exception {

		for (int i = 5; i < 6; i++) {
			create.EnterMandatoryFields(i);
			toast.fullnameToast(i);
			toast.DescriptionToast(i);
			toast.CommunityOrganiserToast(i);
			toast.successfulToast(i);
			details.detailsValidation(5);
		}
	}

	@Test(priority = 3)
	public void AllFieldValidation() throws Exception {
		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.EnterALLFields();
		Thread.sleep(3000);
		toast.successfulToast(6);
		Thread.sleep(2000);
		details.detailsValidation(6);
	}

	@Test(priority = 4)
	public void SearchSTPTest() throws Exception {
		try {
			if (create.getDiscard().isDisplayed()) {
				create.clickDiscard();
			}
		} catch (Exception e) {
			System.out.println("Discard button not present");
		}
		home.verifyHomeIcon();
		home.verifyListTab();
		Thread.sleep(1000);
		list.searchSTP();
	}

	@Test(priority = 5)
	public void categoryValidation() throws Exception {
		list.clearSearchField();
		Thread.sleep(1000);
		list.FilterByCategory();
	}

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}
}
