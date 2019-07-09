package com.gxyj.web;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gxyj.util.CheckPoint;
import com.gxyj.util.Config;
import com.gxyj.util.DriverFactory;
import com.gxyj.util.Locator;

public class TestBase {
	
	public static WebDriver webDriver = null;
	protected CheckPoint checkPoint = null;
	protected static Locator locator = null;
	
	@BeforeTest
	public void tearUp() {

		webDriver = DriverFactory.createWeb(Config.browserType, Config.browserPath);
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(Config.objectWaitTime, TimeUnit.SECONDS);
		locator = new Locator(webDriver, Config.objectPaht);
	}
	
	@BeforeMethod
	public void check() {
		
		checkPoint = new CheckPoint();
	}

	@AfterTest
	public void tearDown() {
		
		webDriver.close();
		webDriver.quit();
	}
}
