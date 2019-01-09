package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.DataDriven.ExcelUtility;
import com.qa.Util.TestUtil;

public class PostPages extends TestBase{
	HomePage homepagenew=new HomePage();
	
	//@FindBy(xpath="//label/following::select[@class='form-control']")
	@FindBy(xpath="//select[@class='form-control']")
	WebElement selectdropdown;
	WebElement selectdropdownvalidation;
	
	@FindBy(xpath = "//label/following::input")
	public WebElement Title;
	
	//@FindBy(xpath=)
	@FindBy(xpath="//div/following::label[contains(text(),'Your')]/following::textarea")
	WebElement YourPost;
	
	@FindBy(xpath="//input[@placeholder='Select STPs']")
	WebElement STPs;

	@FindBy(xpath="//button[@type='submit']")
	WebElement Post;
	
	String Titletextbox;
	String Yourpostbox;
	String STPsbox;
	
	
	String Titletextbox1;
	String Yourpostbox1;
	String STPsbox1;
	public String titledata_valdn;
	public PostPages() {
		PageFactory.initElements(driver, this);
	}
	
	

	
	public void verifySTPToolcategoryBox() throws IOException, Exception{
		try {	
		selectdropdownvalidation= TestUtil.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']//option[3]")));
		System.out.println("selectdropdownvalidation is " +selectdropdownvalidation);
		selectdropdownvalidation.click();
	
		
		Titletextbox1=ExcelUtility.getCellData("PostDetails", 1, 0);
		Title.sendKeys(Titletextbox1);
		
		Thread.sleep(3000);
		titledata_valdn=Title.getAttribute("value");
		System.out.println("Title data validation data" +titledata_valdn);
		
		Yourpostbox1=ExcelUtility.getCellData("PostDetails", 1, 1);
		YourPost.sendKeys(Yourpostbox1);
		YourPost.sendKeys(Keys.TAB,Keys.ENTER);
		
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("Staleelementexception found");
		}
		
	}
	
	
	public void verifySuccessStoriescategoryBox() throws IOException, Exception{
		List<WebElement>dropdown = driver.findElements(By.xpath("//select[@class='form-control']//option"));
		
		System.out.println("Click on the select dropdown");
		System.out.println(dropdown.size());
		for(int i=0; i<dropdown.size();i++){
			System.out.println(dropdown.get(i).getText());
			Thread.sleep(3000);
			
	
		if(dropdown.get(i).getText().contains("Success Stories"))
			{
			Thread.sleep(2000);
			dropdown.get(i).click();
			System.out.println("Element has clicked");
			Titletextbox=ExcelUtility.getCellData("PostDetails", 1, 0);
			Title.sendKeys(Titletextbox);
			
				
			STPsbox=ExcelUtility.getCellData("PostDetails", 1, 2);
			STPs.sendKeys(STPsbox);
			Thread.sleep(3000);
			STPs.sendKeys(Keys.ENTER);
			
			
			String stptooltip= driver.findElement(By.xpath("//div[@data-toggle='tooltip']")).getText();
			System.out.println(stptooltip);
			
			if(STPsbox.contains(stptooltip))
			{
			
			STPsbox=ExcelUtility.getCellData("PostDetails", 1, 3);
			STPs.sendKeys(STPsbox);
			Thread.sleep(3000);
			STPs.sendKeys(Keys.ENTER);
			
			Yourpostbox=ExcelUtility.getCellData("PostDetails", 1, 1);
			YourPost.sendKeys(Yourpostbox);
			YourPost.sendKeys(Keys.TAB,Keys.ENTER);
			
		}
		}
		}
		}
	
	public void PostbuttonClickAfterSuccessStories() throws IOException, Exception
	{
		System.out.println("Postbutton again");
		homepagenew.ClickOnPostButton();
		
	}
	
	

	
//	public  void verifyPost()
//	{
//		Post.click();
//		System.out.println("Post button clicked successfully");
//	}
	

}
