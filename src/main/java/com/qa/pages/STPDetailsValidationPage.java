package com.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;
//import com.qa.library.ExcelUtilityForMultiple;
import com.qa.Util.CustomListner;

@Listeners(CustomListner.class)
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
	

	@FindBy(xpath="//button[@data-original-title='Add to Interesting STPs']")
	WebElement intrestingbutton;
	
	@FindBy (xpath = "//button[@type='button'][text()='Close']")
	WebElement closeHelpPopup;
	
	public static String STPTextbox;
	String stp_valntextbox;
	String enteredstpname;
	String stp_valdndesc;
	String enteredstpdesc;
	String stp_valdnorganizer;
	String enteredcommunityorganizer;
	
	
	
	public STPDetailsValidationPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void closeHelppopup() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(closeHelpPopup));
		Thread.sleep(1000);
		try
		{	if (closeHelpPopup.isDisplayed())
				{
					Thread.sleep(2000);
					closeHelpPopup.click();
					
				}
		}
		catch(Exception e)
		{
			System.out.println("Help pop-up not present");
		}
	}
	
	//Excel Read for Individual(single data)
	public void STPFields() throws IOException, InterruptedException 
	{		
		System.out.println(ExcelUtility.getCellData("CreateSTP_Mandatory", 1, 2));
		STPTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory",4, 0);
		Stpname.sendKeys(STPTextbox);
		
		System.out.println("The text value of stptexbox" +Stpname.getAttribute("value"));
		enteredstpname=Stpname.getAttribute("value");
		System.out.println("Enteredstpname"+enteredstpname);
		
		
		String STPShortNameTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory",4, 1);
		StpShortname.sendKeys(STPShortNameTextbox);
			
		
		
		
		String DescriptionTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 4, 2);
		Description.sendKeys(DescriptionTextbox);
		
		System.out.println("The text value of stpdescription is: " +Description.getAttribute("value"));
		enteredstpdesc = Description.getAttribute("value");
		System.out.println(" Enteredstpdesc " + enteredstpdesc);
		
		resources.click();
		
		String CommunityorgTextbox=ExcelUtility.getCellData("CreateSTP_Mandatory", 3, 3);
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


	public void verifyIntrestingButton(){
		if(!intrestingbutton.isDisplayed())
		{
			System.out.println("Failed to click the Intresting button");
		} else {

			intrestingbutton.click();
			System.out.println("List tab is clicked");
		}
		
		}
	
	
	}