package com.gxyj.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver createWeb(String type, String path) {
		
		WebDriver webDriver = null;
		type = type.toLowerCase().trim();
		
		switch (type) {
		case "firefox":
			if (path != null) {
				System.setProperty("webdriver.firefox.bin" , path);
			}
			
			webDriver = new FirefoxDriver();
			break;
			
		case "chrome":
			if (path != null) {
				System.setProperty("webdriver.chrome.driver", path);
			}
			
			if (Config.display) {
				webDriver = new ChromeDriver();
			}else {
				ChromeOptions chromeOptions = new ChromeOptions(); 
				chromeOptions.addArguments("--headless");
				webDriver = new ChromeDriver(chromeOptions);
			}
			//webDriver = new ChromeDriver();
			break;
			
		case "ie":
			if (path != null) {
				System.setProperty("webdriver.ie.driver", path);
			}
			
			webDriver = new InternetExplorerDriver();
			break;

		default:
			
			System.out.println("只支持以下浏览器类型：firefox、chrome、ie");
			break;
		} 
		
		return webDriver;
	}
}
