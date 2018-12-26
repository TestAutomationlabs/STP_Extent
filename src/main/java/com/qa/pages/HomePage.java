package com.qa.pages;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.TestBase;

public class HomePage extends TestBase
{          
	@FindBy(xpath="//a[@class='navbar-home h2 pt-2 mr-4']")
	WebElement HomeIcon;
	
	@FindBy(xpath="//button[@class='btn btn-highlight']")
	WebElement CreateSTP; 
	
	@FindBy(xpath = "//span[contains(text(),'List')]")
	WebElement ListTab;
	
	//Initializing the Page Objects:         
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);         
	}                  
	
//	public boolean HomeIcon() 
//	{             HomeIcon.isDisplayed();
//            return new HomeIcon();
//    }
	
	public CreateSTPPage ClickOnSTPLink() 
	{             CreateSTP.click(); 
            return new ClickOnSTPLink();
    }
//	
//	public ListTabPage ListTabLink() 
//	{             ListTab.click(); 
//            return new ListTabPage();
//    }

    }  