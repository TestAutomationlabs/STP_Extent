package com.qa.testcases;

import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class UploadTest extends TestBase{
	
	public UploadTest()
	{
		super();
	}
  @Test
  public void f() throws InterruptedException, FindFailed {
	  initialization();
	  driver.manage().window().maximize();
	  
      driver.get("http://demo.automationtesting.in/Register.html");
      driver.findElement(By.id("imagesrc")).click();

      Thread.sleep(5000);
      
      Pattern fileNameInput = new Pattern("C:\\Users\\SLANKEGO\\Desktop\\Git_UpdatedCode\\Com.QA.STP_ForExtent\\SikuliImages\\FileInput.PNG");
      Pattern openButton = new Pattern("C:\\Users\\SLANKEGO\\Desktop\\Git_UpdatedCode\\Com.QA.STP_ForExtent\\SikuliImages\\Open.PNG");

      Screen screen = new Screen();
      screen.type(fileNameInput, "C:\\Users\\SLANKEGO\\snipping.PNG");
      screen.click(openButton);
  }
}
  
