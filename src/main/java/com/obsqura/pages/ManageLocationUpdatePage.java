package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.util.PageUtility;

public class ManageLocationUpdatePage extends PageUtility{
	WebDriver driver;

	public ManageLocationUpdatePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".btn-primary.btncss")
	private WebElement editBtn;
	

	@FindBy(css = ".btn.btn-danger")
	private WebElement updateButton;
	
	
	
	@FindBy(xpath = "//input[@placeholder='Enter the Delivery Charge']")
	private WebElement deliveryCharge;

	
	@FindBy(css = ".alert.alert-success")
	private WebElement alertTextLocationUpdate;
	
	
	
	
	//@FindBy(css = "[name='Create']")
	//private WebElement saveBtn;
	

	
	public void editLocationButton() throws InterruptedException
	{
		clickElement(editBtn);
		//WebElement deiveryCharge = null;
		setTextBox1(deliveryCharge);
		setTextBox(deliveryCharge,"150");
		scrollToBottom();

		clickElement(updateButton);
		

		//Thread.sleep(2000);
         //clickElement(searchBtn2);
         }

	public void deleteLocationButton()
	{
		
	}
	
	
	public String validateLocationEditButton() {
		// TODO Auto-generated method stub
		String text = getElementText(alertTextLocationUpdate);
		return 	text.split("Alert!")[1].trim();
		}

	public String validateLocationDeleteButton() {
		// TODO Auto-generated method stub
		String text = getElementText(alertTextLocationUpdate);
		return 	text.split("Alert!")[1].trim();
		}


}