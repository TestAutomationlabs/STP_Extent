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

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;

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
	
	@FindBy (xpath = "//span[text()='Save']")
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
	
//CreateSTP Actions

public CreateSTPPage()
{
PageFactory.initElements(driver, this);
}

public void HelpToggleValidation() throws Exception
{


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
CommunityOrganiser.sendKeys(ExcelUtility.getCellData("CreateSTP", 4, cellNo)+" ");
Thread.sleep(3000);
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
	Assets.sendKeys(Keys.RETURN);
	callNewDimension(asset);
	
	String database = ExcelUtility.getCellData("CreateSTP", 17, 6);
	Database.sendKeys(database);
	Database.sendKeys(Keys.RETURN);
	callNewDimension(database);
	
	String materials = ExcelUtility.getCellData("CreateSTP", 11, 6);
	MaterialUsed.sendKeys(materials);
	MaterialUsed.sendKeys(Keys.RETURN);
	callNewDimension(materials);
	//__________________________________ Page 3 ___________________________
	
	technologytab.click();
	
	String techniqueUsed = ExcelUtility.getCellData("CreateSTP", 10, 6);
	TechniqueUsed.sendKeys(techniqueUsed);
	TechniqueUsed.sendKeys(Keys.RETURN);
	callNewDimension(techniqueUsed);
	
	String relatedTech = ExcelUtility.getCellData("CreateSTP", 16, 6);
	RelatedTechnology.sendKeys(relatedTech);
	RelatedTechnology.sendKeys(Keys.RETURN);
	callNewDimension(relatedTech);
	
	String keyword = ExcelUtility.getCellData("CreateSTP", 19, 6);
	Keywords.sendKeys(keyword);
	Keywords.sendKeys(Keys.RETURN);
	callNewDimension(keyword);
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
	AssociatedTrends.sendKeys(Keys.RETURN);
	callNewDimension(trend);
	
	TechnologyReadiness.click();
	
	String merckPubli = ExcelUtility.getCellData("CreateSTP", 20, 6);
	PublicationsbyMerck.sendKeys(merckPubli);
	PublicationsbyMerck.sendKeys(Keys.RETURN);
	callNewDimension(merckPubli);
	
	String reivew = ExcelUtility.getCellData("CreateSTP", 21, 6);
	ReviewarticlesFromOutsideWorld.sendKeys(reivew);
	ReviewarticlesFromOutsideWorld.sendKeys(Keys.RETURN);
	callNewDimension(reivew);
	
	String patent = ExcelUtility.getCellData("CreateSTP", 23, 6);
	patents.sendKeys(patent);
	patents.sendKeys(Keys.RETURN);
	callNewDimension(patent);
	//____________________________________ Page 5 ______________________________
	
	ApplicationsnProductsTab.click();
	
	String application = ExcelUtility.getCellData("CreateSTP", 12, 6);
	Applications.sendKeys(application);
	Applications.sendKeys(Keys.RETURN);
	callNewDimension(application);
	
	String ongoing = ExcelUtility.getCellData("CreateSTP", 13, 6);
	ongoingProjects.sendKeys(ongoing);
	ongoingProjects.sendKeys(Keys.RETURN);
	callNewDimension(ongoing);

	String products = ExcelUtility.getCellData("CreateSTP", 14, 6);
	ProductsnServices.sendKeys(products);
	ProductsnServices.sendKeys(Keys.RETURN);
	callNewDimension(products);
	
	String example = ExcelUtility.getCellData("CreateSTP", 15, 6);
	Externalexample.sendKeys(example);
	Externalexample.sendKeys(Keys.RETURN);
	callNewDimension(example);
	//____________________________________ Page 6 __________________________________
	
	relations.click();
	
	String collaboration = ExcelUtility.getCellData("CreateSTP", 22, 6);
	ExternalCollaboration.sendKeys(collaboration);
	ExternalCollaboration.sendKeys(Keys.RETURN);
	callNewDimension(collaboration);
	
	String competitor = ExcelUtility.getCellData("CreateSTP", 24, 6);
	Competitors.sendKeys(competitor);
	Competitors.sendKeys(Keys.RETURN);
	callNewDimension(competitor);
	
	SavenClose.click();
}

public void callNewDimension(String value) throws InterruptedException
{
	try {
			Thread.sleep(2000);
			if(newDimensionName.isDisplayed())
			{

				newDimensionDescription.sendKeys("Description of "+value );
				Thread.sleep(1000);
				newDimensionAdditionalInfo.sendKeys("Additional Info of "+value);
				Thread.sleep(1000);
				newDimensionExternalLink.sendKeys("External link of "+value);
				Thread.sleep(1000);
				
				try {
					newDimensionsave.click();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				Thread.sleep(5000);
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
		
//	public HelpToggle ClickHelpToggle() 
//	{         HelpToggle.click(); 
//            return new HelpToggle();
//    }
//	
//	public generalInfo ClickgeneralInfo() 
//	{         generalInfo.click(); 
//            return new generalInfo();
//    }
	
//	public resources Clickresources() 
//	{         resources.click(); 
//            return new resources();
//    }
	
//	public technologytab Clicktechnologytab() 
//	{         technologytab.click(); 
//            return new technologytab();
//    }
	
//	public Knowledgetab ClickKnowledgetab() 
//	{         Knowledgetab.click(); 
//            return new Knowledgetab();
//    }
	
//	public ApplicationsnProductsTab ClickApplicationsnProductsTab() 
//	{         ApplicationsnProductsTab.click(); 
//            return new ApplicationsnProductsTab();
//    }
	
//	public relations Clickrelations() 
//	{         relations.click(); 
//            return new relations();
//    }
	
//	public SavenClose ClickSavenClose() 
//	{         SavenClose.click(); 
//            return new SavenClose();
//    }
	
//	public newDimensionsave ClicknewDimensionsave() 
//	{   for(String winHandle : driver.getWindowHandles())
//		{
//	    driver.switchTo().window(winHandle);
//	    element= newDimensionsave.click(); 
//		}
//		return element;
//}
	
//	public  SendKeysSTPName(int i) throws IOException  
//	{ 
//		return STPName.sendKeys(ExcelUtility.getCellData("CreateSTP",1,i));
//    }
	
//	public ShortName SendKeysShortName(int i) throws IOException  
//	{         ShortName.sendKeys(ExcelUtility.getCellData("CreateSTP",2,i));
//            return new ShortName();
//    }	

//	public Description SendKeysDescription(int i) throws IOException  
//	{         Description.sendKeys(ExcelUtility.getCellData("CreateSTP",3,i));
//            return new Description();
//    }

//	public CommunityOrganiser SendKeysCommunityOrganiser(int i) throws IOException  
//	{         CommunityOrganiser.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new CommunityOrganiser();
//    }
	
//	public Experts SendKeysExperts(int i) throws IOException  
//	{         Experts.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Experts();
//    }
	
//	public BusinessSector SendKeysBusinessSector(int i) throws IOException  
//	{         BusinessSector.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new BusinessSector();
//    }
	
//	public Location SendKeysLocation(int i) throws IOException  
//	{         Location.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Location();
//    }
	
//	public Location SendKeysLocation(int i) throws IOException  
//	{         Location.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Location();
//    }
	
//	public TechnologyReadiness SendKeysTechnologyReadiness(int i) throws IOException  
//	{         TechnologyReadiness.click();
//            return new TechnologyReadiness();
//    }
	
//	public Assets SendKeysAssets(int i) throws IOException  
//	{         Assets.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Assets();
//    }
	
//	public TechniqueUsed SendKeysTechniqueUsed(int i) throws IOException  
//	{         TechniqueUsed.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new TechniqueUsed();
//    }
	
//	public MaterialUsed SendKeysMaterialUsed(int i) throws IOException  
//	{         MaterialUsed.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new MaterialUsed();
//    }
	
//	public Applications SendKeysApplications(int i) throws IOException  
//	{         Applications.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Applications();
//    }
	
//	public ongoingProjects SendKeysongoingProjects(int i) throws IOException  
//	{         ongoingProjects.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new ongoingProjects();
//    }
	
//	public ProductsnServices SendKeysProductsnServices(int i) throws IOException  
//	{         ProductsnServices.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new ProductsnServices();
//    }
	
//	public Externalexample SendKeysExternalexample(int i) throws IOException  
//	{         Externalexample.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Externalexample();
//    }
	
//	public RelatedTechnology SendKeysRelatedTechnology(int i) throws IOException  
//	{         RelatedTechnology.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new RelatedTechnology();
//    }
	
//	public Database SendKeysDatabase(int i) throws IOException  
//	{         Database.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Database();
//    }
	
//	public AssociatedTrends SendKeysAssociatedTrends(int i) throws IOException  
//	{         AssociatedTrends.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new AssociatedTrends();
//    }
	
//	public Keywords SendKeysKeywords(int i) throws IOException  
//	{         Keywords.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Keywords();
//    }
	
//	public PublicationsbyMerck SendKeysPublicationsbyMerck(int i) throws IOException  
//	{         PublicationsbyMerck.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new PublicationsbyMerck();
//    }
	
//	public ReviewarticlesFromOutsideWorld SendKeysReviewarticlesFromOutsideWorld(int i) throws IOException  
//	{         ReviewarticlesFromOutsideWorld.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new ReviewarticlesFromOutsideWorld();
//    }
	
//	public ExternalCollaboration SendKeysExternalCollaboration(int i) throws IOException  
//	{         ExternalCollaboration.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new ExternalCollaboration();
//    }
	
//	public patents SendKeyspatents(int i) throws IOException  
//	{         patents.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new patents();
//    }
	
//	public Competitors SendKeysCompetitors(int i) throws IOException  
//	{         Competitors.sendKeys(ExcelUtility.getCellData("CreateSTP",4,i));
//            return new Competitors();
//    }
	
//	public ExpertiseLeveldropdown ClickExpertiseLeveldropdown(int i) throws IOException  
//	{         ExpertiseLeveldropdown.click();
//            return new ExpertiseLeveldropdown();
//    }

}
