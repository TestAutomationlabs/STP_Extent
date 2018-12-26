package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.Base.TestBase;

public class ToastMessages extends TestBase

{
	//Toast Message elements
	
	@FindBy (xpath = "//div[text()='Required Full Name']")
	WebElement fullNameToast;
	
	@FindBy (xpath = "//div[text()='Required Short Name']")
	WebElement shortNameToast;
	
	@FindBy (xpath = "//div[text()='Minimum 1 Community Organizer is required']")
	WebElement communityOrganiserToast;
	
	@FindBy (xpath = "//div[text()='Required Description']")
	WebElement DescriptionToast;
	
	@FindBy (xpath = "//div[text()='STP created successfully!']")
	WebElement successMessageToast; 
	
	
}
