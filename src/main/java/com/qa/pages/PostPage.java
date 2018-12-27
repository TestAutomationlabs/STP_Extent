package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.DataDriven.ExcelUtility;

public class PostPage extends TestBase{
	
	@FindBy(xpath="//select[@class='form-control']")
	WebElement selectdropdown;
	
	@FindBy(xpath = "//label/following::input")
	WebElement Title;
	
	//@FindBy(xpath=)
	@FindBy(xpath="//div/following::label[contains(text(),'Your')]/following::textarea")
	WebElement YourPost;	

	@FindBy(xpath="//button[contains(text(),'Post')]")
	WebElement Post;
	
	String Titletextbox;
	String Yourpostbox;
	
	public PostPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void verifycategoryBox() throws IOException{
		//Select sct = new Select(selectdropdown);
		//sct.selectByIndex(2);
		
		List<WebElement>dropdown = driver.findElements(By.xpath("selectdropdown"));
		System.out.println(dropdown.size());
		
		for(int i=0;i<dropdown.size();i++){
			System.out.println(dropdown.get(i).getText());
			if(dropdown.get(i).getText().equals("STP Tool")){
				dropdown.get(i).click();
				//TitleBox.sendKeys("ABC123");
				//YourPostBox.sendKeys("TEst");
				
				Titletextbox=ExcelUtility.getCellData("PostDetails", 1, 0);
				Title.sendKeys(Titletextbox);
				
				ExcelUtility.getCellData("PostDetails", 1, 1);
				YourPost.sendKeys(Yourpostbox);
			}
			else if(dropdown.get(i).getText().equals("Success Stories"))
				{
				Titletextbox=ExcelUtility.getCellData("PostDetails", 2, 0);
				Title.sendKeys(Titletextbox);
				
				ExcelUtility.getCellData("PostDetails", 1, 1);
				YourPost.sendKeys(Yourpostbox);
			}
		}
		
	}
	
	public void verifyaddpostdetails() throws InterruptedException
	{
		
		//Title.sendKeys("ABC123");
		//YourPostBox.sendKeys("TEst");
	}
	
	public  void verifyPost()
	{
		
		Post.click();
		System.out.println("Post button clicked successfully");
	}
	

}
