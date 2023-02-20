package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.HomePage;
import PomPages.SeleniumTraningPage;
import PomPages.SkillRaryDemoApp;
import PomPages.TestingPage;
import PomPages.contactUsPage;
import PomPages.coreJavaSeleniumSearchPage;
import PomPages.coreJavaVideoPage;

public class BaseClass {
	
	protected PrepertiesFileUtility property;
	protected ExcelUtilitis excel;
	protected  webDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillRaryDemoApp skillraryDemo;
	protected SeleniumTraningPage selenium;
	protected TestingPage testing;
	protected coreJavaSeleniumSearchPage coreJava;
	protected coreJavaVideoPage javaVideo;
	protected contactUsPage contect;
	
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classConfiguration() {
		property= new PrepertiesFileUtility();
		excel = new ExcelUtilitis();
		web= new webDriverUtility();
		
		property.propertyFileInitilzation(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitilization(IConstantPath.EXCEL_FILE_PATH);
	}
	
	@BeforeMethod
	public void methodConfiguration() {
		 time = Long.parseLong(property.fetchProperty("time"));
		driver= web.openApplication(property.fetchProperty("browser"), 
				property.fetchProperty("url"), time);
	
		home = new HomePage(driver);
		skillraryDemo= new SkillRaryDemoApp(driver);
		selenium = new SeleniumTraningPage(driver);
		testing=new TestingPage(driver);
		coreJava=new coreJavaSeleniumSearchPage(driver);
		javaVideo = new coreJavaVideoPage(driver);
		contect= new contactUsPage(driver);
	}
	
	@AfterMethod
	public void methodTearDown() {
		web.quitBrowser();
	}
	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite 

}
















