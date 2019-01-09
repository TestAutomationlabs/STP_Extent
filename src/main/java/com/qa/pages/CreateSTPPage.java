package com.qa.pages;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestMethodFinder;
import org.testng.ITestNGMethod;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;
import com.qa.ExtentReportListner.ExtentReportNG;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class CreateSTPPage extends TestBase
{

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
	
	@FindBy (xpath = "//input[@placeholder='Publications by Merck']")
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
	
	@FindBy (xpath = "//span[contains(text(),'Discard')]")
	WebElement discard;
	
//CreateSTP Actions
//	private ExtentReports extent;
//	private ExtentTest test;
	
public CreateSTPPage()
{
PageFactory.initElements(driver, this);
}

public WebElement getDiscard()
{
	return discard;
}
public void clickDiscard()
{
	discard.click();
}

public void HelpToggleValidation() throws Exception
{
	//test = new ExtentTest(null, null);

if(!((HelpText).isDisplayed()))
{
System.out.println("Help Text not present");

	//test.log(LogStatus.FAIL, "Help Text not present");
}
else 
{
System.out.println("Help Text present");
HelpToggle.click();

if (HelpToggle.isEnabled())
{
	
	System.out.println("Toggle button clicked");
	//test.log(LogStatus.INFO, "Toggle button clicked");
	try
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	if (HelpText.isDisplayed())
		{
			System.out.println("Help text not removed. Hence failed");
			//test.log(LogStatus.FAIL, "Help text not removed. Hence failed");
		}
	}
	catch(Exception e)
	{
		System.out.println("Help text removed as expected");
		//test.log(LogStatus.PASS, "Help text removed as expected");
	}
}
}
//test.appendChild(test);
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
CommunityOrganiser.sendKeys(ExcelUtility.getCellData("CreateSTP", 4, cellNo)+"");
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
	
	BusinessSector.sendKeys(ExcelUtility.getCellData("CreateSTP", 6, 6)+" ");
	Thread.sleep(3000);
	BusinessSector.sendKeys(Keys.RETURN);
	//___________________________________ Page 2 ________________________________________
	resources.click();
	Thread.sleep(1000);
	
	CommunityOrganiser.sendKeys(ExcelUtility.getCellData("CreateSTP", 4, 6)+" ");
	Thread.sleep(3000);
	CommunityOrganiser.sendKeys(Keys.RETURN);
	
	Experts.sendKeys(ExcelUtility.getCellData("CreateSTP", 5, 6)+" ");
	Thread.sleep(3000);
	Experts.sendKeys(Keys.RETURN);
	
	String asset = ExcelUtility.getCellData("CreateSTP", 9, 6);
	Assets.sendKeys(asset);
	callNewDimension(asset, Assets);
	
	String database = ExcelUtility.getCellData("CreateSTP", 17, 6);
	Database.sendKeys(database);
	callNewDimension(database, Database);
	
	String materials = ExcelUtility.getCellData("CreateSTP", 11, 6);
	MaterialUsed.sendKeys(materials);
	callNewDimension(materials, MaterialUsed);
	
	//__________________________________ Page 3 ___________________________
	
	technologytab.click();
	
	String techniqueUsed = ExcelUtility.getCellData("CreateSTP", 10, 6);
	TechniqueUsed.sendKeys(techniqueUsed);
	callNewDimension(techniqueUsed, TechniqueUsed);
	
	String relatedTech = ExcelUtility.getCellData("CreateSTP", 16, 6);
	RelatedTechnology.sendKeys(relatedTech);
	callNewDimension(relatedTech, RelatedTechnology);
	
	String keyword = ExcelUtility.getCellData("CreateSTP", 19, 6);
	Keywords.sendKeys(keyword);
	callNewDimension(keyword, Keywords);
	//____________________________________ Page 4 ___________________________
	
	Knowledgetab.click();
	
	try {
	ExpertiseLevel.click();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	
	String trend = ExcelUtility.getCellData("CreateSTP", 18, 6);
	AssociatedTrends.sendKeys(trend);
	callNewDimension(trend, AssociatedTrends);
	
	TechnologyReadiness.click();
	
	String merckPubli = ExcelUtility.getCellData("CreateSTP", 20, 6);
	PublicationsbyMerck.sendKeys(merckPubli);
	callNewDimension(merckPubli, PublicationsbyMerck);
	
	String reivew = ExcelUtility.getCellData("CreateSTP", 21, 6);
	ReviewarticlesFromOutsideWorld.sendKeys(reivew);
	callNewDimension(reivew, ReviewarticlesFromOutsideWorld);
	
	String patent = ExcelUtility.getCellData("CreateSTP", 23, 6);
	patents.sendKeys(patent);
	callNewDimension(patent, patents);
	//____________________________________ Page 5 ______________________________
	
	ApplicationsnProductsTab.click();
	
	String application = ExcelUtility.getCellData("CreateSTP", 12, 6);
	Applications.sendKeys(application);
	callNewDimension(application, Applications);
	
	String ongoing = ExcelUtility.getCellData("CreateSTP", 13, 6);
	ongoingProjects.sendKeys(ongoing);
	callNewDimension(ongoing, ongoingProjects);

	String products = ExcelUtility.getCellData("CreateSTP", 14, 6);
	ProductsnServices.sendKeys(products);
	callNewDimension(products, ProductsnServices);
	
	String example = ExcelUtility.getCellData("CreateSTP", 15, 6);
	Externalexample.sendKeys(example);
	callNewDimension(example, Externalexample);
	//____________________________________ Page 6 __________________________________
	
	relations.click();
	
	String collaboration = ExcelUtility.getCellData("CreateSTP", 22, 6);
	ExternalCollaboration.sendKeys(collaboration);
	callNewDimension(collaboration,ExternalCollaboration);
	
	String competitor = ExcelUtility.getCellData("CreateSTP", 24, 6);
	Competitors.sendKeys(competitor);
	callNewDimension(competitor,Competitors);
	
	SavenClose.click();
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