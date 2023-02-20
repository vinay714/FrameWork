package GenericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverUtility {
	WebDriver driver;

	public WebDriver openApplication(String browser, String url, long time) {

		switch (browser) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Enter valid browser data ");
			break;
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;

	}

	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public void doubleClickElement(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void dragAndDropElement(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}

	public void dropDown(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void dropDown(String text, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void dropDown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void switchToFrame() {
		driver.switchTo().frame(0);
	}

	public void switchBackFromFrame() {
		driver.switchTo().defaultContent();

	}

	public void handelAlert() {
		driver.switchTo().alert().accept();
	}

	public void handelChildBrowser() {
		Set<String> windoid = driver.getWindowHandles();
		/*Iterator<String> itr = windoid.iterator();
		while (itr.hasNext()) {
			String parentid = itr.next();
			String childid1 = itr.next(); 
		}
		driver.switchTo().window(childid);*/
		for (String string : windoid) {
			driver.switchTo().window(string);
		}
	}

	public void switchToParentWindow() {
		driver.switchTo().window(driver.getWindowHandle());
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", element);
	}

	public void takeScreenShot() {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/picture.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void explicitlyWait(long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void closeCurrentWindow() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
