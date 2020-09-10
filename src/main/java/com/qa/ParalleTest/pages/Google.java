package com.qa.ParalleTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class Google {

	// Page Repository
	@FindBy(id = "hplogo")
	WebElement homePagelogo;

	

	// Methods
	public boolean LogoDisplay() {

		return homePagelogo.isDisplayed();
	}

}
