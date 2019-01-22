package com.qa.testcases;


import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;
  @Test
  public void f() throws Exception {
  
	 
		
	
		 
       
        Screen s=new Screen();
        Pattern fileNameInput = new Pattern("C:\\Users\\SLANKEGO\\Git\\test-automation-stp\\SikuliImages\\FileInput.PNG");
        Pattern openButton=new Pattern("C:\\Users\\SLANKEGO\\Git\\test-automation-stp\\SikuliImages\\Open.PNG");
        Pattern imagepath=new Pattern("C:\\Users\\SLANKEGO\\Pictures\\snipping.PNG");
        
        System.setProperty("webdriver.chrome.driver", "./ExternalJars/ChromeDriver/chromedriver.exe");	
		
		//C:\Users\SLANKEGO\eclipse-workspace\STP_Automation\ExternalJars\ChromeDriver\chromedriver.exe
		driver = new ChromeDriver(); 
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).click();
		Thread.sleep(4000);
        // String imgfilepath="C:\\Users\\SLANKEGO\\Pictures\\snipping";
		
		s.type(fileNameInput,"C:\\Users\\SLANKEGO\\Pictures\\snipping.PNG");
		
       s.click(openButton);
  
}
}
