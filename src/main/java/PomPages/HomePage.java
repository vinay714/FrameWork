package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Declaration
	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchbar;
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchbutton;
	@FindBy(xpath = "//a[contains(text(),' GEARS ')]")
	private WebElement GearBUtton;
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement demoAppLink;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getLogo() {
		return logo;
	}

	public void searchFor(String data) {
		searchbar.sendKeys(data);
		searchbutton.click();
	}

	public void gearbut() {
		GearBUtton.click();
	}

	public void clickSkillRaryDemoApp() {
		demoAppLink.click();
	}

}
