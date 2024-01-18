package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.util.PageUtility;
import com.obsqura.util.UniqueGenerator;

public class DeliveryBoyPage extends PageUtility {

	WebDriver driver;

	public  DeliveryBoyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(id = "name")
	private WebElement nameInput;
	
	@FindBy(id = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "password")
	private WebElement passwordInput;
	
	@FindBy(css = "[name='create']")
	private WebElement saveBtn;
	
	@FindBy(css = ".alert.alert-success")
	private WebElement alertTextDeliverBoyCreated;
	
	
	//@FindBy(css = ".card-title")
	//private WebElement title;
	

	
  public void createDeliverBoy(String name, String username, String password) throws InterruptedException {
		clickElement(newBtn);
		setTextBox(nameInput, name);
	    setTextBox(usernameInput, username);
		setTextBox(passwordInput, password);
		scrollToBottom();
     	waitUntilClickable(saveBtn);
     	Thread.sleep(2000);												
		clickElement(saveBtn);

}
	

	
	
	//public String validateDeliveryBoyIsCreated() {

		////return "";
	


	public String validateDeliveryBoyIsCreated() {
		// TODO Auto-generated method stub
		String text = getElementText(alertTextDeliverBoyCreated);
		return 	text.split("Alert!")[1].trim();
		}


	
	
	
}
