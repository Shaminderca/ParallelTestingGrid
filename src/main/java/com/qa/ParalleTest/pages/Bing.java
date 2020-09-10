package com.qa.ParalleTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ParalleTest.base.TestBase;

public class Bing extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);

	@FindBy(id = "b_logo")
	WebElement logo;

	public boolean logoMethod() {
		//wait.until(ExpectedConditions.visibilityOf(logo));
		return logo.isDisplayed();

	}

	public String getitile() {
		return driver.getTitle();

	}

}
