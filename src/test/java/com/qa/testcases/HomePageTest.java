package com.qa.testcases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;



public class HomePageTest extends TestBase {
	HomePage homepage;
	

	public HomePageTest() {

		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void HelpPoupTest() throws Exception
	{
		//Assert.assertTrue(homepage.verifyHelpPopup());
		homepage.verifyHelpPopup();
		System.out.println("Validation of helpopup is completed");
	}
	
  @Test(priority = 2)
  public void verifyHomeIconTest()
	{
			Assert.assertTrue(homepage.verifyHomeIcon());
			System.out.println("homepage icon is present");
		}
  
  

	@Test(priority = 3)

	public void verifyListTabTest() throws Exception {
		Assert.assertTrue(homepage.verifyListTab());
		//homepage.verifyListTab();
		System.out.println("Listab is present");

	}

	@Test(priority=4)
	public void verifyNetworkTAbTest()
	{
		Assert.assertTrue(homepage.verifyNetworkTab());
		//homepage.verifyNetworkTab();
		System.out.println("Network tab is present");
	}

	@Test(priority=5)
	public void verifyConnectionTAbTest()
	{
		Assert.assertTrue(homepage.verifyConnectionTab());
		//homepage.verifyConnectionTab();
		System.out.println("Network tab is present");
	}



//	@AfterClass
//	public void TearDown() {
//		driver.close();
//	}

}
