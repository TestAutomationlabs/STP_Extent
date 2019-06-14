package com.qa.pages;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateSTPPage extends TestBase
{

	ExtentTest test;
	ExtentReports report;

//	CreateSTP Elements

	WebDriverWait wait=new WebDriverWait(driver,30);

	@FindBy(xpath="//div[text()='Create']")
	WebElement createStpText ;

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

	@FindBy(xpath = "//button[@class='btn btn-highlight mt-2 float-right']/span[text()='Upload']")
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

	@FindBy (xpath = "//button[@type='button'][text()='Close']")
	WebElement closeHelpPopup;

	@FindBy (xpath = "//span[text()='Discard']")
	WebElement discard;

//	@FindBy (xpath = "//div[@class='col-5 ml-3']")
//	WebElement uploadSendKeys;
	
//CreateSTP Actions

public CreateSTPPage()
{
PageFactory.initElements(driver, this);
}

//public void getUploadSendKeys()
//{
//	try {
//	uploadSendKeys.sendKeys("./SikuliImages/FileInput.PNG");
//	System.out.println("Send keys successful");
//	
//	}
//	catch(Exception e)
//	{
//		System.out.println("Exception found at uploading using send keys");
//	}
//}

public WebElement closeHelpPopup()
{
	return closeHelpPopup;
}

public void closeHelppopup() throws InterruptedException
{
	//wait.until(ExpectedConditions.visibilityOf(closeHelpPopup));
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
	//test = report.startTest("Help Text Validation");
	if(!((HelpText).isDisplayed()))
	{
	System.out.println("Help Text not present");
	
			}
	else
	{
	System.out.println("Help Text present");
	HelpToggle.click();

	
	if (HelpToggle.isEnabled())
	{
		System.out.println("Toggle button clicked");
		
		try
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			if (HelpText.isDisplayed())
				{
					
					System.out.println("Help text not removed. Hence failed");
				}
		}
		catch(Exception e)
		{
			
			System.out.println("Help text removed as expected");
		}
	}
}
	}

//______________________________________________________________________________________________________
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
	Thread.sleep(3000);
	CommunityOrganiser.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
	
	Thread.sleep(1000);

	SavenClose.click();
	//test.log(LogStatus.INFO, "Clicked on Save and close Button");
	System.out.println("Clicked on Save and close Button");
	Thread.sleep(1000);
}

//


//public void ImgUpload() throws InterruptedException, SikuliException
//{	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@class='btn btn-highlight mt-2 float-right']/span[text()='Upload']")).sendKeys(Keys.RETURN);
//
//
//	 Screen s=new Screen();
//	Pattern fileNameInput = new Pattern("C:\\Users\\SLANKEGO\\Git\\test-automation-stp\\SikuliImages\\FileInputName_STP.PNG");
//	 Pattern openButton=new Pattern("C:\\Users\\SLANKEGO\\Git\\test-automation-stp\\SikuliImages\\OpenButton_STP.PNG");
//
//
//	 s.type(fileNameInput,"C:\\Users\\SLANKEGO\\Downloads\\snipping.PNG");
//	s.click(openButton);
//}



//______________________________________________________________________________________________________
public void EnterALLFields() throws Exception
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	try {
		STPName.sendKeys(ExcelUtility.getCellData("CreateSTP", 1, 6));
		
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate STP Full name field");
		
	}

	try {
		Description.sendKeys(ExcelUtility.getCellData("CreateSTP", 3, 6));
		Thread.sleep(1000);
		System.out.println("validated Description Field");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate Description Field");
	}

	try {

	System.out.println("Trying to get into upload button");

	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='btn btn-highlight mt-2 float-right']/span[text()='Upload']")).click();
	Thread.sleep(3000);
	
	Pattern fileNameInput = new Pattern("C:\\Users\\SLANKEGO\\Desktop\\Git_UpdatedCode\\Com.QA.STP_ForExtent\\SikuliImages\\FileInputtextboxofSTP.PNG");
	 Pattern openButton=new Pattern("C:\\Users\\SLANKEGO\\Desktop\\Git_UpdatedCode\\Com.QA.STP_ForExtent\\SikuliImages\\OpenButtonOfSTP.PNG");
	 //C:\Users\SLANKEGO\Desktop\Git_UpdatedCode\Com.QA.STP_ForExtent\SikuliImages
	 Screen screen = new Screen();
	 
	 screen.type(fileNameInput,"C:\\Users\\SLANKEGO\\Downloads\\snippings.PNG");
	 screen.click(openButton);


	//ImgUpload();
	System.out.println("upload button is find");
	
	}
	catch (Exception e)
	{
		//test.log(LogStatus.FAIL, "Failed to upload the image");
		System.out.println("Failed to upload the image");
	}
	
//	try {
//		getUploadSendKeys();
//		test.log(LogStatus.PASS, "Upload successful");
//		}
//	catch(Exception e)
//	{
//		test.log(LogStatus.FAIL, "Failed to upload image");
//	}
	
	try {
		ShortName.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
		ShortName.sendKeys(ExcelUtility.getCellData("CreateSTP", 2, 6));
		
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate Short Name Field");
		
	}

	try {
		Location.sendKeys(ExcelUtility.getCellData("CreateSTP", 7, 6)+" ");
		Thread.sleep(4000);
		Location.sendKeys(Keys.RETURN);
		System.out.println("validated Location Field");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate Location Field");
		
	}

	try {
		BusinessSector.sendKeys(ExcelUtility.getCellData("CreateSTP", 6, 6)+" ");
		Thread.sleep(3000);
		BusinessSector.sendKeys(Keys.RETURN);
		System.out.println("validated BusinessSector Field");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate BusinessSector Field");
		
	}

	//___________________________________ Page 2 ________________________________________
	try {
		resources.click();
		Thread.sleep(1000);
		System.out.println("validated resources tab");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate resources tab");
		
	}

	try {
		CommunityOrganiser.sendKeys(ExcelUtility.getCellData("CreateSTP", 4, 6));
		Thread.sleep(4000);
		CommunityOrganiser.sendKeys(Keys.RETURN);
		System.out.println("validated CommunityOrganiser Field");
	}
	catch(Exception e)
	{
		
		System.out.println("Failed to validate CommunityOrganiser Field");
	}

	try {
		Experts.sendKeys(ExcelUtility.getCellData("CreateSTP", 5, 6)+" ");
		Thread.sleep(4000);
		Experts.sendKeys(Keys.RETURN);
		System.out.println("validated Experts Field");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate Experts Field");
		
	}

	try {
		String asset = ExcelUtility.getCellData("CreateSTP", 9, 6);
		Assets.sendKeys(asset);
		callNewDimension(asset, Assets);
		System.out.println("validated Assets Field");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate Assets Field");
		
	}

	try {
		String database = ExcelUtility.getCellData("CreateSTP", 17, 6);
		Database.sendKeys(database);
		callNewDimension(database, Database);
		System.out.println("validated Database Field");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate Database Field");
		
	}

	try {
		String materials = ExcelUtility.getCellData("CreateSTP", 11, 6);
		MaterialUsed.sendKeys(materials);
		callNewDimension(materials, MaterialUsed);
		System.out.println("validated MaterialUsed Field");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate MaterialUsed Field");
		
	}

	//__________________________________ Page 3 ___________________________
	try {
		technologytab.click();
		System.out.println("validated technologytab tab");
	}
	catch(Exception e)
	{
		System.out.println("Failed to validate technologytab tab");
		
	}

	try {
		String techniqueUsed = ExcelUtility.getCellData("CreateSTP", 10, 6);
		TechniqueUsed.sendKeys(techniqueUsed);
		callNewDimension(techniqueUsed, TechniqueUsed);
		System.out.println("validated TechniqueUsed Filed");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate TechniqueUsed tab");
		
	}

	try {
		String relatedTech = ExcelUtility.getCellData("CreateSTP", 16, 6);
		RelatedTechnology.sendKeys(relatedTech);
		callNewDimension(relatedTech, RelatedTechnology);
		System.out.println("validated RelatedTechnology Filed");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate RelatedTechnology field");
		
	}

	try {
		String keyword = ExcelUtility.getCellData("CreateSTP", 19, 6);
		Keywords.sendKeys(keyword);
		callNewDimension(keyword, Keywords);
		System.out.println("validated Keywords Filed");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate Keywords field");
		
	}

	//____________________________________ Page 4 ___________________________
	try {
		Knowledgetab.click();
		System.out.println("validated Knowledge tab");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate Knowledge tab");
		
	}

	try {
	ExpertiseLevel.click();
	System.out.println("validated ExpertiseLevel field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate ExpertiseLevel field");
		
	}

	try {
		String trend = ExcelUtility.getCellData("CreateSTP", 18, 6);
		AssociatedTrends.sendKeys(trend);
		callNewDimension(trend, AssociatedTrends);
		System.out.println("validated AssociatedTrends field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate AssociatedTrends field");
		
	}

	try {
		TechnologyReadiness.click();
		System.out.println("validated TechnologyReadiness field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate TechnologyReadiness field");
		
	}

	try {
		String merckPubli = ExcelUtility.getCellData("CreateSTP", 20, 6);
		PublicationsbyMerck.sendKeys(merckPubli);
		callNewDimension(merckPubli, PublicationsbyMerck);
		System.out.println("validated PublicationsbyMerck field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate PublicationsbyMerck field");
		
	}


	try {
		String reivew = ExcelUtility.getCellData("CreateSTP", 21, 6);
		ReviewarticlesFromOutsideWorld.sendKeys(reivew);
		callNewDimension(reivew, ReviewarticlesFromOutsideWorld);
		System.out.println("validated ReviewarticlesFromOutsideWorld field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate ReviewarticlesFromOutsideWorld field");
		
	}

	try {
		String patent = ExcelUtility.getCellData("CreateSTP", 23, 6);
		patents.sendKeys(patent);
		callNewDimension(patent, patents);
		System.out.println("validated ReviewarticlesFromOutsideWorld field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate ReviewarticlesFromOutsideWorld field");
		
	}

	//____________________________________ Page 5 ______________________________
	try {
		ApplicationsnProductsTab.click();
		System.out.println("validated ApplicationsnProducts tab");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate ApplicationsnProducts tab");
		
	}

	try {
		String application = ExcelUtility.getCellData("CreateSTP", 12, 6);
		Applications.sendKeys(application);
		callNewDimension(application, Applications);
		System.out.println("validated Applications field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate Applications field");
		
	}

	try {
		String ongoing = ExcelUtility.getCellData("CreateSTP", 13, 6);
		ongoingProjects.sendKeys(ongoing);
		callNewDimension(ongoing, ongoingProjects);
		System.out.println("validated ongoingProjects field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate ongoingProjects field");
		
	}

	try {
		String products = ExcelUtility.getCellData("CreateSTP", 14, 6);
		ProductsnServices.sendKeys(products);
		callNewDimension(products, ProductsnServices);
		System.out.println("validated ProductsnServices field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate ProductsnServices field");
		
	}

	try {
		String example = ExcelUtility.getCellData("CreateSTP", 15, 6);
		Externalexample.sendKeys(example);
		callNewDimension(example, Externalexample);
		System.out.println("validated Externalexample field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate Externalexample field");
		
	}

	//____________________________________ Page 6 __________________________________
	try {
		relations.click();
		System.out.println("validated relations tab");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate relations tab");
		
	}

	try {
		String collaboration = ExcelUtility.getCellData("CreateSTP", 22, 6);
		ExternalCollaboration.sendKeys(collaboration);
		callNewDimension(collaboration,ExternalCollaboration);
		System.out.println("validated ExternalCollaboration field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate ExternalCollaboration field");
		
	}

	try {
		String competitor = ExcelUtility.getCellData("CreateSTP", 24, 6);
		Competitors.sendKeys(competitor);
		callNewDimension(competitor,Competitors);
		System.out.println("validated Competitors field");
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate Competitors field");
		
	}

	try {
		SavenClose.click();
		System.out.println("validated SavenClose Button");
		
	}
	catch (Exception e)
	{
		System.out.println("Failed to validate SavenClose Button");
		
	}
}

//________________________________________________________________________________________________________________________

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
				Thread.sleep(2000);

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
