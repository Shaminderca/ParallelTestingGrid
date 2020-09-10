package com.qa.ParallelTest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ParalleTest.base.TestBase;
import com.qa.ParalleTest.pages.Google;

public class GoogleTest {

	Google go;

	TestBase tb;

	WebDriver wg;

	@BeforeMethod
	void setup() {

		tb = TestBase.getTestBaseInstance();

		wg = tb.initialisation();

		wg.get("https://www.google.co.in/");

		System.out.println("The Open driver in Google test is wg :  " + wg);

	}

	@Test(priority = 1)
	void LogoDisplayTest() {

		System.out.println("Logo Display Test of Google");
		WebElement elementOne = wg.findElement(By.id("hplogo"));
		boolean flag = elementOne.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	void getTitleTest() {

		System.out.println("Title Test of Google");
		String title = wg.getTitle();
		Assert.assertEquals("Google", title);
	}

	@AfterMethod
	void TearDown() {

		System.out.println("Driver closed in Google test  wg" + wg);
		wg.quit();
	}

}
