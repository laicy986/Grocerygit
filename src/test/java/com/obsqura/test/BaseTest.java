package com.obsqura.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import com.obsqura.context.Constants;
import com.obsqura.pages.AdminUsersPage;
import com.obsqura.pages.DeliveryBoyPage;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageLocationDeletePage;
import com.obsqura.pages.ManageLocationUpdatePage;
import com.obsqura.pages.ManageNewsPage;
import com.obsqura.pages.MobileSliderPage;
import com.obsqura.pages.SearchOrderIdPage;
import com.obsqura.util.TestProperties;

import org.testng.annotations.Parameters;

public class BaseTest {

	public WebDriver driver = null;

	@BeforeMethod(alwaysRun=true)
	@Parameters({"browser"})
	public void initDriver(@Optional String browser) throws IOException {

		if(browser==null|| browser.isEmpty()) {
		 browser = TestProperties.getProperties().getProperty("browser");
		}
		String env= TestProperties.getProperties().getProperty("Envrionment");
		String URL=TestProperties.getProperties().getProperty(env);
		System.out.println("Executing in "+env);


		if(browser.equalsIgnoreCase("Chrome")) {
			 driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Choose correct Browser");
		}

		 driver.manage().window().maximize();
		 initPages();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// driver.get("21`");
     driver.get(URL);
}
	
	public LoginPage lp;
	public HomePage hp;
	public ExpenseCategoryPage ecp;
	public DeliveryBoyPage dlp;
	public SearchOrderIdPage sb;
	public ManageLocationUpdatePage eb;
	public ManageLocationDeletePage db;
	public AdminUsersPage au;
	public ManageNewsPage sn;
    public MobileSliderPage ms;
	
	public void initPages() {
	 lp = new LoginPage(driver);
	 hp = new HomePage(driver);
	 ecp=new ExpenseCategoryPage(driver);
	 dlp=new DeliveryBoyPage(driver);
	 sb=new SearchOrderIdPage(driver);
	 eb=new ManageLocationUpdatePage(driver);
	 db= new ManageLocationDeletePage(driver);
	 au= new AdminUsersPage (driver);
	 sn=new  ManageNewsPage(driver);
	 ms=new  MobileSliderPage(driver);
		

	}

	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	public  String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		String path= Constants.WORKINGDIRECTORY+ "//Reports//"+testCaseName+".png";
		File destfile = new File(path);
		FileUtils.copyFile(srcfile, destfile);
		return path;
	}
	
}
