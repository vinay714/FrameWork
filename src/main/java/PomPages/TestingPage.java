package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	// Declaration

	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHedder;
	@FindBy(id = "Selenium Training")
	private WebElement seleniumImage;
	@FindBy(id = "cartArea")
	private WebElement cartArea;
	@FindBy(xpath = "//footer[@class='main-footer']/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;

	// initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getPageHedder() {
		return pageHedder.getText();
	}

	public WebElement getSeleniumImage() {
		return seleniumImage;
	}

	public WebElement getCartArea() {
		return cartArea;

	}

	public WebElement getFacebookIcon() {
		return facebookIcon;
	}

	public void clickFaceBookIcon() {
		facebookIcon.click();
	}

}
