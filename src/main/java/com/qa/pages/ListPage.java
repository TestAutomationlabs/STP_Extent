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
	
	@FindBy (xpath = "//p[contains(text(),'Publications by Merck')]")
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
	
	public ListPage()
	{
		PageFactory.initElements(driver, this);
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
							//test.log(LogStatus.INFO, "End of search");
						}
				if (SearchCount>0)
				{
					System.out.println("Searched STP name matched the full name");
					//test.log(LogStatus.PASS, "Searched STP name matched the full name");
				}
				else
				{
					System.out.println("search parameter was not present");
					//test.log(LogStatus.FAIL, "Searched STP name not found");
				}
				}
				catch(Exception e)
				{
					System.out.println("Exception occured at search field");
					//test.log(LogStatus.FAIL, e);
				}
				}
				else
				{
					String noListTabLink = "Navigation to List Tab unsuccessful";
					System.out.println(noListTabLink);
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
			
			if (value.equalsIgnoreCase(FetchedValue))
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
						//test.log(LogStatus.PASS, "Searched STP name matched the full name");
						break;
					}
				}
			}
			
		}
	catch(Exception e)
	{
		//test.log(LogStatus.FAIL, "Name not found");
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
		removeSearchdata.click();
		listSearch.sendKeys(Keys.RETURN);
	}
	
	public void FilterByCategory() throws Exception
	{
		
		for (int i=4; i<22; i++)
		{
			String value = ExcelUtility.getCellData("CreateSTP", i, 0);
			String valueToMatch = ExcelUtility.getCellData("CreateSTP", i, 6);
			
		if (value.equalsIgnoreCase("Technology Readiness"))
			{
				
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
				}
				else 
				{
					System.out.println("Category failed");
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