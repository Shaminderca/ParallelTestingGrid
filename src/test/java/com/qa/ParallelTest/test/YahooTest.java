package com.qa.ParallelTest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ParalleTest.base.TestBase;

public class YahooTest {
	TestBase tb;
	WebDriver wy;

	@BeforeMethod
	void setup() {
		
		tb = TestBase.getTestBaseInstance();
		
		System.out.println("Instance of Yahoo class: " + tb);
		wy = tb.initialisation();
		wy.get("https://ca.yahoo.com/");

		System.out.println("The close driver in yahoo test is wy :  " + wy);
	}

	@Test(priority = 1)
	public void logoTest() {
		
		

		System.out.println("Logo Display Test og Yahoo");

		WebElement elementOne = wy.findElement(By.id("header-logo"));
		boolean flag = elementOne.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void titleTest() {
		
		

		System.out.println("Title Test of Yahoo");
		String title = wy.getTitle();
		Assert.assertEquals("Yahoo", title);
	}

	@AfterMethod
	void TearDown() {
		System.out.println("The close driver in yahoo test is wy :  " + wy);
		wy.quit();
	}

}
