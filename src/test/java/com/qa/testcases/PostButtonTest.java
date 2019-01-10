package com.qa.testcases;

import java.io.IOException;
import java.util.Set;

<<<<<<< HEAD


import org.testng.Assert;
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.PostPages;

public class PostButtonTest extends TestBase {
	HomePage homepage;
	PostPages post;
	public String stptooldata_valdn;
	// public String post_stptitle_vladn;

	public PostButtonTest() {

		super();
	}

	@BeforeClass
	public void setUp() {
<<<<<<< HEAD
		initialization();
		homepage=new HomePage();
		post = new PostPages();
	}
	
	
  @Test(priority=1)
	public void AddPostTest()
	{
			homepage.ClickOnPostButton();
			System.out.println("Navigated to the AddPost");
	}
  @Test(priority=2)
  public void verifyPostPageTest() throws Exception
  {
	
	  
	  //post.verifySTPToolcategoryBox();
	  post.verifySuccessStoriescategoryBox();
	  //post.verifyaddpostdetails();
	  //post.verifyPost();
//  }
}
  
  @Test(priority=3)
  public void verifyPostbuttonClickAfterSuccessStories() throws IOException, Exception
  {
	  post.PostbuttonClickAfterSuccessStories();
  }
  
  @Test(priority=4)
  public void verifySTPToolStory() throws IOException, Exception
  {
	  post.verifySTPToolcategoryBox();
  }
}

  
=======

		initialization();
		homepage = new HomePage();
		System.out.println("Browser launched of STP");
		// logger=report.startTest("PostPage");

		post = new PostPages();
	}

	@Test(priority = 1)
	public void AddPostTest() {
		homepage.ClickOnPostButton();
		System.out.println("Navigated to the AddPost");

	}

	@Test(priority = 2)
	public void verifyPostPageTest() throws Exception {
		// post.verifySuccessStoriescategoryBox();

	}

	@Test(priority = 3)
	public void verifyPostbuttonClickAfterSuccessStories() throws IOException, Exception {
		// post.PostbuttonClickAfterSuccessStories();
	}

	@Test(priority = 4)
	public void verifySTPToolStory() throws IOException, Exception {
		post.verifySTPToolcategoryBox();

	}

	/*
	 * @Test(priority=5) public void verifySTPToolIcon() throws Exception {
	 * homepage.ClickOnSTPToolIcon();
	 * List<WebElement>stpnews_list=driver.findElements(By.
	 * xpath("//div[@class='news-title fs-15p font-weight-bold break-word']"));
	 * System.out.println("size of stpnews_list is" +stpnews_list);
	 * 
	 * stptooldata_valdn=homepage.EnteredSTPToolData.getText();
	 * System.out.println("Stptooldatavaliation is " +stptooldata_valdn);
	 * 
	 * 
	 * if(stptooldata_valdn.equalsIgnoreCase(post.titledata_valdn)) {
	 * 
	 * //Assert.assertEquals(stptooldata_valdn, post.titledata_valdn);
	 * System.out.println(" Actual and expected results is matched ");
	 * 
	 * }
	 * 
	 * 
	 * }
	 */

	@Test(priority = 5)
	public void verifySTPToolIcon() throws Exception {
		// *[@id="root"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/span/div[1]
		String beforexpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[";
		String afterxpath = "]/span/div[1]";
		int rowcount = homepage.STPwebtablerows.size();
		System.out.println(rowcount);

		for (int i = 1; i < rowcount; i++) {
			String name = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();
			System.out.println(name);
			if (name.contains(post.titledata_valdn)) {
				stptooldata_valdn = homepage.EnteredSTPToolData.getText();
				System.out.println("STP Tool data validation" + stptooldata_valdn);
				break;

			}

		}
	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}

}
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
