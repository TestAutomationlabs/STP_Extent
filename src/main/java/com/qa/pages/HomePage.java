package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//a[@class='navbar-home h2 pt-2 mr-4']")
	WebElement HomeIcon;

	@FindBy(xpath = "//button[@class='btn btn-highlight']")
	WebElement CreateSTP;

	@FindBy(xpath = "//span[contains(text(),'List')]")
	WebElement ListTab;

	@FindBy(xpath = "//div/following::button[@class='btn btn-highlight ml-0']")
	WebElement PostButton;
	
	@FindBy(xpath="//div/button[@type='button']/span[text()='Close']")
    WebElement GetHelpPopup;
	
	

	// Initializing the Page Objects:

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement closeHelpPopup()
	{
		return GetHelpPopup;
	}
	
	public void Closepopup()
	{
		try {
			if (GetHelpPopup.isDisplayed())
			{
				GetHelpPopup.click();
				
			}	
		}
		catch(Exception e)
		{
			System.out.println("Help popup not present");
		}
	}
	
	public boolean verifyHomeIcon() {
		return HomeIcon.isDisplayed();

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
//	
//	public ListTabPage ListTabLink() 
//	{             ListTab.click(); 
//            return new ListTabPage();
//    }

}