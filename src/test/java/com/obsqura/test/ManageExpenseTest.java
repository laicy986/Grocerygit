package com.obsqura.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class ManageExpenseTest extends BaseTest {
	


	        @Test(groups="Smoke")
		public void ExpenseCategory() throws IOException {
			//LoginPage lp = new LoginPage(driver);

			lp.Login();
			hp.navigateToExpenseCategory();
			//ecp.createExpense();
			String expenseCreatedText = ecp.createExpense();
			//System.out.println(expenseCreatedText);
			Assert.assertEquals(expenseCreatedText, "Expense Category Created Successfully", "Failed to match expense alert Text");
			//Assert.fail();


			//HomePage hp = new HomePage(driver);
			
			//lp.Login();
			//hp.navigateToExpenseCategory();

	}

}
