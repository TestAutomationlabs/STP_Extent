package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.CreateSTPPage;
import com.qa.pages.HomePage;

public class CreateSTPPagetest extends TestBase {

	CreateSTPPage create;
	HomePage home;

	public CreateSTPPagetest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		create = new CreateSTPPage();
		home = new HomePage();
	}

	@Test(priority = 1)
	public void HelpTextValidation() throws Exception {

		home.ClickOnSTPLink();
		Thread.sleep(1000);
		create.HelpToggleValidation();

	}

	@Test
	public void MandatoryFieldValidation() throws Exception {
		create.EnterMandatoryFields();
	}

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}
}
