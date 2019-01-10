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


	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 40;
	public static WebDriverWait wait =new WebDriverWait(driver,40);

	//public static String fileName;
	//public static methodname;
	
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