package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocationTest extends BaseTest {

	
	@Test
	public void ManageLocationTest() throws IOException, InterruptedException    {

          lp.Login();
          hp.navigateToManageLocation();
          eb.editLocationButton();
          
          String actualAlertMsg= eb.validateLocationEditButton();
        	
      	Assert.assertEquals(actualAlertMsg, "Location Updated Successfully", "Failed to match  alert Text");

        	
          
          
}
}
	