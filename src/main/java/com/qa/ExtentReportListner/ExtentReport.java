package com.qa.ExtentReportListner;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;

import com.qa.pages.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	ExtentReports report;
	public ExtentTest logger;
	
	public void ExtentReportInitilization()
	{
		String currentDir = System.getProperty("user.dir");		
		report = new ExtentReports(currentDir+ "/test-output/"+"STP_Extent_Post.html");
		
	}

	public void passTest()
	{
		logger = report.startTest("passTest");
		 Assert.assertTrue(true);
		 //To generate the log when the test case is passed
		 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		 }
	
	
	 public void failTest(){
	 logger = report.startTest("failTest");
	 Assert.assertTrue(false);
	 logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	 }
	 
	 
	 public void skipTest(){
	 logger = report.startTest("skipTest");
	 throw new SkipException("Skipping - This is not ready for testing ");
	 }
	
	 public void getResult(ITestResult result){
		 if(result.getStatus() == ITestResult.FAILURE){
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		 }else if(result.getStatus() == ITestResult.SKIP){
		 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		 }
		 // ending test
		 //endTest(logger) : It ends the current test and prepares to create HTML report
		 report.endTest(logger);
		 }
	 
	 public void endReport(){
		 // writing everything to document
		 //flush() - to write or update test information to your report. 
		                report.flush();
		                //Call close() at the very end of your session to clear all resources. 
		                //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
		                //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
		                //Once this method is called, calling any Extent method will throw an error.
		                //close() - To close all the operation
		                report.close();
		    }
}
