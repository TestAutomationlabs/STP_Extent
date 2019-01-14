
package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.qa.Util.ExtentContent;
import com.qa.Util.TestUtil;
import com.qa.Util.WebEventListener;


public class TestBase{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	
	
	
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com"
					+ "/qa/config/config.properties");
			
			//C:\Users\SLANKEGO\eclipse-workspace\STP_Automation\src\main\java\com\qa\config\config.properties
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./ExternalJars/ChromeDriver/chromedriver.exe");	
			
			//C:\Users\SLANKEGO\eclipse-workspace\STP_Automation\ExternalJars\ChromeDriver\chromedriver.exe
			driver = new ChromeDriver(); 
			
		}
	/*	else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SLANKEGO\\eclipse-workspace\\STP_Automation\\geckodriver");	
			driver = new FirefoxDriver(); 
		}*/
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		
		driver.get(prop.getProperty("url"));
		
	}
	
	/*public void ExtentReportInitilization()
	{
		String currentDir = System.getProperty("user.dir");		
		report = new ExtentReports(currentDir+ "/test-output/"+"STP_ExtentOutputhome.html");
		logger=report.startTest("testName");
		
	}
	
	public void ExtentReportEnds()
	{
		report.endTest(logger);
		  report.flush();
	}*/

}
