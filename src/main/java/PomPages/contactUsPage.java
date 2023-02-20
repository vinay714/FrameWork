package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage {

	// Declaration
	@FindBy(xpath = "//img[contains(@src,'contactus')]")
	private WebElement pageHeader;
	@FindBy(name = "name")
	private WebElement fullNameTF;
	@FindBy(name = "sender")
	private WebElement emailTF;
	@FindBy(name = "subject")
	private WebElement subjectTF;
	@FindBy(name = "message")
	private WebElement messageTextArea;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement sendUsMailButton;

	// Initialization
	public contactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}

	public void submitDetails(String name, String mail, String subject, String message) {
		fullNameTF.sendKeys(name);
		emailTF.sendKeys(mail);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendUsMailButton.click();
	}
}
