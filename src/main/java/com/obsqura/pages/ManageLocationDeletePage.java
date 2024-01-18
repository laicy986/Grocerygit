package com.obsqura.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.util.PageUtility;

public class ManageLocationDeletePage extends PageUtility {

	WebDriver driver;

	public ManageLocationDeletePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(css = ".btn-danger.btncss")
	private WebElement deleteButton;
	
	@FindBy(css = ".card-body.table-responsive.p-0")
	private WebElement table;

	@FindBy(xpath = "//tbody//tr[2]")
	private WebElement tableSecondRow;
	

	
	@FindBy(css = ".alert.alert-success")
	private WebElement alertTextLocationDelete;
	
	public void deleteListLocation() throws InterruptedException  
	{
		tableSecondRow.click();
		WebElement deleteButton=tableSecondRow.findElement(By.cssSelector(".btn-danger.btncss"));
	//tableUserNAME
		clickElement(deleteButton);
		
		acceptAlert() ;
		}

	public String validateLocationDeleteButton() {
		// TODO Auto-generated method stub
		String text = getElementText(alertTextLocationDelete);
		return 	text.split("Alert!")[1].trim();
		}

	


	

}
