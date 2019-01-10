package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.qa.pages.STPDetailsValidationPage;

import com.qa.Base.TestBase;
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
	
	
	@FindBy(xpath = "//div/following::button[@class='btn btn-highlight ml-0']")
	WebElement PostButton;
	
	@FindBy(xpath="//button[@data-original-title='STP Tool']")
	WebElement STPToolButton;
	
	@FindBy(xpath="//div[@class='news-title fs-15p font-weight-bold break-word']")
	public WebElement EnteredSTPToolData;
	// Initializing the Page Objects:
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div")
	public List<WebElement> STPwebtablerows;
	
	public WebElement postbuttonvalidationbutton;
	
	  
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHelpPopup() throws Exception
	{
		Thread.sleep(2000);
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

	public boolean verifyHomeIcon() {
		return HomeIcon.isDisplayed();

	}
	
	public void verifyHomeIconClick()
	{
		HomeIcon.click();
	}

	public void verifyListTab() {
		if (!ListTab.isDisplayed()) {
			System.out.println("Failed to click the listtab");
		} else {

			ListTab.click();
			System.out.println("List tab is clicked");
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

	public CreateSTPPage ClickOnSTPLink() {
		CreateSTP.click();
		return new ClickOnSTPLink();
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