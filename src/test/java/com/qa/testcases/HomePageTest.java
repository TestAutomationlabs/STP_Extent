package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homepage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		homepage=new HomePage();
	}
	
	
  @Test
	public void verifyHomeIconTest()
	{
			Assert.assertTrue(homepage.verifyHomeIcon());
			System.out.println("homepage icon is present");
		}
  
  
  @Test (priority=2)
	public void verifyListTabTest() throws Exception {
	  homepage.verifyListTab();
		System.out.println("Naviagated to listpage");
	}
}
