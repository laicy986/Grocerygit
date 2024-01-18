package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.util.PageUtility;

public class SearchOrderIdPage extends PageUtility {


	WebDriver driver;

	public  SearchOrderIdPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".btn-rounded.btn-primary")
	private WebElement searchBtn;
	
	@FindBy(id = "od")
	private WebElement orderId;
	
	@FindBy(css="[name = 'Search']")
	private WebElement searchBtn2;
	
	//@FindBy(css = "[name='Create']")
	//private WebElement saveBtn;
	
	@FindBy(css = ".card-title")
	private WebElement textmsg;
	
	
	public void createSearchButton()
	{
		clickElement(searchBtn);
		setTextBox(orderId,"190");
        clickElement(searchBtn2);
		scrollToBottom();

         
         }
	
	public String validateSearchButton() {
		// TODO Auto-generated method stub
		String textmsg1 = getElementText(textmsg);
		return textmsg1;
		}

}
