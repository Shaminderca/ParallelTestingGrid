package com.qa.ParalleTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ParalleTest.base.TestBase;

public class Yahoo {

	@FindBy(id = "header-logo")
	WebElement logo;

	public boolean logoMethod() {
		
		return logo.isDisplayed();

	}

	
}
