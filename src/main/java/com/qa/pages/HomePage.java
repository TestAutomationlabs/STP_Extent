package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;
import com.qa.Util.TestUtil;

public class HomePage extends TestBase {

	@FindBy(xpath="//div/button[@type='button']/span[text()='Close']")
	WebElement GetHelpPopup;

	@FindBy(xpath = "//*[@class='svg-inline--fa fa-home fa-w-18 ']")
	WebElement HomeIcon;

	@FindBy(xpath = "//button[@class='btn btn-highlight']")
	WebElement CreateSTP;

	//@FindBy(xpath = "//span[contains(text(),'List')]")
	@FindBy(xpath = "//span[contains(text(),'List')]")
	WebElement ListTab;

	@FindBy(xpath="//span[contains(text(),'Network')]")
	WebElement NetworkTab;

	@FindBy(xpath="//span[contains(text(),'Connection')]")
	WebElement ConnectionTab;

	@FindBy(xpath = "//div/following::button[@class='btn btn-highlight ml-0']")
	WebElement PostButton;

	@FindBy(xpath="//button[@data-original-title='STP Tool']")
	WebElement STPToolButton;

	@FindBy(xpath="//button[@data-original-title='Add to Interesting STPs']")
	WebElement intrestingbutton;

	//@FindBy(xpath="//button[@data-original-title='STP Success Stories']/*[@class='svg-inline--fa fa-trophy fa-w-18 ']")
	@FindBy(xpath="//*[@class='svg-inline--fa fa-trophy fa-w-18 ']")
	public WebElement STPSuccessStoriesIcon;

	@FindBy(xpath="//*[@class='svg-inline--fa fa-bell fa-w-14 ']")
	public WebElement STPToolIcon;

	@FindBy(xpath="//div[@class='news-title fs-15p font-weight-bold break-word']")
	public WebElement Success_EnteredSTPToolData;

	@FindBy(xpath="//div[@class='news-title fs-15p font-weight-bold break-word']")
	public WebElement STP_EnteredSTPToolData;
	// Initializing the Page Objects:

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div")
	public List<WebElement> Successwebtablerows;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div")
	public List<WebElement> STPwebtablerows;

	@FindBy (xpath="//*[@class='svg-inline--fa fa-question-circle fa-w-16 cursor-pointer']")
	public WebElement HelpMark;

	@FindBy (xpath="//*[text()='Close']")
	public WebElement HelpMarkClose;

	////a[text()='"+ExcelUtility.getCellData("CreateSTP", 20, 6)+"']
//	@FindBy (xpath ="//a[text()='"+ExcelUtility.getCellData("CreateSTP", 20, 6)+"']")
//	public WebElement findInMySTP;

	public WebElement postbuttonvalidationbutton;

	  /* Variables Declaration
	   * GetHelpPoup;
	   * HomeIcon;
	   * ListLink=ListTab;
	   * NetworkLink=NetworkTab;
	   * ConnectionLink=ConnectionTab;
	   * PostButton=PostButton
	   * AddSTP=STPToolButton;
	   * STPNews=STPwebtablerows;
	   *
	   *
	   *
	   *
	   *
	   *
	   */

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void testFindInMySTP() throws Exception
	{
		String toValidate = ExcelUtility.getCellData("CreateSTP", 1, 6);
		
		String inMySTP = driver.findElement(By.xpath("//a[text()='"+toValidate+"']")).getText().toString();

		if(toValidate.equalsIgnoreCase(inMySTP))
		{
			System.out.println("STP added is present in MY STPs table");
		}
		else{
			System.out.println("STP added is not present in MY STPs table");
		}
	}

	public void getHelpMark()
	{
		try {
		if (HelpMark.isDisplayed())
		{
			System.out.println("Help mark displayed in Home Page");
		}
		}
		catch(Exception e)
		{
			System.out.println("'?'Help Mark not present");
		}
	}
	public void getCloseHelpMark()
	{

		try {
			HelpMark.click();
			try {
				HelpMarkClose.click();
				try{
					HelpMarkClose.click();
					System.out.println("Close button present in Help pop-up and clicked");
				}
				catch(Exception e)
				{
					System.out.println("Unable to close the Help pop-up");
				}
			}
			catch(Exception e)
			{
				System.out.println("Unable to close the Help pop-up");
			}
		}
		catch(Exception e)
		{
			System.out.println("Unable to click the '?' Help mark");
		}
	}

	public void verifyHelpPopup() throws Exception
	{
		try {
			if(!GetHelpPopup.isDisplayed())
			{
				System.out.println("Helppopup is not present");
			}
			else
			{
				GetHelpPopup.click();
				System.out.println("Helppopup is present and it has clicked");
			}	
		}
		catch (Exception e)
		{
			System.out.println("Exception at Home Page help text pop-up. ");
			System.out.println(e);
		}
		
	}
	public boolean verifyHomeIcon() {
		try {
			if(HomeIcon.isDisplayed())
			{
				System.out.println("Homeicon is present");
			}
		}
		catch(Exception e)
		{
			System.out.println("Home icon is not present");
		}

		return HomeIcon.isDisplayed();
	}

	public void verifyHomeIconClick()
	{
		HomeIcon.click();
	}

	public void verifyListTab() {

		if (!ListTab.isDisplayed()) {
			System.out.println("ListTab is not present");
			
		} else {

			//ListTab.click();
			System.out.println("ListTab is present");
			
		}
	}
	

	
	


public void verifyListTabClick() {
	if (!ListTab.isDisplayed()) {
		System.out.println("ListTab is not present");
	} else {

		ListTab.click();
		System.out.println("ListTab is present");
		System.out.println("List tab present in the UI");
	}
}

	public void verifyNetworkTab() {
		try {
		if (!NetworkTab.isDisplayed()) {
			System.out.println("NetworkTab is not present");
			
		} else {

			//NetworkTab.click();
			System.out.println("ListTab is present");
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Network tab is not displayed");
		}
	}

	public void verifyConnectionTab() {

		try {
			if (!ConnectionTab.isDisplayed()) {
				System.out.println("ConnectionTab is not present");
				
			} else {

				//ConnectionTab.click();
				System.out.println("ConnectionTab is present");
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Connection Tab is not displayed");
		}

	}

	public PostPages ClickOnPostButton() {
	{
		if(!PostButton.isDisplayed())
		{
			System.out.println("Failed to click the postbutton");
		}
		else
		{
			postbuttonvalidationbutton=TestUtil.wait.until(ExpectedConditions.elementToBeClickable(PostButton));
			//PostButton.click();
			postbuttonvalidationbutton.click();
			System.out.println("Post Button validation buttonis clicked");
		}
		return new PostPages();
	}
	}

	public CreateSTPPage ClickOnSTPLink() throws InterruptedException {
		Thread.sleep(3000);
		CreateSTP.click();
		//CreateSTP.sendKeys("tehh");
		return new ClickOnSTPLink();
	}

	public void VerifySuccessStoriesIconButton()
	{
		try {
		if(!STPSuccessStoriesIcon.isDisplayed())
		{
			System.out.println("Success stories Icon button is not displayed");
			
		}

		else {
			System.out.println("Success stories Icon button is displayed");
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Success stories Icon button is not displayed");
		}
	}



	public void VerifySTPToolIconButton()
	{
		try {
		if(!STPToolIcon.isDisplayed())
		{
			System.out.println("STP Icon button is not displayed");
			
		}

		else {
			System.out.println("Success stories Icon button is displayed");
			
		}
		}
		catch(Exception e)
		{
			System.out.println("STP Icon button is not displayed");
		}
	}

	public void ClickOnSTPToolIcon() throws Exception
	{
		Thread.sleep(2000);
		STPToolButton.click();
		System.out.println("STPTool Button clicked");
	}

	public void IntrestingSTPSList()
	{

		System.out.println("IntrestingSTP List details are follows:");

	}
}
