package com.qa.pages;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CreateSTPPage extends TestBase
{

	
	ExtentTest test;
	ExtentReports report;
	
//	CreateSTP Elements
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	
	@FindBy(xpath="//div[text()='Create']")
	WebElement createStpText ;
	
	@FindBy (xpath = "//button[@type='button'][text()='Close']")
	WebElement closeHelpPopup;
	
	@FindBy(xpath="//span[contains(@class,'slider round')]")
	WebElement HelpToggle;
	
	@FindBy(xpath="//p[@class ='col-md-6 mb-0 showhelptooltip shadow-sm p-2 ml-2']")
	WebElement HelpText;
	
	@FindBy(xpath="//span[text()='Save & Close']")
	WebElement SavenClose;
	
	@FindBy (xpath="//input[@placeholder='STP Name']")
	WebElement STPName;
	
	@FindBy(xpath = "//input[@placeholder='STP Short Name']")
	WebElement ShortName;
	
	@FindBy(xpath = "//span[text()='Upload']")
	WebElement UploadButton;
	
	@FindBy(xpath = "//input[@placeholder='Community Organizer']")
	WebElement CommunityOrganiser;
	
	@FindBy(xpath = "//input[@placeholder='Experts']")
	WebElement Experts;
	
	@FindBy(xpath = "//input[@placeholder='Business Sector']")
	WebElement BusinessSector;
	
	@FindBy(xpath = "//input[@placeholder='Location']")
	WebElement Location;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']")
	WebElement Description;
	
	@FindBy (xpath = "//option[text()='TRL 2, technology concept formulated']")
	WebElement TechnologyReadiness;
	
	@FindBy (xpath = "//a[text()='Detailed Description']")
	WebElement DetailedDescription;
	
	@FindBy (xpath = "//input[@placeholder='Assets']")
	WebElement Assets;
	
	@FindBy (xpath = "//input[@placeholder='Technique used']")
	WebElement TechniqueUsed;
	
	@FindBy (xpath = "//input[@placeholder='Materials used']")
	WebElement MaterialUsed;
	
	@FindBy (xpath = "//input[@placeholder='Applications']")
	WebElement Applications;
	
	@FindBy (xpath = "//input[@placeholder='Ongoing Projects']")
	WebElement ongoingProjects;
	
	@FindBy (xpath = "//input[@placeholder='Products & Services']")
	WebElement ProductsnServices;
	
	@FindBy (xpath = "//input[@placeholder='External Examples']")
	WebElement Externalexample;
	
	@FindBy (xpath = "//input[@placeholder='Related Technology']")
	WebElement RelatedTechnology;
	
	@FindBy (xpath = "//a[text()='Specific Information']")
	WebElement SpecificInformation;
	
	@FindBy (xpath = "//input[@placeholder='Database']")
	WebElement Database;
	
	@FindBy (xpath = "//input[@placeholder='Associated Trends']")
	WebElement AssociatedTrends;
	
	@FindBy (xpath = "//input[@placeholder='Keywords']")
	WebElement Keywords;
	
	@FindBy (xpath = "//input[@placeholder='Publications by Merck/EMD']")
	WebElement PublicationsbyMerck;
	
	@FindBy (xpath = "//input[@placeholder='Review articles of outside world']")
	WebElement ReviewarticlesFromOutsideWorld;
	
	@FindBy (xpath = "//input[@placeholder='External Collaboration']")
	WebElement ExternalCollaboration;
	
	@FindBy (xpath = "//input[@placeholder='Patents']")
	WebElement patents;
	
	@FindBy (xpath = "//a[text()='Market position']")
	WebElement MarketPosition;
	
	@FindBy (xpath = "//input[@placeholder='Competitors']")
	WebElement Competitors;
	
	@FindBy (xpath = "//option[text()='On par with competition']")
	WebElement ExpertiseLeveldropdown;
	
	@FindBy (xpath = "//option[text()='On par with competition']")
	WebElement ExpertiseLevel;
	
	@FindBy (xpath = "//*[contains(@class,'svg-inline--fa fa-times fa-w-11')]")
	WebElement removeCommunityOrgainser;
	
	@FindBy (xpath = "//input[@placeholder='Dimension Name']")
	WebElement newDimensionName;
	
	@FindBy (xpath = "//input[@placeholder='Description']")
	WebElement newDimensionDescription;
	
	@FindBy (xpath = "//input[@placeholder='Additional Info.']")
	WebElement newDimensionAdditionalInfo;
	
	@FindBy (xpath ="//input[@placeholder='External Link']")
	WebElement newDimensionExternalLink;
	
	@FindBy (xpath = "//div[@class='modal-footer']/button[2]")
	WebElement newDimensionsave;

	@FindBy (xpath = "//a[text()='Resources']")
	WebElement resources;
	
	@FindBy (xpath = "//a[contains(text(),'General Information')]")
	WebElement generalInfo;
	
	@FindBy (xpath = "//a[text()='Technology']")
	WebElement technologytab;
	
	@FindBy (xpath = "//a[text()='Knowledge']")
	WebElement Knowledgetab;
	
	@FindBy (xpath = "//a[text()='Applications & Products']")
	WebElement ApplicationsnProductsTab;
	
	@FindBy (xpath = "//a[text()='Relations']")
	WebElement relations;
	
	@FindBy (xpath = "//span[text()='Discard']")
	WebElement discard;
	
//CreateSTP Actions

public CreateSTPPage()
{
PageFactory.initElements(driver, this);
}

public WebElement closeHelpPopup()
{
	return closeHelpPopup;
}

public void closeHelppopup() throws InterruptedException
{
//	WebDriverWait wait = new WebDriverWait(driver, 45, 1000);
//	wait.until(ExpectedConditions.visibilityOf(closeHelpPopup));
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(closeHelpPopup));
	Thread.sleep(1000);
	try
	{	if (closeHelpPopup.isDisplayed())
			{
				Thread.sleep(2000);
				closeHelpPopup.click();
				
			}
	}
	catch(Exception e)
	{
		System.out.println("Help pop-up not present");
	}
}



public WebElement Discard()
{
	return discard;
}

public void HelpToggleValidation() throws Exception
{
	//report = ExtentContent.reporter("Help Text Validation");
	//test = report.startTest("Help Text Validation");
	if(!((HelpText).isDisplayed()))
	{
	System.out.println("Help Text not present");
	//test.log(LogStatus.PASS, "Help Text is present");
	}
	else 
	{
	System.out.println("Help Text present");
	HelpToggle.click();
	
	//test.log(LogStatus.FAIL, "Help Text not expected here");
	
	if (HelpToggle.isEnabled())
	{		
		System.out.println("Toggle button clicked");
		//test.log(LogStatus.PASS, "Help toggle click successful");
		try
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			if (HelpText.isDisplayed())
				{
					//test.log(LogStatus.PASS, "Help text not removed. Hence failed");
					System.out.println("Help text not removed. Hence failed");
				}
		}
		catch(Exception e)
		{
			//test.log(LogStatus.PASS, "Help text not removed. Hence failed");
			System.out.println("Help text removed as expected");
		}
	}
	}
}		

public void EnterMandatoryFields(int cellNo) throws InterruptedException, IOException
{

	
generalInfo.click();
Thread.sleep(1000);
STPName.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
Thread.sleep(1000);
STPName.sendKeys(ExcelUtility.getCellData("CreateSTP", 1, cellNo));
Description.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
Thread.sleep(1000);
Description.sendKeys(ExcelUtility.getCellData("CreateSTP", 3, cellNo));
Thread.sleep(1000);
ShortName.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
Thread.sleep(1000);
ShortName.sendKeys(ExcelUtility.getCellData("CreateSTP", 2, cellNo));
Thread.sleep(1000);
resources.click();
Thread.sleep(1000);
try {
if (removeCommunityOrgainser.isDisplayed())
{
	removeCommunityOrgainser.click();
}
}
catch(Exception e)
{
System.out.println("Community organiser not maintained");
}
Thread.sleep(1000);
CommunityOrganiser.sendKeys(ExcelUtility.getCellData("CreateSTP", 4, cellNo));
Thread.sleep(4000);
CommunityOrganiser.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
Thread.sleep(1000);
SavenClose.click();
Thread.sleep(1000);
}

public void EnterALLFields() throws Exception
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	STPName.sendKeys(ExcelUtility.getCellData("CreateSTP", 1, 6));
	
	Description.sendKeys(ExcelUtility.getCellData("CreateSTP", 3, 6));
	Thread.sleep(1000);
	
	ShortName.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
	ShortName.sendKeys(ExcelUtility.getCellData("CreateSTP", 2, 6));
	
	Location.sendKeys(ExcelUtility.getCellData("CreateSTP", 7, 6)+" ");
	Thread.sleep(3000);
	Location.sendKeys(Keys.RETURN);
	
	try {
		BusinessSector.sendKeys(ExcelUtility.getCellData("CreateSTP", 6, 6)+" ");
		Thread.sleep(3000);
		BusinessSector.sendKeys(Keys.RETURN);
	}
	catch (Exception e)
	{
		System.out.println("Error at BusinessSector");
		System.out.println(e);
	}
	
	//___________________________________ Page 2 ________________________________________
	resources.click();
	Thread.sleep(1000);
	
	try {
		CommunityOrganiser.sendKeys(ExcelUtility.getCellData("CreateSTP", 4, 6));
		Thread.sleep(4000);
		CommunityOrganiser.sendKeys(Keys.RETURN);
	}
	catch (Exception e)
	{
		System.out.println("Error at CommunityOrganiser");
		System.out.println(e);
	}
	
	try {
		Experts.sendKeys(ExcelUtility.getCellData("CreateSTP", 5, 6));
		Thread.sleep(4000);
		Experts.sendKeys(Keys.RETURN);
	}
	catch (Exception e)
	{
		System.out.println("Error at Experts");
		System.out.println(e);
	}
	
	try {
		String asset = ExcelUtility.getCellData("CreateSTP", 9, 6);
		Assets.sendKeys(asset);
		callNewDimension(asset, Assets);
	}
	catch (Exception e)
	{
		System.out.println("Error at Assets");
		System.out.println(e);
	}
	
	try {
		String database = ExcelUtility.getCellData("CreateSTP", 17, 6);
		Database.sendKeys(database);
		callNewDimension(database, Database);
	}
	catch (Exception e)
	{
		System.out.println("Error at Database");
		System.out.println(e);
	}
	
	try {
		String materials = ExcelUtility.getCellData("CreateSTP", 11, 6);
		MaterialUsed.sendKeys(materials);
		callNewDimension(materials, MaterialUsed);
		
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	
	//__________________________________ Page 3 ___________________________
	
	technologytab.click();
	
	try {
		String techniqueUsed = ExcelUtility.getCellData("CreateSTP", 10, 6);
		TechniqueUsed.sendKeys(techniqueUsed);
		callNewDimension(techniqueUsed, TechniqueUsed);
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	
	try {
		String relatedTech = ExcelUtility.getCellData("CreateSTP", 16, 6);
		RelatedTechnology.sendKeys(relatedTech);
		callNewDimension(relatedTech, RelatedTechnology);
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	
	try {
		String keyword = ExcelUtility.getCellData("CreateSTP", 19, 6);
		Keywords.sendKeys(keyword);
		callNewDimension(keyword, Keywords);
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	
	
	//____________________________________ Page 4 ___________________________
	
	Knowledgetab.click();
	
	try {
	ExpertiseLevel.click();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	
	try {
		String trend = ExcelUtility.getCellData("CreateSTP", 18, 6);
		AssociatedTrends.sendKeys(trend);
		callNewDimension(trend, AssociatedTrends);
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	
	try {
		TechnologyReadiness.click();
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	
	try {
		String merckPubli = ExcelUtility.getCellData("CreateSTP", 20, 6);
		PublicationsbyMerck.sendKeys(merckPubli);
		callNewDimension(merckPubli, PublicationsbyMerck);
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	

	try {
		String reivew = ExcelUtility.getCellData("CreateSTP", 21, 6);
		ReviewarticlesFromOutsideWorld.sendKeys(reivew);
		callNewDimension(reivew, ReviewarticlesFromOutsideWorld);
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	
	try {
		String patent = ExcelUtility.getCellData("CreateSTP", 23, 6);
		patents.sendKeys(patent);
		callNewDimension(patent, patents);
	}
	catch (Exception e)
	{
		System.out.println("Error at MaterialUsed");
		System.out.println(e);
	}
	//____________________________________ Page 5 ______________________________
	
	try {
		ApplicationsnProductsTab.click();
	}
	catch (Exception e)
	{
		System.out.println("Error at ApplicationsnProductsTab");
		System.out.println(e);
	}
	
	try {
		String application = ExcelUtility.getCellData("CreateSTP", 12, 6);
		Applications.sendKeys(application);
		callNewDimension(application, Applications);
	}
	catch (Exception e)
	{
		System.out.println("Error at Applications");
		System.out.println(e);
	}
	
	try {
		String ongoing = ExcelUtility.getCellData("CreateSTP", 13, 6);
		ongoingProjects.sendKeys(ongoing);
		callNewDimension(ongoing, ongoingProjects);
	}
	catch (Exception e)
	{
		System.out.println("Error at ongoingProjects");
		System.out.println(e);
	}
	
	try {
		String products = ExcelUtility.getCellData("CreateSTP", 14, 6);
		ProductsnServices.sendKeys(products);
		callNewDimension(products, ProductsnServices);
		}
	catch (Exception e)
	{
		System.out.println("Error at ProductsnServices");
		System.out.println(e);
	}
	
	try {
		String example = ExcelUtility.getCellData("CreateSTP", 15, 6);
		Externalexample.sendKeys(example);
		callNewDimension(example, Externalexample);
	}
	catch (Exception e)
	{
		System.out.println("Error at Externalexample");
		System.out.println(e);
	}
	
	//____________________________________ Page 6 __________________________________
	
	
	try {
		relations.click();
	}
	catch (Exception e)
	{
		System.out.println("Error at relations");
		System.out.println(e);
	}
	
	try {
		String collaboration = ExcelUtility.getCellData("CreateSTP", 22, 6);
		ExternalCollaboration.sendKeys(collaboration);
		callNewDimension(collaboration,ExternalCollaboration);
	}
	catch (Exception e)
	{
		System.out.println("Error at ExternalCollaboration");
		System.out.println(e);
	}
	
	try {
		String competitor = ExcelUtility.getCellData("CreateSTP", 24, 6);
		Competitors.sendKeys(competitor);
		callNewDimension(competitor,Competitors);
	}
	catch (Exception e)
	{
		System.out.println("Error at Competitors");
		System.out.println(e);
	}
	

	try {
		SavenClose.click();
	}
	catch (Exception e)
	{
		System.out.println("Error at ");
		System.out.println(e);
	}
	
}

public void callNewDimension(String value, WebElement ele) throws InterruptedException
{
	String noDataText = null;
	try
	{
		Thread.sleep(4000);
		noDataText =driver.findElement(By.xpath("//div[@id='list-group-suggestions']")).getText();
		if (noDataText.equalsIgnoreCase("No Data .."))
		{
			
			ele.sendKeys(Keys.RETURN);
			try {
				Thread.sleep(3000);
				
				if(newDimensionName.isDisplayed())
				{

					newDimensionDescription.sendKeys("Description of "+value );
					Thread.sleep(1000);
					newDimensionAdditionalInfo.sendKeys("Additional Info of "+value);
					Thread.sleep(1000);
					newDimensionExternalLink.sendKeys("External link of "+value);
					Thread.sleep(2000);
					try 
					{
						newDimensionsave.click();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
					Thread.sleep(2000);
				}
				
			}
		catch(NoSuchElementException e)
		{
			try {
				WebElement path = driver.findElement(By.xpath("//div[contains(@data-original-title,"+value+")]"));
				if (path.isDisplayed())
				{
					System.out.println("Element Identified");
				}
			}
			catch(Exception e1)
			{
				System.out.println("Element not Identified");
			}
		}
		}
		else 
		{
			ele.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
		}
	}
	catch(Exception e)
	{
		ele.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
	}
	
	}

}