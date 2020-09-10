package com.qa.ParallelTest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ParalleTest.base.TestBase;
import com.qa.ParalleTest.pages.Bing;

public class BingTest  {
	TestBase tb;
	WebDriver wb;

	@BeforeMethod
	void setup() {
		
		tb = TestBase.getTestBaseInstance();
		
		System.out.println("Instance of Bing class: " + tb);
		wb = tb.initialisation();
		wb.get("https://www.bing.com/");

		System.out.println("The Open driver in Bing test is  wb:  " + wb);

	}

	@Test(priority = 1)
	void logoMethodTest() {
		
	
		
		System.out.println("Logo Test of BING");

		WebElement elementOne = wb.findElement(By.id("b_logo"));
		boolean flag = elementOne.isDisplayed();
		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	void getitileTest() {
		
	
		
		System.out.println("Title test oF BING");
		String tittle = wb.getTitle();
		Assert.assertEquals("Bing", tittle);
	}

	@AfterMethod
	void TearDown() {

		System.out.println("The close driver in Bing test is wb:  " + wb);
		wb.quit();
	}
}
