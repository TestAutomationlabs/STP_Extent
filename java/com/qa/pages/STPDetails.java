package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;

public class STPDetails extends TestBase
{

	@FindBy (xpath = "//div[@class = 'col-md-10 text']")
	WebElement nameDetails;
	
	@FindBy (xpath = "//div[@class = 'media-body mr-1 detailtext']")
	WebElement descriptionDetails;
	
	@FindBy (xpath = "//*[text()='Community Organizer']//following::div[1]")
	WebElement commOrganiserDetails;
	
	public STPDetails()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void detailsValidation(int column) throws IOException
	{
		if (!(ExcelUtility.getCellData("CreateSTP", 1, column).trim().equals(""))&&
				!(ExcelUtility.getCellData("CreateSTP",2, column).trim().equals(""))&&
						!(ExcelUtility.getCellData("CreateSTP",3, column).trim().equals(""))&&
								!(ExcelUtility.getCellData("CreateSTP",4, column).trim().equals("")))
		{
			if (column<6)
			{
				try {
					String inputfullname = ExcelUtility.getCellData("CreateSTP", 1, column);
					String fullname = nameDetails.getText();
					if(inputfullname.equalsIgnoreCase(fullname))
					{
						System.out.println("Full name Verified");
					}
					else
					{
						System.out.println("Full name didnt match with the input data");
					}
				}
				catch (Exception e)
				{
					System.out.println(e);
					System.out.println("Exception at Fullname");
				}
				
				try {
					String inputShortname = ExcelUtility.getCellData("CreateSTP", 3, column);
					String shortname = descriptionDetails.getText();
					if(inputShortname.equalsIgnoreCase(shortname))
					{
						System.out.println("Description Verified");
					}
					else
					{
						System.out.println("Description didnt match with the input data");
					}
				}
				catch (Exception e)
				{
					System.out.println("Exception at Description");
				}
			}
			else
			{
				try {
					String inputfullname = ExcelUtility.getCellData("CreateSTP", 1, column);
					String fullname = nameDetails.getText();
					if(inputfullname.equalsIgnoreCase(fullname))
					{
						System.out.println("Full name Verified");
					}
					else
					{
						System.out.println("Full name didnt match with the input data");
					}
				}
				catch (Exception e)
				{
					System.out.println(e);
					System.out.println("Exception at Fullname");
				}
				
				try {
					String inputShortname = ExcelUtility.getCellData("CreateSTP", 3, column);
					String shortname = descriptionDetails.getText();
					if(inputShortname.equalsIgnoreCase(shortname))
					{
						System.out.println("Description Verified");
					}
					else
					{
						System.out.println("Description didnt match with the input data");
					}
				}
				catch (Exception e)
				{
					System.out.println("Exception at Description");
				}
			}
		}			
	}
	
}
