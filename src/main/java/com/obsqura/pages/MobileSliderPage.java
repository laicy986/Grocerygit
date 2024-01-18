package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.util.PageUtility;

public class MobileSliderPage extends PageUtility {
	WebDriver driver;

	public  MobileSliderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css =".btn-rounded.btn-danger")
	private WebElement newButton;
	
	@FindBy(id ="cat_id")
	private WebElement sliderCategory;
	
	@FindBy(id ="main_img")
	private WebElement chooseFile;
	
	@FindBy(css =".btn.btn-danger")
	private WebElement save;
	@FindBy(css = ".alert.alert-success")
	private WebElement alertAddMobileSlider;
	
	

	
	public void newSliderCreate() 
	{
		clickElement(newButton);
		selectDropdown(sliderCategory, "Apple");
        String imagePath = "C:\\Users\\ADMIN\\Desktop\\3840x2160-Images-For-Desktop.jpg";
        chooseFile.sendKeys(imagePath);
		clickElement(save);

		
		}
	
	
	public String validateAddMobileSlider() {
		// TODO Auto-generated method stub
		String alert = getElementText(alertAddMobileSlider);
		return 	alert.split("Alert!")[1].trim();
		}
	
	
	
	
	
}
