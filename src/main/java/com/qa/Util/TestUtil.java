package com.qa.Util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Base.TestBase;

public class TestUtil extends TestBase {


<<<<<<< HEAD
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;
	public static WebDriverWait wait =new WebDriverWait(driver,20);

	//public static String fileName;
	//public static methodname;
=======

	
	public static WebDriverWait wait =new WebDriverWait(driver,200);

	public static long IMPLICIT_WAIT = 100;
	public static long PAGE_LOAD_TIMEOUT = 40;
	
>>>>>>> 026ffc38bf0740e5e287cdc3ec65c270f5371d1e
	
	public static String getTimeStamp() {
	    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    return timestamp;
	}
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
}
	
	
	
	public static  void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\"  +getTimeStamp() + System.currentTimeMillis() + ".png"));
		//FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\"  +getName() + ".png"));
		//FileUtils.copyFile(scrFile, new File("D:\\SoftwareTestingMaterial.png"));
	}

}