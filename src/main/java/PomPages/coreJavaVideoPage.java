package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coreJavaVideoPage {

	// Declaration
	@FindBy(xpath = "//h1")
	private WebElement pageHeader;
	
	@FindBy(xpath="//a[text()='X']") private WebElement closeCookiesIcon;

	@FindBy(xpath = "//button[@aria-label='Play']")
	private WebElement playButton;
	@FindBy(xpath = "//button[@aria-label='Pause']")
	private WebElement pauseButton;

	@FindBy(id = "changeicon-708")
	private WebElement addToWishListTab;

	@FindBy(xpath = "//a[text()='X']")
	private WebElement popUpXButton;

	// Initialization
	public coreJavaVideoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}

	public void popUpbutton() {
		popUpXButton.click();
	}

	public void clickOnPlayButton() {
		playButton.click();
	}

	public void clickOnPauseButton() {
		pauseButton.click();
	}

	public void addToWishListButton() {
		addToWishListTab.click();
	}
	public void clickCloseCookies() {
		closeCookiesIcon.click();
	}

}
