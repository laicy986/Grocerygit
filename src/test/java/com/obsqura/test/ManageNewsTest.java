package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageNewsTest extends BaseTest {
	@Test
	public void ManageNewsTest() throws IOException, InterruptedException {

	lp.Login();
     hp.navigateToManageContent();
     sn.searchManageNews();
     String actualSearchMsg= sn.validateSearchManageNews();
   	
 
   	Assert.assertEquals(actualSearchMsg, "Search Manage News", "Failed to match  alert Text");

	}
}
