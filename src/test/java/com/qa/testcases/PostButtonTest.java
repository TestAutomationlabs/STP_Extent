package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;

public class PostButtonTest extends TestBase{
	HomePage homepage;
	
	
	public PostButtonTest()
	{
		super();
	}
 
	@BeforeClass
	public void setUp() {
		initialization();
		homepage=new HomePage();
	}
	
	
  @Test
	public void AddPostTest()
	{
			homepage.ClickOnPostButton();
			System.out.println("Navigated to the AddPost");
		}
}
  