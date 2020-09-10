package com.qa.ParalleTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ParalleTest.base.TestBase;

public class Google extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 20);

	// Page Repository
	@FindBy(id = "hplogo")
	WebElement homePagelogo;

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchbox;

	@FindBy(xpath = "//input[@name='btnk']")
	WebElement buttonClick;

	// Methods
	public boolean LogoDisplay() {
		wait.until(ExpectedConditions.visibilityOf(homePagelogo));
		return homePagelogo.isDisplayed();
	}

	public String getTitle() {

		return driver.getTitle();

	}

}
