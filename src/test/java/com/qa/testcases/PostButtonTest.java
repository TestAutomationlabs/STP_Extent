package com.qa.testcases;

import java.io.IOException;
import java.util.Set;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.PostPages;

public class PostButtonTest extends TestBase{
	HomePage homepage;
	PostPages post;
	
	
	public PostButtonTest()
	{
		super();
	}
 
	@BeforeClass
	public void setUp() {
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

  