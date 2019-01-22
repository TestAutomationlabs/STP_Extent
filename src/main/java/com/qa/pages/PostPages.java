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
import com.qa.DataDriven.ExcelUtility;
import com.qa.Util.TestUtil;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class PostPages extends TestBase{
	HomePage homepagenew=new HomePage();
	
	//@FindBy(xpath="//label/following::select[@class='form-control']")
	@FindBy(xpath="//select[@class='form-control']")
	WebElement selectdropdown;
	
	WebElement selectdropdownvalidation;
	WebElement successstoryvalidation;
	
	@FindBy(xpath = "//label/following::input")
	public WebElement Title;
	
	//@FindBy(xpath=)
	@FindBy(xpath="//div/following::label[contains(text(),'Your')]/following::textarea")
	WebElement YourPost;
	
	//@FindBy(xpath="//input[@placeholder='Select STPs']")
	@FindBy(xpath="//div[@class='undefined tokenizer-container position-relative']//following::input")
	WebElement STPs;

	@FindBy(xpath="//button[@type='submit']")
	WebElement Post;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath="//div[@class='Toastify__toast-container Toastify__toast-container--bottom-center ToastContainer']")
	WebElement Post_EmptyDetails;
	
	String Titletextbox;
	String Yourpostbox;
	String STPsbox;
	
	
	/* Variable Declaration
	 * Title=Title;
	 * YourPost=YourPostTextbox;
	 * SelectCategory=selectdropdown;
	 * Post=Postbutton;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	String Titletextbox1;
	String Yourpostbox1;
	String STPsbox1;
	public String stp_titledata_valdn;
	public String Success_titledata_valdn;
	
	
	String Titletextbox2;
	String Yourpostbox2;
	String STPsbox2;
	public PostPages() {
		PageFactory.initElements(driver, this);
	}
	
	

	
	/*public void verifySTPToolcategoryBox() throws IOException, Exception{
		try {	
		selectdropdownvalidation= TestUtil.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']//option[3]")));
			Thread.sleep(2000);
		System.out.println("selectdropdownvalidation is " +selectdropdownvalidation);
		selectdropdownvalidation.click();
		
	
		
		Titletextbox1=ExcelUtility.getCellData("PostDetails", 6, 0);
		Title.sendKeys(Titletextbox1);
		
		Thread.sleep(3000);
		stp_titledata_valdn=Title.getAttribute("value");
		System.out.println("Title data validation data" +stp_titledata_valdn);
		
		Yourpostbox1=ExcelUtility.getCellData("PostDetails", 6, 1);
		YourPost.sendKeys(Yourpostbox1);
		YourPost.sendKeys(Keys.TAB,Keys.ENTER);
		
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("Staleelementexception found");
		}
		
	}*/
	
	public void verifySTPToolcategoryBox(ExtentTest test) throws IOException, Exception{
		try {
			
		List<WebElement>dropdown = driver.findElements(By.xpath("//select[@class='form-control']//option[3]"));
		System.out.println("Click on the select dropdown");
		System.out.println(dropdown.size());
		for(int i=0; i<dropdown.size();i++){
			System.out.println(dropdown.get(i).getText());
			Thread.sleep(3000);
			
	
		if(dropdown.get(i).getText().contains("STP Tool"))
			{
			Thread.sleep(2000);
			dropdown.get(i).click();
			System.out.println("STP Tool Element is clicked");
			Titletextbox1=ExcelUtility.getCellData("PostDetails", 6, 0);
			Title.sendKeys(Titletextbox1);
			
			Thread.sleep(3000);
			stp_titledata_valdn=Title.getAttribute("value");
			System.out.println("STP Title data validation data" +stp_titledata_valdn);
			
			Yourpostbox1=ExcelUtility.getCellData("PostDetails", 6, 1);
			YourPost.sendKeys(Yourpostbox1);
			YourPost.sendKeys(Keys.TAB,Keys.ENTER);
			
			
			}
		}
	}
	
		catch(StaleElementReferenceException e)
		{
			System.out.println("Staleelementexception found");
		}
	}
	
	
	public void verifySuccessStoriescategoryBox(ExtentTest test) throws IOException, Exception{
		try {
			
		List<WebElement>dropdown = driver.findElements(By.xpath("//select[@class='form-control']//option[2]"));
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
			test.log(LogStatus.PASS, "Element has been clicked");
			Titletextbox=ExcelUtility.getCellData("PostDetails", 3, 0);
			Title.sendKeys(Titletextbox);
			test.log(LogStatus.PASS, "STP title has been entered");
			
			Success_titledata_valdn=Title.getAttribute("value");
			System.out.println("Success Title data validation data" +Success_titledata_valdn);	
			
			Thread.sleep(3000);
			STPsbox=ExcelUtility.getCellData("PostDetails", 1, 2);
			STPs.sendKeys(STPsbox);
			test.log(LogStatus.PASS, "STP Success message has been entered");
			System.out.println("STPs Box text value is "+ STPsbox);
			Thread.sleep(4000);
			STPs.sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);
			//String stptooltip= driver.findElement(By.xpath("//div[@data-toggle='tooltip']")).getText();
			//String stptooltip=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/form/div[3]/div/div")).getText();
			String stptooltip=driver.findElement(By.xpath("//*[@class='svg-inline--fa fa-times fa-w-11 ']")).getText();
			System.out.println("STP tool tip is " +stptooltip);
			
//			if(STPsbox.contains(stptooltip))
//			{
				if(STPsbox.contains(stptooltip))
				{
			
			STPsbox=ExcelUtility.getCellData("PostDetails", 2, 2);
			STPs.sendKeys(STPsbox);
			Thread.sleep(3000);
			System.out.println("STPs value is "+ STPs);
			STPs.sendKeys(Keys.ENTER);
			
			Yourpostbox=ExcelUtility.getCellData("PostDetails",3, 1);
			YourPost.sendKeys(Yourpostbox);
			System.out.println("your post value is "+ YourPost);
			YourPost.sendKeys(Keys.TAB,Keys.ENTER);
			
				}
			}
		}
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("Staleelementexception found");
		}
		}
	
		
	
	public void PostbuttonClickAfterSuccessStories(ExtentTest test) throws IOException, Exception
	{
		//div/following::button[@class='btn btn-highlight ml-0']
		//div/following::button[@class='btn btn-highlight ml-0']
		//successstoryvalidation=TestUtil.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("homepagenew.PostButton")));
		//successstoryvalidation=TestUtil.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/following::button[@class='btn btn-highlight ml-0']")));
		successstoryvalidation=driver.findElement(By.xpath("//div/following::button[@class='btn btn-highlight ml-0']"));
		successstoryvalidation.click();
		System.out.println("Postbutton clicked for successstory validation");
		//homepagenew.ClickOnPostButton();
		
	}
	
	

	
	public void ClickOnCancelButton(ExtentTest test)
	{
		try {
		if(!cancel.isEnabled())
		{
			test.log(LogStatus.FAIL, "Cancel button is not displayed");
			System.out.println("Cancel button is not displayed");
		}
		else
		{
		cancel.click();
		test.log(LogStatus.PASS, "Cancel button is displayed and clicked successfully");
		System.out.println("Cancel button clicked successfully");
	}
		
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Cancel button is not displayed");
		}

}
	
//	public void ClickOnPostWithEmptyDetails(ExtentTest test) throws Exception
//	{
//		Title.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
//		//YourPost.sendKeys(Keys.TAB,Keys.ENTER);
//		//TestUtil.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-highlight'][contains(text(),'Post')]")));
//		driver.findElement(By.xpath("//div[@class='Toastify__toast-container Toastify__toast-container--bottom-center ToastContainer']")).click();
//		System.out.println("Empty post button clicked in postpage");
//		//Post.click();
//		Thread.sleep(1000);
//		String toast=Post_EmptyDetails.getText();
//		System.out.println("Toast message is displayed for empty post click" +toast);
//		test.log(LogStatus.PASS, "Toast message is displayed for empty post click");
//	}
	
}
