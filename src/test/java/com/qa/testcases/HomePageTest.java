package com.qa.testcases;

<<<<<<< HEAD
=======
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
<<<<<<< HEAD

public class HomePageTest extends TestBase{
	HomePage homepage;
	
	public HomePageTest()
	{
=======
import com.qa.pages.STPDetailsValidationPage;
import com.relevantcodes.extentreports.LogStatus;
import com.qa.ExtentReportListner.ExtentReportNG;

public class HomePageTest extends TestBase {
	HomePage homepage;

	public HomePageTest() {
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
		super();
	}

	@BeforeClass
	public void setUp() {
<<<<<<< HEAD
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
=======

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
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
	public void verifyListTabTest() throws Exception {
		homepage.verifyListTab();
		System.out.println("Naviagated to listpage");
<<<<<<< HEAD
	}
=======

	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
}
