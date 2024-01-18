package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchOrderIdTest extends BaseTest {

@Test
	public void SearchOrderIdTest() throws IOException, InterruptedException  {

	//String od = null;
          lp.Login();
          hp.navigateToManageOrders();
          sb.createSearchButton();
          
		String actualSearchMsg= sb.validateSearchButton();
      	
      	/**
      	 * Perform assertion 
      	 */
      	
      	Assert.assertEquals(actualSearchMsg, "Search List Orders", "Failed to match  alert Text");

}
}



