package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.webDriverUtility;

public class SkillRaryDemoApp {

	// Declaration
	@FindBy(xpath = "//div[class='navbar-brand']")
	private WebElement PageHeader;
	@FindBy(id = "course")
	private WebElement courceTab;

	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTraning;

	@FindBy(xpath = "//select[@name='addresstype']")
	private WebElement categarydropdown;

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;

	// initialization
	public SkillRaryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getPageHeader() {
		return PageHeader;
	}

	public void mouseOverToCource(webDriverUtility web) {
		web.mouseHover(courceTab);
	}

	public void clickOnSeleniumTraning() {
		seleniumTraning.click();
	}

	public void seleniumCategory(webDriverUtility web, int index) {
		web.dropDown(categarydropdown, index);
	}

	public void clickOnContactUs() {
		contactUs.click();
	}
	public void scrollTillContact(webDriverUtility web)
	{
		web.scrollToElement(contactUs);
	}
}
