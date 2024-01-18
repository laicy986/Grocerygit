package com.obsqura.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test
	public void verifyLogin() throws IOException {

		
		System.out.println("I am in test");		
		lp.Login();
		//hp.navigateToExpenseCategory();
		//ecp.c

	}
}
