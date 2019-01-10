package com.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Util.TestUtil;
import com.qa.pages.HomePage;
import com.qa.pages.PostPages;

public class PostButtonTest extends TestBase {
	HomePage homepage;
	PostPages post;

	public String stptoolnews_valdn;
	// public String post_stptitle_vladn;

	public PostButtonTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		homepage = new HomePage();
		System.out.println("Browser launched of STP");
		// logger=report.startTest("PostPage");

		post = new PostPages();
	}

	@Test(priority = 1)
	public void AddPostTest() throws Exception {
		homepage.verifyHelpPopup();
		homepage.ClickOnPostButton();
		System.out.println("Navigated to the AddPost");

	}

	

	@Test(priority = 2)
	public void verifyPostbuttonClickAfterSuccessStories() throws IOException, Exception {
		// post.PostbuttonClickAfterSuccessStories();
	}

	@Test(priority = 3)
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

	@Test(priority = 4)
	public void verifySTPNews() throws Exception {
		// *[@id="root"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/span/div[1]
		String beforexpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div[";
		String afterxpath = "]/span/div[1]";
		int rowcount = homepage.STPwebtablerows.size();
		System.out.println(rowcount);

		for (int i = 1; i < rowcount; i++) {
			String name = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();
			System.out.println(name);
			if (name.contains(post.titledata_valdn)) {
				stptoolnews_valdn = homepage.EnteredSTPToolData.getText();
				System.out.println("STP News data validation" + stptoolnews_valdn);
				break;

			}

		}
	}

	
	@Test(priority = 5)
	public void verifyPostPageTest() throws Exception {
		
		Thread.sleep(2000);
		homepage.ClickOnPostButton();
		System.out.println("Navigated to the AddPost for success stories");
		post.verifySuccessStoriescategoryBox();

	}
	@AfterClass
	public void TearDown() {
		//driver.close();
	}

}
