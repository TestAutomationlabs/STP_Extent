package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ToastMessages extends TestBase
{
	ExtentTest test;
	ExtentReports report;
	//Toast Message elements
	
	@FindBy (xpath = "//div[text()='Required Full Name']")
	WebElement fullNameToast;
	
	@FindBy (xpath = "//div[text()='Required Short Name']")
	WebElement shortNameToast;
	
	@FindBy (xpath = "//div[text()='Minimum 1 Community Organizer is required']")
	WebElement communityOrganiserToast;
	
	@FindBy (xpath = "//div[text()='Required Description']")
	WebElement DescriptionToast;
	
	@FindBy (xpath = "//div[text()='STP created successfully!']")
	WebElement successMessageToast; 
	
	@FindBy (xpath = "//div[contains(text(),'Name must be unique, another STP has already that value.')]")
	WebElement AlreadyHas;
	
	
	//
	
	public ToastMessages()
	{
	PageFactory.initElements(driver, this);
	}
	
	public void fullnameToast(int FullNameCell, ExtentTest test) throws IOException
	{
		String blankFulltoast = (ExcelUtility.getCellData("CreateSTP", 1, FullNameCell));
		System.out.println(blankFulltoast+" ----Blank name");
		if (blankFulltoast.trim().equals(""))
		{
			String fullnm = fullNameToast.getText();
			if(fullnm.contains("Required Full Name"))
			{
				System.out.println("Full name missing Toast message verified");
				test.log(LogStatus.PASS, "'Required Full Name' toast message displayed");
			}
			else
			{
				String noFullnm = "'Required Full Name' toast message missing";
				System.out.println(noFullnm);
				test.log(LogStatus.FAIL, "'Required Full Name' toast message missing");
			}
		}
	}
	
	public void DescriptionToast(int DescriptionCell, ExtentTest test) throws IOException
	{
		String blankDesctoast = (ExcelUtility.getCellData("CreateSTP", 3, DescriptionCell));
		System.out.println(blankDesctoast+" ----Blank Description");
		if (blankDesctoast.trim().equals(""))
		{
			String Desc = DescriptionToast.getText();
			if(Desc.contains("Required Description"))
			{
				System.out.println("'Required Description' Toast message verified");
				test.log(LogStatus.PASS, "'Required Description' Toast message verified");
			}
			else
			{
				String noDesc = "'Required Description' toast message missing";
				System.out.println(noDesc);
				test.log(LogStatus.FAIL, noDesc);
			}
		}
	}
	
	public void CommunityOrganiserToast(int CommunityOrganiserCell, ExtentTest test) throws IOException
	{
		String blankcommorgtoast = (ExcelUtility.getCellData("CreateSTP", 2, CommunityOrganiserCell));
		System.out.println(blankcommorgtoast+" ----Blank community organiser");
		if (blankcommorgtoast.trim().equals(""))
		{
			String Desc = communityOrganiserToast.getText();
			if(Desc.contains("Minimum 1 Community Organizer is required"))
			{
				System.out.println("'Minimum 1 Community Organizer is required' Toast message verified");
				test.log(LogStatus.PASS, "'Minimum 1 Community Organizer is required' Toast message verified");
			}
			else
			{
				String noCommOrg = "'Minimum 1 Community Organizer is required' toast message missing";
				System.out.println(noCommOrg);
				test.log(LogStatus.FAIL, noCommOrg);
			}
		}
	}
		public void successfulToast (int SuccessMessage, ExtentTest test) throws IOException
		{
			if (!(ExcelUtility.getCellData("CreateSTP", 1, SuccessMessage).trim().equals(""))&&
					!(ExcelUtility.getCellData("CreateSTP",2, SuccessMessage).trim().equals(""))&&
							!(ExcelUtility.getCellData("CreateSTP",3, SuccessMessage).trim().equals(""))&&
									!(ExcelUtility.getCellData("CreateSTP",4, SuccessMessage).trim().equals("")))
							{
								String sucesstoast = successMessageToast.getText();
								if(sucesstoast.contains("STP created successfully!"))
								{
									System.out.println("Success toast message displayed");
									test.log(LogStatus.PASS, "Success toast message displayed");
								}
								else if (!(ExcelUtility.getCellData("CreateSTP", 1, SuccessMessage).trim().equals(""))&&
											!(ExcelUtility.getCellData("CreateSTP",2, SuccessMessage).trim().equals(""))&&
												!(ExcelUtility.getCellData("CreateSTP",3, SuccessMessage).trim().equals(""))&&
													!(ExcelUtility.getCellData("CreateSTP",4, SuccessMessage).trim().equals("")))
													{
														String duplicateToast = AlreadyHas.getText();
														if(duplicateToast.contains("Name must be unique, another STP has already that value."))
														{
															System.out.println("Duplicate toast message displayed");
															test.log(LogStatus.PASS, "Duplicate toast message displayed");
														}
													}
								else
								{
									String nodesc = "'STP created successfully!' toast message missing after clicking 'Save and Close' button";
									System.out.print(nodesc);
									test.log(LogStatus.FAIL, "'STP created successfully!' toast message missing after clicking 'Save and Close' button");
								}		
							}	
		}
}
