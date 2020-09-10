package com.qa.ParalleTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ParalleTest.base.TestBase;

import net.bytebuddy.asm.Advice.This;

public class Bing {

	@FindBy(id = "b_logo")
	WebElement logo;

	public boolean logoMethod() {
		// wait.until(ExpectedConditions.visibilityOf(logo));
		return logo.isDisplayed();

	}

}
