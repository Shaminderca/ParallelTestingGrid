package com.qa.ParalleTest.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	private static TestBase instanceTbase = null;

	private TestBase() {

		System.out.println("Test Base Constructor");
	}

	protected ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public static TestBase getTestBaseInstance() {

		// System.out.println("Class instance during start up @@@@@" + instanceTbase);

		if (instanceTbase == null) {

			instanceTbase = new TestBase();

		}

		return instanceTbase;
	}

	public WebDriver initialisation() {
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		driver.set(new ChromeDriver());

		System.out.println("The drivers intialised in Testbase is :" + driver);
		driver.get().manage().window().maximize();
		driver.get().manage().deleteAllCookies();
		driver.get().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver.get();

	}

}