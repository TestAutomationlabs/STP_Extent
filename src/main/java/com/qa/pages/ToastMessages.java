package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;

public class ToastMessages extends TestBase

{
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
	
	public void fullnameToast(int FullNameCell) throws IOException
	{
		String blankFulltoast = (ExcelUtility.getCellData("CreateSTP", 1, FullNameCell));
		System.out.println(blankFulltoast+" ----Blank name");
		if (blankFulltoast.trim().equals(""))
		{
			String fullnm = fullNameToast.getText();
			if(fullnm.contains("Required Full Name"))
			{
				System.out.println("Full name missing Toast message verified");
			}
			else
			{
				String noFullnm = "'Required Full Name' toast message missing";
				System.out.println(noFullnm);
				//test.log(LogStatus.FAIL, noFullnm);
				//screenshot.takeScreenshot(noFullnm);
			}
		}
	}
	
	public void DescriptionToast(int DescriptionCell) throws IOException
	{
		String blankDesctoast = (ExcelUtility.getCellData("CreateSTP", 3, DescriptionCell));
		System.out.println(blankDesctoast+" ----Blank name");
		if (blankDesctoast.trim().equals(""))
		{
			String Desc = DescriptionToast.getText();
			if(Desc.contains("Required Description"))
			{
				System.out.println("'Required Description' Toast message verified");
			}
			else
			{
				String noDesc = "'Required Description' toast message missing";
				System.out.println(noDesc);
				//test.log(LogStatus.FAIL, noFullnm);
				//screenshot.takeScreenshot(noFullnm);
			}
		}
	}
	
	public void CommunityOrganiserToast(int CommunityOrganiserCell) throws IOException
	{
		String blankcommorgtoast = (ExcelUtility.getCellData("CreateSTP", 2, CommunityOrganiserCell));
		System.out.println(blankcommorgtoast+" ----Blank name");
		if (blankcommorgtoast.trim().equals(""))
		{
			String Desc = communityOrganiserToast.getText();
			if(Desc.contains("Minimum 1 Community Organizer is required"))
			{
				System.out.println("'Minimum 1 Community Organizer is required' Toast message verified");
			}
			else
			{
				String noCommOrg = "'Minimum 1 Community Organizer is required' toast message missing";
				System.out.println(noCommOrg);
				//test.log(LogStatus.FAIL, noFullnm);
				//screenshot.takeScreenshot(noFullnm);
			}
		}
		
	}
		public void successfulToast (int SuccessMessage) throws IOException
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
														}
													}
								else
								{
									String nodesc = "'STP created successfully!' toast message missing after clicking 'Save and Close' button";
									System.out.print(nodesc);
								}		
							}	
		}
}
