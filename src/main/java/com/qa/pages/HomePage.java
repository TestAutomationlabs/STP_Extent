package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.qa.Base.TestBase;
import com.qa.Util.TestUtil;

public class HomePage extends TestBase {
	//@FindBy(xpath = "//a[@class='navbar-home h2 pt-2 mr-4']")
	
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
	
	@FindBy(xpath="//div[@class='news-title fs-15p font-weight-bold break-word']")
	public WebElement EnteredSTPToolData;
	// Initializing the Page Objects:
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div")
	public List<WebElement> STPwebtablerows;
	
	//@FindBy(xpath="//div/button[@type='button']/span[text()='Close']")
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/div[3]/button/span")
	WebElement GetHelpopup;
	
	WebElement HomeIconValidation;
	WebElement ListButtonValidation;
	WebElement HelpPopupValidation;
	WebElement NetworkTabValidation;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

//	public boolean verifyHelpPopup()
//	{
//		HelpPopupValidation=TestUtil.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("GetHelpopup")));
//		System.out.println("HelpPopup validation is completed" +HelpPopupValidation);
//		return GetHelpopup.isDisplayed();
//	}
	
	public void verifyHelpPopup() throws Exception
	{
		//HelpPopupValidation=TestUtil.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("GetHelpopup")));
		GetHelpopup.click();
		/*if (!GetHelpopup.isDisplayed()) {
			System.out.println("Helppopup is not displayed proceed with the Home icon");
		} else {
			//Thread.sleep(1000);
			GetHelpopup.click();
			System.out.println("HelpPopup validation is completed");
			//System.out.println("HelpPopup validation is completed" +HelpPopupValidation);
			//ListButtonValidation=TestUtil.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("ListTab")));
			//System.out.println("List tab is clicked");
		}*/
		
		
	}
	
	
//	
	public boolean verifyHomeIcon() {
//	HomeIconValidation=TestUtil.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("HomeIcon")));
	System.out.println(" Home Icon is present");
		return HomeIcon.isDisplayed();
	}

//	public void verifyHomeIconClick()
//	{
//		HomeIcon.click();
//	}
	public boolean verifyListTab() {
//		if (!ListTab.isDisplayed()) {
//			System.out.println("Listtab is not displayed");
//		} else {
//			Thread.sleep(3000);
//			ListTab.click();
		//	ListButtonValidation=TestUtil.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("ListTab")));
			System.out.println("List tab is present");
			return ListTab.isDisplayed();
		}

	//}
	
	public boolean verifyNetworkTab()
	{
//		NetworkTabValidation=TestUtil.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("NetworkTab")));
		System.out.println("Network tab is present");
		return NetworkTab.isDisplayed();
		
	}
	
	public boolean verifyConnectionTab()
	{
//		NetworkTabValidation=TestUtil.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("NetworkTab")));
		System.out.println("Network tab is present");
		return ConnectionTab.isDisplayed();
		
	}
	
	
	public CreateSTPPage ClickOnSTPLink() {
		CreateSTP.click();
		return new ClickOnSTPLink();
	}
	
	public PostPages ClickOnPostButton() {
	{
		if(!PostButton.isDisplayed())
		{
			System.out.println("Failed to click the postbutton");
		}
		else
		{
			PostButton.click();
			System.out.println("Post Button is clicked");
		}
		return new PostPages();
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

