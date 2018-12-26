package com.qa.pages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.helpers.HeaderFooterHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;
import com.relevantcodes.extentreports.ExtentX;

public class CreateSTPPage extends TestBase
{
//	CreateSTP Elements
	
	@FindBy(xpath="//div[text()='Create']")
	WebElement createStpText ;
	
	@FindBy(xpath="//span[contains(@class,'slider round')]")
	WebElement HelpToggle;
	
	//private By HelpToggle = By.xpath("//span[contains(@class,'slider round')]");
	
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
	
// CreateSTP Actions
	
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
		
		public void EnterMandatoryFields() throws InterruptedException, IOException
		{
			for (int i = 1; i<2; i++)
			{
				STPName.sendKeys(ExcelUtility.getCellData("CreateSTP", 1, i));
				Thread.sleep(1000);
				Description.sendKeys(ExcelUtility.getCellData("CreateSTP", 2, i));
				Thread.sleep(1000);
				ShortName.sendKeys(ExcelUtility.getCellData("CreateSTP", 2, i));
				Thread.sleep(1000);
				resources.click();
				Thread.sleep(1000);
				CommunityOrganiser.sendKeys("Kushalappa ");
				Thread.sleep(3000);
				CommunityOrganiser.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
				Thread.sleep(1000);
				SavenClose.click();
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

