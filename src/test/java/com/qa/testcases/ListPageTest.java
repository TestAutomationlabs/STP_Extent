/*package com.qa.testcases;

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
<<<<<<< HEAD
	
	@Test(priority = 1)
	public void SearchSTPTest() throws Exception
	{
=======

	@Test(priority = 4)
	public void SearchSTPTest() throws Exception {
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
		home.verifyListTab();
		Thread.sleep(1000);
		list.searchSTP();
	}
<<<<<<< HEAD
	
	@Test(priority = 2)
	public void categoryValidation() throws Exception
	{
=======

	@Test(priority = 5)
	public void categoryValidation() throws Exception {
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
		list.clearSearchField();
		Thread.sleep(1000);
		list.FilterByCategory();
	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}
}
*/