//package com.qa.testcases;
//
//
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.qa.Base.TestBase;
//import com.qa.ExtentReportListner.ExtentFactory;
//import com.qa.pages.HomePage;
//import com.qa.pages.LoginPage;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//
//public class LoginPageTest extends TestBase{
//	LoginPage loginpage;
//	ExtentTest test;
//	ExtentReports report;
////	
//	
//	public LoginPageTest(){
//	super();
//	}
//	
//	@BeforeClass
//	public void setUp(){
//	initialization();
//		loginpage = new LoginPage();
//		System.out.println("Browser launched of STP");
//		report=ExtentFactory.Instance();
//		test=report.startTest("Verify Browser");
//		test.log(LogStatus.INFO, "Browser started");
//	}
//	
//	@Test(priority=1)
//	public void verifyHelpPopupTest() throws Exception {
//		test=extent.createTest("LoginPageTitle");
//		//loginPage.validateLoginPageTitle();
//		System.out.println("Helppoup is present");
//
//	}
//
//	
//	@Test(priority = 2)
//	public void verifyHomeIconTest() {
//		test=extent.createTest("CRM Image");
//		Assert.assertTrue(loginpage.validateCRMImage());
//		System.out.println("homepage icon is present");
//
//	}
//	
//	@Test(priority = 3)
//	public void login() {
//		test=extent.createTest("Login Creditianls");
//		loginpage.login("eclipse", "password");
//		System.out.println("Validating the login creditianls");
//
//	}
//	  @AfterMethod
//	   public void teardown()
//	   {
//	  
//	   }
//	
////	@Test(priority=1)
////	public void loginPageTitleTest(){
//////		String title = loginPage.validateLoginPageTitle();
//////		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
////		 test = extent.createTest("functionality1Test1");
////	        Assert.assertTrue(1 > 0);
////	}
////	
////	@Test(priority=2)
////	public void crmLogoImageTest(){
//////		boolean flag = loginPage.validateCRMImage();
//////		Assert.assertTrue(flag);
////		 test = extent.createTest("functionality1Test2");
////	        Assert.assertEquals("Krishna", "Sakinala");
////	        
////	      
////	}
////	
////	@Test(priority=3)
////	public void loginTest(){
////		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
////		test = extent.createTest("functionality1Test3");
////        Assert.assertNotEquals("Krishna", "Krishna");
////	}
////	
////	
//	
//	
//	
//	
//	
//	
//
//}