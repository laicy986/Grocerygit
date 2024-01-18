package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.util.PageUtility;

public class ManageNewsPage extends PageUtility {
	WebDriver driver;

	public  ManageNewsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css =".btn-rounded.btn-primary")
	private WebElement searchButton1;
	
    @FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement clickSearchTextBox;

			@FindBy(css =".btn-danger.btn-fix")
	        private WebElement clickSearchSubmit;
			@FindBy(css = ".card-title")
			private WebElement textmsg;
	
	public void searchManageNews() 
	{
		clickElement(searchButton1);
		setTextBox(clickSearchTextBox,"web");

       // clickSearchTextBox.sendKeys("web");
        clickElement(clickSearchSubmit);
		//scrollToBottom();

		}
	public String validateSearchManageNews() {
		// TODO Auto-generated method stub
		String textmsg1 = getElementText(textmsg);
		return textmsg1;
		}
}
