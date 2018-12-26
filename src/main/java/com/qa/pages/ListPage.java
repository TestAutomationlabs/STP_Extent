package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.Base.TestBase;

public class ListPage extends TestBase

{

	//List Page Elements
	@FindBy(xpath = "//div[contains(text(),'STP')]")
	WebElement stpHeaderText;
	
	@FindBy(xpath = "//input[@name='search']")
	WebElement listSearch;
	
	@FindBy (xpath = "//span[text()='Search']")
	WebElement ListSearchButton;
	
	@FindBy (xpath = "//input[@placeholder='Share with']")
	WebElement sharewith;
	
	@FindBy (xpath = "//textarea[@type='text']")
	WebElement sharecomment;
	
	@FindBy (xpath = "//button[text()='Share']")
	WebElement shareButton;
	
	@FindBy (xpath = "//span[text()='Close']")
	WebElement CloseButton;
	
	@FindBy (xpath = "//span[contains(text(),'Category')]")
	WebElement categoryButton;
	
	@FindBy (xpath = "//div[@class='popover-body']")
	WebElement categorypopup;
	
	@FindBy (xpath = "//p[contains(text(),'Business Sector')]")
	WebElement popupBusinessSector;
	
	@FindBy (xpath = "//p[text()='Experts']")
	WebElement popupExpert;
	
	@FindBy (xpath = "//p[contains(text(),'Community Organizer')]")
	WebElement popupLead;
	
	@FindBy (xpath = "//p[contains(text(),'Expertise Level')]")
	WebElement popupExpertise;
	
	@FindBy (xpath = "//p[contains(text(),'Technology Readiness')]")
	WebElement popupTechnologyReadiness;
	
	@FindBy (xpath = "//p[contains(text(),'Location')]")
	WebElement popupLocation;
	
	@FindBy (xpath = "//p[contains(text(),'Assets')]")
	WebElement popupAsset;
	
	@FindBy (xpath = "//p[contains(text(),'Technique')]")
	WebElement popupTechnique;
	
	@FindBy (xpath = "//p[contains(text(),'Application')]")
	WebElement popupApplication;
	
	@FindBy (xpath = "//p[contains(text(),'project')]")
	WebElement popupProject;
	
	@FindBy (xpath = "//p[contains(text(),'Product')]")
	WebElement popupProduct;
	
	@FindBy (xpath = "//p[contains(text(),'example')]")
	WebElement popupExample;
	
	@FindBy (xpath = "//p[contains(text(),'Related Technology')]")
	WebElement popupRelatedTechnology;
	
	@FindBy (xpath = "//p[contains(text(),'Database')]")
	WebElement popupDatabase;
	
	@FindBy (xpath = "//p[contains(text(),'Material')]")
	WebElement popupMaterial;
	
	@FindBy (xpath = "//p[contains(text(),'Trend')]")
	WebElement popupTrend;
	
	@FindBy (xpath = "//p[contains(text(),'Keyword')]")
	WebElement popupKeyword;
	
	@FindBy (xpath = "//p[contains(text(),'Patents')]")
	WebElement popupInternationalPatentClass;
	
	@FindBy (xpath = "//p[contains(text(),'External Collaboration')]")
	WebElement popupExternalCollaboration;
	
	@FindBy (xpath = "//p[contains(text(),'Competitor')]")
	WebElement popupCompetitor;
	
	@FindBy (xpath = "//p[contains(text(),'Publications by Merck')]")
	WebElement popupPublicationInternal;
	
	@FindBy (xpath = "//p[contains(text(),'Review articles of outside world')]")
	WebElement popupPublicationExternal;
	
	@FindBy (xpath = "//input[@class='form-control']")
	WebElement selectedfilter;
	
	@FindBy (xpath = "//div[contains(@data-toggle,'tooltip')and contains(@class,'token text-left undefined')]")
	WebElement filterTip;
	
	@FindBy (xpath = "//div[@class='category-item-icon FilterTextColor']/*[1]")
	WebElement SelectedFilterClose;
	
	@FindBy (xpath = "//label[text()='Click to load more.']")
	WebElement loadMore;
	
	@FindBy (xpath = "//div[@id='sEaoUDiUOkh']")
	WebElement disabledLoad;
	
}
