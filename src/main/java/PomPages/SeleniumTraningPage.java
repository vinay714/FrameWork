package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import GenericLibraries.webDriverUtility;

public class SeleniumTraningPage {

	//Declaration
	@FindBy(xpath="//h1[@class='page-header']") private WebElement pageHeader;
	@FindBy(xpath="//button[text()=' Add to Cart']") private WebElement addToCartButton;
	@FindBy(id="add") private WebElement pluseButton;
	@FindBy(xpath="//div[@id='callout']/span") private WebElement itemAddedMessage;
	
	//initialization
		public SeleniumTraningPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		
		public WebElement getPageHeader() {
			return pageHeader;
		}
		public void doubleClickPluseButton(webDriverUtility web) {
			web.doubleClickElement(pluseButton);
		}
		public void clickAddCart() {
			addToCartButton.click();
		}
		public WebElement getItemAddedMessage() {
			return itemAddedMessage;
		}
	}

