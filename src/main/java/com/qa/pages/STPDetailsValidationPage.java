package com.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD
import org.testng.Assert;

=======

import org.testng.Assert;
import org.testng.annotations.Test;
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;
//import com.qa.library.ExcelUtilityForMultiple;

public class STPDetailsValidationPage extends TestBase{
	static int i;

	@FindBy(xpath="//input[contains(@title,'STP Name')]")
	WebElement Stpname;
	
	@FindBy(xpath="//input[contains(@title,'STP Short Name')]")
	WebElement StpShortname;
	
	@FindBy(xpath="//label/following::textarea[@title='Description']")
	WebElement Description;
	
	@FindBy(xpath="//a[text()='Resources']")
	WebElement resources;
	
	@FindBy(xpath="//input[contains(@title, 'Community Organizer')]")
	WebElement communityorganizer;
	
	@FindBy(xpath="//div[@data-toggle='tooltip']")
	WebElement communityorganizertextbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Save')]")
	static WebElement  saveclose_button;
	
	@FindBy(xpath="//div[contains(text(),'Minimum 1 Community Organizer is required')]")
	WebElement toast;
	
	@FindBy(xpath="//span[contains(text(),'Create')]")
	WebElement create_stp;
	
	@FindBy(xpath="//div[@class='col-md-10 text']")
	WebElement stpnametext;
	
	@FindBy(xpath ="//div/div[@class='col-md-10 text']")
	WebElement userNameLabel;
	
	@FindBy(xpath="//div[@class='media-body mr-1 detailtext']")
	WebElement DescriptionLabel;
	
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	WebElement editbutton;
	
	@FindBy(xpath="//div[@data-toggle='tooltip']")
	WebElement resources_communityorganizer_button;
	
	String STPTextbox;
	String stp_valntextbox;
	String enteredstpname;
	String stp_valdndesc;
	String enteredstpdesc;
	String stp_valdnorganizer;
	String enteredcommunityorganizer;
	
	public STPDetailsValidationPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Excel Read for Individual(single data)
	public void STPFields() throws IOException, InterruptedException 
	{		
		System.out.println(ExcelUtility.getCellData("CreateSTP_Mandatory", 1, 2));
<<<<<<< HEAD
		STPTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 1, 0);
=======
		STPTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory",6, 0);
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
		Stpname.sendKeys(STPTextbox);
		
		System.out.println("The text value of stptexbox" +Stpname.getAttribute("value"));
		enteredstpname=Stpname.getAttribute("value");
		System.out.println("Enteredstpname"+enteredstpname);
		
<<<<<<< HEAD
		String STPShortNameTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 1, 1);
=======
		String STPShortNameTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory",6, 1);
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
		StpShortname.sendKeys(STPShortNameTextbox);
		
<<<<<<< HEAD
		
		
		String DescriptionTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 1, 2);
=======
		String DescriptionTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 6, 2);
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
		Description.sendKeys(DescriptionTextbox);
		
		System.out.println("The text value of stpdescription is: " +Description.getAttribute("value"));
		enteredstpdesc = Description.getAttribute("value");
		System.out.println(" Enteredstpdesc " + enteredstpdesc);
		
		resources.click();
<<<<<<< HEAD
		String CommunityorgTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 2, 3);
=======
		String CommunityorgTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 5, 3);
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
		communityorganizer.sendKeys(CommunityorgTextbox,Keys.SPACE);
		Thread.sleep(3000);
		communityorganizer.sendKeys(Keys.ENTER);
		
		System.out.println("The value of communityorganizertextbox is: " +communityorganizertextbox.getAttribute("data-original-title"));
		enteredcommunityorganizer = communityorganizertextbox.getAttribute("data-original-title");
		System.out.println(" Enteredcommunityorganizervalue " +enteredcommunityorganizer);
		
		saveclose_button.click();
		Thread.sleep(3000);
		
	}
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public void validateuserlabel() throws Exception
	{
		stp_valntextbox=userNameLabel.getText();
		System.out.println(stp_valntextbox);
		Thread.sleep(3000);
	
		System.out.println("Value of stpname" +enteredstpname);
		if(stp_valntextbox.equalsIgnoreCase(enteredstpname))
	{
		System.out.println("Validated UserName in Details Page successfully");		}
	else {
		System.out.println("Username in Details page is unsuccessfully");
		}
	}
	
	public boolean verifydescriptionlabel()
	{
		return DescriptionLabel.isDisplayed();
	}
	
	public void validatedescrptionlabel() throws Exception
	{
		stp_valdndesc=DescriptionLabel.getText();
		System.out.println(stp_valdndesc);
		Thread.sleep(3000);
	
		System.out.println("Value of stpdesc" +enteredstpdesc);
		if(stp_valdndesc.equalsIgnoreCase(enteredstpdesc))
	{
		System.out.println("Validated UserName in Details Page successfully");		}
	else {
		System.out.println("Username in Details page is unsuccessfully");
		}
	}
	
	public void resourcesvalidation() throws InterruptedException
	{
		stp_valdnorganizer=resources_communityorganizer_button.getAttribute("data-original-title");
		System.out.println(stp_valdnorganizer);
		Thread.sleep(3000);
	
		System.out.println("Value of stpresourcesorganizer" +enteredcommunityorganizer);
		if(stp_valdnorganizer.equalsIgnoreCase(enteredcommunityorganizer))
	{
		System.out.println("Validated Resoucrce community organizer in Details Page successfully");		}
	else {
		System.out.println("Failed to validate Resoucrce community organizer in Details page");
		}
	}
<<<<<<< HEAD
=======

>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
	

	public void detailsValidation(int column)
	{
		if (column<6)
		{
			try {
				String inputfullname = ExcelUtility.getCellData("CreateSTP", 1, column);
				String fullname = Stpname.getText();
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
				String inputShortname = ExcelUtility.getCellData("CreateSTP", 2, column);
				String shortname = StpShortname.getText();
				if(inputShortname.equalsIgnoreCase(shortname))
				{
					System.out.println("Short name Verified");
				}
				else
				{
					System.out.println("Short name didnt match with the input data");
				}
			}
			catch (Exception e)
			{
				System.out.println("Exception at short name");
			}
		}
		else
		{
			try {
				String inputfullname = ExcelUtility.getCellData("CreateSTP", 1, column);
				String fullname = Stpname.getText();
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
				String inputShortname = ExcelUtility.getCellData("CreateSTP", 2, column);
				String shortname = StpShortname.getText();
				if(inputShortname.equalsIgnoreCase(shortname))
				{
					System.out.println("Short name Verified");
				}
				else
				{
					System.out.println("Short name didnt match with the input data");
				}
			}
			catch (Exception e)
			{
				System.out.println("Exception at short name");
			}
		}
		
		
	}
<<<<<<< HEAD
}
=======


>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
