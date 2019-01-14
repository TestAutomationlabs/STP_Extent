<<<<<<< HEAD
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
	public void setUp() throws Exception {

		initialization();
		Thread.sleep(3000);
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
=======
package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.ExtentReportListner.ExtentReport;
import com.qa.pages.HomePage;
import com.qa.pages.STPDetailsValidationPage;
import com.relevantcodes.extentreports.LogStatus;
import com.qa.ExtentReportListner.ExtentReportNG;

public class HomePageTest extends TestBase {
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();

		homepage = new HomePage();

		System.out.println("Browser launched of STP");

	}

	@Test(priority=1)
	public void verifyHelpPopupTest() throws Exception {
		homepage.verifyHelpPopup();
		System.out.println("Helppoup is present");

	}

	
	@Test(priority = 2)
	public void verifyHomeIconTest() {
		Assert.assertTrue(homepage.verifyHomeIcon());

		System.out.println("homepage icon is present");

	}

	@Test(priority = 3)
	public void verifyListTabTest() throws Exception {
		homepage.verifyListTab();
		System.out.println("ListPage is present");

	}
	
	@Test(priority = 4)
	public void verifyNetworkTabTest() throws Exception {
		homepage.verifyNetworkTab();
		System.out.println("NetworkPage is present");

	}
	
	@Test(priority = 5)
	public void verifyConnectionTabTest() throws Exception {
		homepage.verifyConnectionTab();
		System.out.println("ConnectionPage is present");

	}
	
	@Test(priority = 6)
	public void verifySuccessStoriesIConTest() throws Exception {
		homepage.VerifySuccessStoriesIconButton();
		System.out.println("ConnectionPage is present");

	}

	
	@Test(priority = 7)
	public void verifySTPToolIconTest() throws Exception {
		homepage.VerifySTPToolIconButton();
		System.out.println("ConnectionPage is present");

	}


	@AfterClass
	public void TearDown() {
		driver.close();
	}
}
>>>>>>> 498d5684e312d732ead2f54769112ab78b218cc8
