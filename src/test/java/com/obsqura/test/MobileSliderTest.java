package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileSliderTest extends  BaseTest{
	@Test
	public void MobileSliderTest() throws IOException, InterruptedException {

		lp.Login();
	    hp.navigateToMobileSlider();
		ms.newSliderCreate();
		String actualAlertMsg= ms.validateAddMobileSlider();
    	
      	Assert.assertEquals(actualAlertMsg, "Mobile Slider Created Successfully", "Failed to match  alert Text");

	     
}
}