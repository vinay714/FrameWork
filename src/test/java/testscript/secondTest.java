package testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class secondTest extends BaseClass {

	@Test

	public void secondname() {

		SoftAssert soft = new SoftAssert();

		home.gearbut();
		home.clickSkillRaryDemoApp();
		web.handelChildBrowser();

		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.seleniumCategory(web, 1);
		soft.assertEquals(testing.getPageHedder(),"Testing");
		
		web.dragAndDropElement(testing.getSeleniumImage(), testing.getCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		soft.assertAll();
		
	}
}