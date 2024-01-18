package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.util.PageUtility;

public class HomePage extends PageUtility{

	WebDriver driver;

	public  HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "(//*[contains(text(),'Manage Expense')])[1]")
	private WebElement manangeExpenseBtn;

	@FindBy(xpath = "//*[contains(text(),'Expense Category')]")
	private WebElement expenseCategoryBtn;
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Delivery Boy')])[1]")
	private WebElement manageDeliveryBoyBtn;
	

	@FindBy(xpath = "//*[contains(text(),'Manage Orders')]")
	private WebElement manageOrder;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Location')]")
	private WebElement manageLocation;
	
	@FindBy(xpath ="//p[contains(text(),'Admin Users')]")
	private WebElement AdminUsers;

	@FindBy(xpath = "(//*[contains(text(),'Manage Content')])[1]")
	private WebElement manageContent;
	
	@FindBy(xpath ="//p[contains(text(),'Manage News')]")
	private WebElement manageNews;
	
	@FindBy(xpath ="//p[contains(text(),'Mobile Slider')]")
	private WebElement mobileSlider;

	public void navigateToExpenseCategory() {
		//manangeExpenseBtn.click();
		//expenseCategoryBtn.click();
		clickElement(manangeExpenseBtn);
		clickElement(expenseCategoryBtn);
	}

	public void navigateToManageDeliveryBoy()
	{
		clickElement(manageDeliveryBoyBtn);

	}
	
	public void navigateToManageOrders()
	{
		clickElement(manageOrder);

	}
	
	public void navigateToManageLocation()
	{
		clickElement(manageLocation);

	}
	public void navigateToAdminUsers() {
		clickElement(AdminUsers);
	}
	
	public void navigateToManageContent() {
		clickElement(manageContent);
		clickElement(manageNews);

	}
	public void navigateToMobileSlider() {
		clickElement(mobileSlider);
	}
	
}
