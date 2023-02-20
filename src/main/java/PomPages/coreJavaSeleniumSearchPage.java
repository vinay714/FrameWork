package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coreJavaSeleniumSearchPage {
	
	//Declaration
	@FindBy(xpath = "//h2[@class='list_title']")
	private WebElement pageHeder;
	@FindBy(xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialization
	public coreJavaSeleniumSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public String getPageHeader() {
		return pageHeder.getText();
	}

	public void clickOnCoreJavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	}

}
