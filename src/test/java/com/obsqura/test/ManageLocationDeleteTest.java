package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocationDeleteTest extends BaseTest {
	@Test
	public void ManageLocationDeleteTest() throws IOException, InterruptedException    {

          lp.Login();
          hp.navigateToManageLocation();
          db.deleteListLocation();
          db.validateLocationDeleteButton();
          String actualAlertMsg= db.validateLocationDeleteButton();
      	
        Assert.assertEquals(actualAlertMsg, "Location Deleted Successfully", "Failed to match  alert Text");



}
}
