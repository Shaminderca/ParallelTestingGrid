package com.qa.ParallelTest.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ParalleTest.base.TestBase;
import com.qa.ParalleTest.pages.Yahoo;

public class YahooTest extends TestBase {
	Yahoo ya;

	@BeforeMethod
	void setup() {
		initialisation("https://ca.yahoo.com/?p=us");
		ya = new Yahoo();
	}

	@Test
	public void logoTest() {
		boolean flag = ya.logoMethod();
		Assert.assertTrue(flag);
	}

	public void titleTest() {
		String title = ya.getTitile();
		Assert.assertEquals("Yahoo", title);
	}

	@AfterMethod
	void TearDown() {
		driver.quit();
	}

}
