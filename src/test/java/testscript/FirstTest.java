package testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FirstTest extends BaseClass {
	
	@Test
	public void first() {
		
		SoftAssert soft = new SoftAssert();
		home.gearbut();
		home.clickSkillRaryDemoApp();
		web.handelChildBrowser();
		
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.mouseOverToCource(web);
		skillraryDemo.clickOnSeleniumTraning();
		
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
		selenium.doubleClickPluseButton(web);
		selenium.clickAddCart();
		web.handelAlert();
		web.explicitlyWait(time, selenium.getItemAddedMessage());
		
		web.takeScreenShot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		soft.assertAll();
		
		
		
		
	}

}
