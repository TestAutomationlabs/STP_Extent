package com.qa.pages;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ListPage extends TestBase
{

	
	
	int SearchCount = 0;
	String value = null;
	private static WebElement element = null;
	WebElement ele = null;

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
	
	@FindBy (xpath = "//p[contains(text(),'Ongoing Projects')]")
	WebElement popupProject;
	
	@FindBy (xpath = "//p[contains(text(),'Product')]")
	WebElement popupProduct;
	
	@FindBy (xpath = "//p[contains(text(),'External Examples')]")
	WebElement popupExample;
	
	@FindBy (xpath = "//p[contains(text(),'Related Technology')]")
	WebElement popupRelatedTechnology;
	
	@FindBy (xpath = "//p[contains(text(),'Database')]")
	WebElement popupDatabase;
	
	@FindBy (xpath = "//p[contains(text(),'Materials used')]")
	WebElement popupMaterial;
	
	@FindBy (xpath = "//p[contains(text(),'Associated Trends')]")
	WebElement popupTrend;
	
	@FindBy (xpath = "//p[contains(text(),'Keywords')]")
	WebElement popupKeyword;
	
	@FindBy (xpath = "//p[contains(text(),'Patents')]")
	WebElement popupInternationalPatentClass;
	
	@FindBy (xpath = "//p[contains(text(),'External Collaboration')]")
	WebElement popupExternalCollaboration;
	
	@FindBy (xpath = "//p[contains(text(),'Competitor')]")
	WebElement popupCompetitor;
	
	@FindBy (xpath = "//p[contains(text(),'Publications by Merck/EMD')]")
	WebElement popupPublicationInternal;
	
	@FindBy (xpath = "//p[contains(text(),'Review articles of outside world')]")
	WebElement popupPublicationExternal;
	
	@FindBy (xpath = "//input[@class='form-control']")
	WebElement searchInSelectedFilter;
	
	@FindBy (xpath = "//div[contains(@data-toggle,'tooltip')and contains(@class,'token text-left undefined')]")
	WebElement filterTip;
	
	@FindBy (xpath = "//div[@class='category-item-icon FilterTextColor']/*[1]")
	WebElement SelectedFilterClose;
	
	@FindBy (xpath = "//label[text()='Click to load more.']")
	WebElement loadMore;
	
	@FindBy (xpath = "//div[@id='sEaoUDiUOkh']")
	WebElement disabledLoad;
	
	@FindBy (xpath = "//*[@class='svg-inline--fa fa-times fa-w-11 globalsearch cursor-pointer']")
	WebElement removeSearchdata;
	
	@FindBy (xpath = "//*[@class='svg-inline--fa fa-times fa-w-11 category-item-close hide-when-collapsed cursor-pointer']")
	WebElement closeCategory;
	
	@FindBy (xpath ="//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[3]/button[2]")
	WebElement ShareWithMail;
	
	@FindBy (xpath = "//input[@placeholder='Type in the name of colleague you want to share the STP with ...']")
	WebElement shareWithField;
	
	@FindBy (xpath = "//div[text()='Uday Kumar']")
	WebElement mailCheckName;
	
	@FindBy (xpath = "//*[@placeholder='Look what I found on the STP Tool! This STP might help you ...']")
	WebElement reasonForSharing;
	
	@FindBy (xpath ="//button[text()='Share']")
	WebElement mailShare;
	
	@FindBy (xpath="//*[text()='Close']")
	WebElement mailShareclose;
	
	@FindBy (xpath ="//div[@role = 'alert']")
	WebElement mailSent;
	
	
	public ListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getlistSearch()
    {
        return listSearch;
       
    }
	
	public void mailSharepopup() throws InterruptedException
	{
		//try
		//{
			ShareWithMail.click();
			//test.log(LogStatus.PASS, "share with mail button clicked");
			System.out.println("Share with mail button clicked");
		//	try 
			//{
				shareWithField.sendKeys("Uday kumar");
				Thread.sleep(3000);
				shareWithField.sendKeys(Keys.RETURN);
				Thread.sleep(1000);
				String namePresent = mailCheckName.getText();
				//if(namePresent.equalsIgnoreCase("Uday Kumar"))
					if(namePresent.equalsIgnoreCase("Uday kumar"))
				{
					//test.log(LogStatus.PASS, "Name Enetered Successfully");
					System.out.println("Name Enetered Successfully");
					//try {
						Thread.sleep(1000);
							reasonForSharing.sendKeys();//"Sharing mail from Share button in List tab of STP application"
							//test.log(LogStatus.PASS, "Reason for Sharing details entered");
							System.out.println("Reason for Sharing details entered");
							//try {
									mailShare.click();
								//	test.log(LogStatus.PASS, "clicked on share button");
									System.out.println("clicked on share button");
								//	try {
										 //Verify mail sent toast message
											Thread.sleep(2000);
											//div[text()='Mail sent.']
											String clickedShareButton =mailSent.getText();
											if(clickedShareButton.equalsIgnoreCase("Mail sent."))
											{
												//test.log(LogStatus.PASS, "Mail sent toast messsage verified");
												System.out.println("Mail sent toast messsage verified");
											}
											else
											{
												//test.log(LogStatus.FAIL, "Mail sent toast message is not the same");
												System.out.println("Mail sent toast message is not the same");
											}
//										}
//									catch(Exception e)
//									{
//										//test.log(LogStatus.FAIL, "Toast message not verified");
//										System.out.println("Toast message not verified");
//									}
//								}
//							catch(Exception e)
//							{
//								//test.log(LogStatus.FAIL, "Unable to click on share button");
//								System.out.println("Unable to click on share button");
//							}
//						}
//					catch(Exception e)
//					{
//						//test.log(LogStatus.FAIL, "Failed to Enter the reason for sharing");
//						System.out.println("Failed to Enter the reason for sharing");
//					}
				}
				else
				{
					//test.log(LogStatus.FAIL, "Name Entered didnt match the expected");
					System.out.println("Name Entered didnt match the expected");
				}
//				//.test...
				
				
//			}
//			catch(Exception e)
//			{
//				
//			}
//		}
//		//catch(Exception e)
//		{
//			//test.log(LogStatus.PASS, "failed at share with mail button");
//			System.out.println("failed at share with mail button");
//		}
	}
	
	public void searchSTP() throws Exception
	{
		try
		{
			String searching = ExcelUtility.getCellData("CreateSTP", 1, 5);
			try {
				if (stpHeaderText.isDisplayed())
				{
					System.out.println("Navigation to List Tab successful");
					try {
						listSearch.sendKeys(searching);//ExcelUtility.getCellData("CreateSTP", 5, 1));
						listSearch.sendKeys(Keys.RETURN);
						
						Thread.sleep(1000);			
						try{
							elementSearch(searching);
						}
						catch(Exception e)
						{
							System.out.println("Search Ended");
							
						}
				if (SearchCount>0)
				{
					System.out.println("Searched STP name matched the full name");
					
				}
				else
				{
					System.out.println("search parameter was not present");
					
				}
				}
				catch(Exception e)
				{
					System.out.println("Exception occured at search field");
					
				}
				}
				else
				{
					String noListTabLink = "Navigation to List Tab unsuccessful";
					
				}
				
			}
			catch(Exception e)
			{
				String noListTabLink = "Navigation to List Tab unsuccessful";
				System.out.println(noListTabLink);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error while fetching data");
		}
		}
	
	public void elementSearch(String SearchValue)
	{
		do		
		{
		try {
			value = SearchValue;//ExcelUtility.getCellData("CreateSTP", 5, 1);
			String FetchedValue =	getstpinList().getText();
			System.out.println(FetchedValue);
			System.out.println(value);
			
			if (!(FetchedValue==null))
			{
				SearchCount++;
				//test.log(LogStatus.PASS, "Searched STP name matched the full name");
				break;
			}
			
			else
			{
				loadMore.click();
				//test.log(LogStatus.INFO, "Loading more data");
				Thread.sleep(2000);
				
				try
				{
					getstpinList();
				}
				catch(Exception e)
				{
					value = SearchValue;//ExcelUtility.getCellData("CreateSTP", 5, 1);
					FetchedValue = getstpinList().getText();
					System.out.println(FetchedValue);
					System.out.println(value);
					if (value.equalsIgnoreCase(FetchedValue))
					{
						SearchCount++;
						System.out.println("Search in Else loop");
						//test.log(LogStatus.PASS, "Searched STP name matched the full name");
						break;
					}
				}
			}
			
		}
	catch(Exception e)
	{
		System.out.println("Name not found");
	}
}
		while(loadMore.isDisplayed());
		
	}
	
	public WebElement getstpinList() throws IOException
	{
		try
		{
				int count =driver.findElements(By.xpath("//div[@class='row border-bottom mb-2 pb-2']")).size();
				System.out.println(count);
				String text = ExcelUtility.getCellData("CreateSTP", 1, 5);
				count = count+1;
				System.out.println(count);
			for(int i=1;i<=count;i++)
			{
			element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div["+i+"]/div[1]/h6[1]"));
				
				String preview=element.getText();
				System.out.println(preview);
				
				if (preview.equalsIgnoreCase(text))
				{
					break;
				}
				
			}
		}
		catch(NoSuchElementException e)
			{
				System.out.println("STP Name given is not present in the database");
			}
			return element;
	}
	
	public void clearSearchField()
	{
		try {
		removeSearchdata.click();
		listSearch.sendKeys(Keys.RETURN);
		}
		catch(Exception e)
		{
			System.out.println("Search term not present. lets continue");
		}
	}
	
	public void FilterByCategory() throws Exception
	{
		
		for (int i=4; i<25; i++)
		{
			String value = ExcelUtility.getCellData("CreateSTP", i, 0);
			String valueToMatch = ExcelUtility.getCellData("CreateSTP", i, 6);
			
		if (value.equalsIgnoreCase("Technology Readiness"))
			{
				//Technology readiness cannot be validated
			}
		
		else if (value.equalsIgnoreCase("Community Organizer")|| value.equalsIgnoreCase("Experts"))
		{
			valueToMatch = ExcelUtility.getCellData("CreateSTP", i, 7);
			
			try 
			{
				categoryButton.click();
				driver.findElement(By.xpath("//p[contains(text(),'"+value+"')]")).click();
				searchInSelectedFilter.sendKeys(valueToMatch);
				Thread.sleep(2000);
				searchInSelectedFilter.sendKeys(Keys.RETURN);
				Thread.sleep(2000);
				String searchedWord = filterTip.getText();
				String filterTipinList = getfilterTipinList().getText();
				if(searchedWord.contains(filterTipinList))
				{
					System.out.println("Category pass");
					System.out.println(value+ " filter applied sucessfully");
					//test.log(LogStatus.PASS, value+ "filter applied sucessfully");
				}
				else 
				{
					System.out.println("Category failed");
					//test.log(LogStatus.FAIL, value+"  filter not working as expected");
					System.out.println(value+ " fiter not working as expected");
				}
				
				
			}
			catch(Exception e)
				{
					System.out.println("An Error occured at "+value);
					System.out.println(e);
				}
			try {
				closeCategory.click();
				
			}
			catch(Exception e)
			{
				System.out.println("Unable to close the category");
				break;
			}
		}
			
		else
		{
			try 
			{
				categoryButton.click();
				driver.findElement(By.xpath("//p[contains(text(),'"+value+"')]")).click();
				searchInSelectedFilter.sendKeys(valueToMatch);
				Thread.sleep(2000);
				searchInSelectedFilter.sendKeys(Keys.RETURN);
				Thread.sleep(3000);
				String searchedWord = filterTip.getText();
				String filterTipinList = getfilterTipinList().getText();
				if(searchedWord.contains(filterTipinList))
				{
					System.out.println("Category pass");
					//test.log(LogStatus.PASS, value+"  filter applied sucessfully");
					System.out.println(value+ "filter applied successfully");
				}
				else
				{
					System.out.println("Category failed");
					System.out.println(value+ "filter not working as expected");
					//test.log(LogStatus.FAIL, value+"  filter not working as expected");
				}
				
				
			}
			catch(Exception e)
				{
					System.out.println("An Error occured at "+value);
					//test.log(LogStatus.INFO, "An Error occured at "+value );
					//test.log(LogStatus.FAIL, e);
					System.out.println(e);
				}
			try {
					
				closeCategory.click();
				
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Category close button not present");
			}
//			catch(Exception e)
//			{
//				System.out.println("Unable to close the category");
//				test.log(LogStatus.INFO, "Unable to close the category");
//				test.log(LogStatus.FAIL, e);
//				break;
//			}
		}
}
	}
	
	public WebElement getfilterTipinList() throws InterruptedException
	{	
		WebElement ele = null;
		
		String element = filterTip.getText();
		Thread.sleep(2000);
	 List<WebElement> Ele2= driver.findElements(By.xpath("//div[contains(@class,'token text-left ') and contains (text(),'"+element+"')]"));
	 String st = null;
	 for (int i = 0; i < Ele2.size(); i++)
	 {
		 System.out.println(element);
		 st= (Ele2.get(i).getText());
		 System.out.println(st);
	 }
	 System.out.println(st);
	 //st = st.trim();
	 //element = element.trim();
	 
		if (st.equalsIgnoreCase(element))
		{
			ele = driver.findElement(By.xpath("//div[contains(@class,'token text-left ') and text() ='"+element+"']"));
		}
		return ele;
	}
	
}