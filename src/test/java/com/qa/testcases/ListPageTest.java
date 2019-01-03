package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ListPage;

public class ListPageTest extends TestBase {

	HomePage home;
	ListPage list;
	
	public ListPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
		home = new HomePage();
		list = new ListPage();
	}
	
	@Test
	public void SearchSTPTest() throws InterruptedException
	{
		home.verifyListTab();
		Thread.sleep(1000);
		list.searchSTP();
	}
	
	@Test
	public void categoryValidation()
	{
		list.clearSearchField();
		
	}
}
