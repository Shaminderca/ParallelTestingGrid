package com.qa.ParallelTest.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ParalleTest.base.TestBase;
import com.qa.ParalleTest.pages.Bing;

public class BingTest extends TestBase {
	Bing bi;

	@BeforeMethod
	void setup() {

		initialisation("https://www.bing.com/");
		bi = new Bing();
	

	}

	@Test
	void logoMethodTest() {
	
		boolean flag = bi.logoMethod();
		Assert.assertTrue(flag);

	}

	@Test
	void getitileTest() {
		String tittle = bi.getitile();
		Assert.assertEquals("Bing", tittle);
	}

	@AfterMethod
	void TearDown() {
		driver.quit();
	}
}
