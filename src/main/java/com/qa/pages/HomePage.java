package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//a[@class='navbar-home h2 pt-2 mr-4']")
	WebElement HomeIcon;

	@FindBy(xpath = "//button[@class='btn btn-highlight']")
	WebElement CreateSTP;

	@FindBy(xpath = "//span[contains(text(),'List')]")
	WebElement ListTab;

	@FindBy(xpath = "//button[@class='btn btn-highlight ml-0']")
	WebElement PostButton;

	// Initializing the Page Objects:

	public HomePage() {
		PageFactory.initElements(driver, this);
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
	
	public PostPage ClickOnPostButton() {
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
		return new PostPage();
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