package testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;


public class thirdTest extends BaseClass {
	
	@Test
	public void third() throws InterruptedException {
		SoftAssert soft =new SoftAssert() ;
		
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELENIUM");
		
		coreJava.clickOnCoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.getPageHeader(), "Core Java For Selenium Traning");
		
		
		javaVideo.clickCloseCookies();
		web.switchToFrame();
		javaVideo.clickOnPlayButton();
		Thread.sleep(3000);
		javaVideo.clickOnPauseButton();
		
		web.switchBackFromFrame();
		javaVideo.addToWishListButton();
		
		soft.assertAll();
		}
	}


