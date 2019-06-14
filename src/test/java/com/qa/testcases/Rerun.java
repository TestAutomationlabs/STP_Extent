package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {
	
@Test(retryAnalyzer=com.qa.Util.RetryAnalyzer.class)
  public void Test1() {
	Assert.assertEquals(true, false);
	  
  }
}
