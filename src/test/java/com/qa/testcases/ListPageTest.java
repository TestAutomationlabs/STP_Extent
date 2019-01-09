package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;

public class ListPageTest extends TestBase {

	HomePage home;
	ListPage list;

	public ListPageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		home = new HomePage();
		list = new ListPage();
	}

	@Test(priority = 4)
	public void SearchSTPTest() throws Exception {
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
	public void TearDown() {
		driver.close();
	}
}
