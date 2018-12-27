package com.qa.testcases;

import java.util.Set;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.PostPage;

public class PostButtonTest extends TestBase{
	HomePage homepage;
	PostPage post;
	
	
	public PostButtonTest()
	{
		super();
	}
 
	@BeforeClass
	public void setUp() {
		initialization();
		homepage=new HomePage();
		post = new PostPage();
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
	  post.verifycategoryBox();
	  post.verifyaddpostdetails();
	  post.verifyPost();
//  }
}
}

  