package testscript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;
import PomPages.SkillRaryDemoApp;

public class forthTest extends BaseClass {
	
	@Test
	public void four(SkillRaryDemoApp contactUs) {
		SoftAssert soft = new SoftAssert();
		
		home.gearbut();
		home.clickSkillRaryDemoApp();
		web.handelChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		
		skillraryDemo.scrollTillContact(web);
		skillraryDemo.clickOnContactUs();
		
		
		soft.assertTrue(contactUs.getPageHeader().isDisplayed());
		
		
		List<String> data = excel.fetchDataFromExcel("Sheet2");
		contect.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();

	}

}
