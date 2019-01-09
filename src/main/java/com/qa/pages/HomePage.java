package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.pages.STPDetailsValidationPage;

import com.qa.Base.TestBase;

public class HomePage extends TestBase {
	
	//@FindBy(xpath = "//*[@class='svg-inline--fa fa-home fa-w-18 ']")
	@FindBy(xpath = "//*[@class='gdfdfdsvg-inline--fa fa-home fa-w-18sssfdfsfsd ']")
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
	
	
	
	  
	
	public HomePage() {
		PageFactory.initElements(driver, this);
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
			PostButton.click();
			System.out.println("Post Button is clicked");
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