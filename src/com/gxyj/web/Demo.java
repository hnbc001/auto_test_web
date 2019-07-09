package com.gxyj.web;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*File file1 = new File("D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary binary = new FirefoxBinary(file1);
		File file2 = new File("C:\\Users\\User\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\u5mrsut4.default");
		FirefoxProfile profile = new FirefoxProfile(file2);
		profile.setPreference("extensions.firebug.allPagesActivation", "on");
		FirefoxDriver driver = new FirefoxDriver(binary, profile);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gxyj.com/index.html");
		driver.findElement(By.id("userInfo")).click();*/
		
		
		System.setProperty("webdriver.ie.driver", "D:\\Program Files (x86)\\Java\\driver\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E8%8B%B9%E6%9E%9C&prodPropPage=");
		//sdriver.get("https://www.baidu.com");
				
		/*System.setProperty("webdriver.chrome.driver","D:\\Program Files (x86)\\Java\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");*/
		
		//androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'请输入密码')]")).sendKeys("1111qqqq");
		
	}
}
