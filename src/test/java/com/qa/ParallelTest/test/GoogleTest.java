package com.qa.ParallelTest.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ParalleTest.base.TestBase;
import com.qa.ParalleTest.pages.Google;

public class GoogleTest extends TestBase {
	Google go;
	@BeforeMethod
	void setup() {
		initialisation("https://www.google.com/");
		go = new Google();
		
	}
	@Test
	void LogoDisplayTest() {
		boolean flag = go.LogoDisplay();
		Assert.assertTrue(flag);
	}
	
	@Test
	void getTitleTest() {
		String title = go.getTitle();
		Assert.assertEquals("Google", title);
				
	}

	@AfterMethod
	void TearDown() {
		driver.quit();
	}

}
