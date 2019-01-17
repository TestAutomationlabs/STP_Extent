

package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
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
	
	@FindBy(xpath="//button[@data-original-title='STP Success Stories']/*[@class='svg-inline--fa fa-trophy fa-w-18 ']")
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
		return HomeIcon.isDisplayed();

	}
	
	public void verifyHomeIconClick()
	{
		HomeIcon.click();
	}

	public void verifyListTab(ExtentTest test) {
		
		if (!ListTab.isDisplayed()) {
			System.out.println("ListTab is not present");
			test.log(LogStatus.FAIL,"ListTab not present in UI");
		} else {

			//ListTab.click();
			System.out.println("ListTab is present");
			test.log(LogStatus.PASS, "List tab present in the UI");
		}
	}
		
		public void verifyListTabClick(ExtentTest test) {
			if (!ListTab.isDisplayed()) {
				System.out.println("ListTab is not present");
			} else {

				ListTab.click();
				System.out.println("ListTab is present");
				test.log(LogStatus.PASS, "List tab present in the UI");
			}

	}
	
	public void verifyNetworkTab() {
		if (!NetworkTab.isDisplayed()) {
			System.out.println("NetworkTab is not present");
		} else {

			//NetworkTab.click();
			System.out.println("ListTab is present");
		}

	}
	
	public void verifyConnectionTab() {
		if (!ConnectionTab.isDisplayed()) {
			System.out.println("ConnectionTab is not present");
		} else {

			//ConnectionTab.click();
			System.out.println("ConnectionTab is present");
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
	
	public void VerifySuccessStoriesIconButton()
	{
		if(!STPSuccessStoriesIcon.isDisplayed())
		{
			System.out.println("Success stories Icon button is not displayed");
		}
		
		else {
			System.out.println("Success stories Icon button is displayed");
		}
	}
	
	
	
	public void VerifySTPToolIconButton()
	{
		if(!STPToolIcon.isDisplayed())
		{
			System.out.println("STP Icon button is not displayed");
		}
		
		else {
			System.out.println("Success stories Icon button is displayed");
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
