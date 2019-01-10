package com.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;

public class HomePagesTest extends TestBase {

	HomePage home;

	public HomePagesTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		home = new HomePage();
	}

	@Test(priority = 1)
	public void verifyHomeIconTest() throws Exception {

		home.verifyHomeIcon();
		Thread.sleep(1000);
		System.out.println("HOme icon is displayed");

	}

	@Test(priority = 2)
	public void verifyListTabTest() throws Exception {
		home.verifyListTab();
		System.out.println("Naviagated to listpage");
	}

//
//	@AfterClass
//	public void CloseBrowser() {
//		driver.close();
//	}
}
