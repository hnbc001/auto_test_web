package com.gxyj.util;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Locator {
	
	private WebDriver webDriver = null;
	private XmlParser xmlParser = null;
	
	public Locator(WebDriver webDriver, String path) {
		
		this.webDriver = webDriver;
		this.xmlParser = new XmlParser(path);
	}
	
	private By getBy(String page, String name) {
		
		String type = xmlParser.getAttri("//" + page + "/" + name, "type");
		String value = xmlParser.getAttri("//" + page + "/" + name , "value");
		
		By by = null;
		switch (type) {
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "classname":
			by = By.className(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "linktext":
			by = By.linkText(value);
			break;

		default:
			System.out.println("不支持的定位方式：" + type);
			break;
		}
		
		return by;
	}
	
	//根据xml点击页面元素
	public void clickByXml(String page, String name) {
		
		webDriver.findElement(getBy(page, name)).click();
	}
	
	
	//浏览器等待时长
	public void wait(int seconds) {
		
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//关闭浏览器
	public void close() {
		
		webDriver.close();
		webDriver.quit();
	}
	
	//关闭当前窗口
	public void closeCurrentWindow(){
		webDriver.close();
	}
	
	//关闭其余窗口
	public void closeOtherWindow(){
		String handle = webDriver.getWindowHandle();
		Set<String> handles = webDriver.getWindowHandles();
		for(String h : handles){
			if(handle.equalsIgnoreCase(h)) continue;
			if(h.trim().length() > 0)
				webDriver.switchTo().window(h).close();
		}
		webDriver.switchTo().window(handle);
	}
	
	//打开网页地址
	public void get(String url) {
		
		webDriver.get(url);
		com.gxyj.util.MyListener.url = url;
		for (int i = 0; i < 5; i++){
			if (this.getUrl().contains("errorpage.jhtml")){
				webDriver.get(url);
			} else {
				break;
			}
			if (i == 5 && this.getUrl().contains("errorpage.jhtml"))
				System.out.println("此页面:" + url + "已经尝试重新打开5次未成功!");
		}
	}
	
	//获取输入框，然后输入信息
	public void sendKeys(String page, String name, String string) {
	
		webDriver.findElement(getBy(page, name)).click();
		webDriver.findElement(getBy(page, name)).clear();
		webDriver.findElement(getBy(page, name)).sendKeys(string);
	}
	
	//获取输入框，然后输入信息
	public void clearKeys(String page, String name) {
	
		webDriver.findElement(getBy(page, name)).click();
		webDriver.findElement(getBy(page, name)).clear();
	}
	
	//根据Actions对象，输入信息
	public void sendkeys(String string) {
		
		Actions actions = new Actions(webDriver);
		actions.sendKeys(string);
		actions.perform();
	}
	
	//获取元素的文本值
	public String getText(String page, String name) {
		
		WebElement webElement = webDriver.findElement(getBy(page, name));
		return webElement.getText();
	}
	
	//获取元素的属性
	public String getAttri(String page, String name, String attri) {
		
		WebElement webElement = webDriver.findElement(getBy(page, name));
		
		return webElement.getAttribute(attri);
	}
	
	//获取同一类元素的文本值
	public List<String> getTexts(String page, String name) {
		List<String> results = new ArrayList<String>();
		List<WebElement> lists = webDriver.findElements(getBy(page, name));
		if (lists.size() > 0) {
			for (WebElement webElement : lists) {
				if (webElement != null) {
					results.add(webElement.getText());
				}
			}
		}else {
			System.out.println("未找到对象");
		}
		
		return results;
	}
	
	
	//获取同一类元素的属性
	public List<String> getAttris(String page, String name, String attri) {
		
		List<String> results = new ArrayList<String>();
		List<WebElement> lists = webDriver.findElements(getBy(page, name));
		if (lists.size() > 0) {
			
			for (WebElement webElement : lists) {
				if (webElement != null) {
					results.add(webElement.getAttribute(attri));
				}
			}
		}else {
			System.out.println("未找到对象");
		}
		
		return results;
	}
	
	//根据value值选择下拉列表
	public void selectByValue(String page, String name, String value) {
		
		WebElement webElement = webDriver.findElement(getBy(page, name));
		Select select = new Select(webElement);
		select.selectByValue(value);
	}	
	
	//根据test值选择下拉列表
	public void selectByTest(String page, String name, String test){
		
		WebElement webElement = webDriver.findElement(getBy(page, name));
		Select select = new Select(webElement);
		select.selectByVisibleText(test);
	}
	
	//随机选择下拉列表
	public void selectByRandom(String page, String name) {
		
		WebElement webElement = webDriver.findElement(getBy(page, name));
		Select select = new Select(webElement);
		int index = new Random().nextInt(select.getOptions().size());
		select.selectByIndex(index);
		wait(1);
	}
	
	//获取元素的个数
	public int elementsCount(String page, String name) {
		
		try {
			List<WebElement> list = webDriver.findElements(getBy(page, name));
			
			return list.size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return 0;
		}
	}
	
	//判断元素是否存在
	public boolean elementIsExit(String page, String name) {
		
		try {
			webDriver.findElement(getBy(page, name));
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
	}
	
	//判断同一类元素是否存在
	public boolean elementIsExits(String page, String name) {
		
		boolean flag = false;
		
		try {
			List<WebElement> list = webDriver.findElements(getBy(page, name));
			
			if (list.size() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	
	//点击元素然后获取该元素的文本值
	public List<String> clickAndGetText(String page1, String name1, String page2, String name2) {
		
		List<String> results = new ArrayList<String>();
		List<WebElement> tabs = webDriver.findElements(getBy(page1, name1));
		for (WebElement webElement : tabs) {
			webElement.click();
			wait(1);
			List<WebElement> texts = webDriver.findElements(getBy(page2, name2));
			for (WebElement text : texts) {
				results.add(text.getText());
			}
		}
		
		return results;
	}
	
	//点击元素然后获取元素的属性
	public List<String> clickAndGetAttri(String page1, String name1, String page2, String name2, String string) {
		
		List<String> results = new ArrayList<String>();
		List<WebElement> tabs = webDriver.findElements(getBy(page1, name1));
		for (WebElement webElement : tabs) {
			webElement.click();
			wait(1);
			List<WebElement> texts = webDriver.findElements(getBy(page2, name2));
			for (WebElement text : texts) {
				results.add(text.getAttribute(string));
			}
		}
		
		return results;
	}
	
	//获取页面的链接
	public String getUrl() {
		
		return webDriver.getCurrentUrl();
	}
	
	//登录操作
	public void login_B2C() {
		get("http://www.gxyj.com/index.html");
		clickByXml("首页_B2C", "马上登录");
		wait(5);
		sendKeys("登录页_B2C", "用户名", "15300085608");
		sendKeys("登录页_B2C", "密码", "a12345678a");
		clickByXml("登录页_B2C", "登录");
		for (int i = 0; i < 5; i++){
			String url = this.getUrl();
			if (url.equals("http://www.gxyj.com/index.html")){
				break;
			}else{
				login_B2C_code();
			}
			if (i == 5)
				System.out.println("已经尝试重新登录5次未成功!");
		}
	}
	
	//登录核心
	public void login_B2C_code(){
		get("http://www.gxyj.com/index.html");
		clickByXml("首页_B2C", "马上登录");
		wait(5);
		if(!this.getUrl().equals("http://www.gxyj.com/index.html")){
			sendKeys("登录页_B2C", "用户名", "15300085608");//15300085608
			sendKeys("登录页_B2C", "密码", "a12345678a");//a12345678a
			clickByXml("登录页_B2C", "登录");
		}
	}
	
	//退出操作
	public void quit_B2C() {
		
		clickByXml("首页_B2C", "退出");
	}
	
	//刷新页面
	public void refresh() {
		
		webDriver.navigate().refresh();
	}
	
	//回退上一页面
	public void back() {
		
		webDriver.navigate().back();
	}
	
	//添加cookie，可以绕过验证码直接登录
	public void addCookie(String name, String value) {
		Cookie cookie = new Cookie(name, value);
		webDriver.manage().addCookie(cookie);
	}
	
	
	//alert弹框点击确定
	public void acceptAlert() {
		
		Alert alert = webDriver.switchTo().alert();
		alert.accept();
	}
	
	
	//alert弹框点击取消
	public void dismissAlert() {
		
		Alert alert = webDriver.switchTo().alert();
		alert.dismiss();
	}
	
	//alert弹框输入文本内容，点击确定
	public void promptAlert(String text) {
		
		Alert alert = webDriver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}
	
	//获取alert弹框弹出的文本值
	public String getAlertText() {
		
		Alert alert = webDriver.switchTo().alert();
		
		return alert.getText();
	}
	
	//获取窗口的句柄
	public String getHandle() {
		
		return webDriver.getWindowHandle();
	}
	
	//获取打开多个窗口的所有句柄
	public Set<String> getHandles() {
		
		return webDriver.getWindowHandles();
	}
	
	//根据句柄跳转到指定页面
	public void switchToWindow(String handle) {
		
		webDriver.switchTo().window(handle);
	}
	
	//根据frame的名字跳转frame窗口
	public void switchToFrame(String name) {
		
		webDriver.switchTo().frame(name);
	}
	
	//跳转到父类的frame窗口
	public void switchToParentFrame() {
		
		webDriver.switchTo().parentFrame();
	}
	
	//直接跳转到最外一层的HTML
	public void switchToDefaultContent() {
		
		webDriver.switchTo().defaultContent();
	}
	
	//把焦点移动到某一元素上
	public void moveToElement(WebElement webElement) {
		
		Actions actions = new Actions(webDriver);
		actions.moveToElement(webElement);
		actions.perform();
	}
	
	//双击元素
	public void doubleClick(WebDriver webDriver) {
		
		Actions actions = new Actions(webDriver);
		actions.doubleClick();
		actions.perform();
	}
	
	//双击元素
	public void doubleClick(WebElement webElement) {
		
		Actions actions = new Actions(webDriver);
		actions.doubleClick(webElement);
		actions.perform();
	}
	
	//从某一元素拖拽到另一元素
	public void dragAndDrop(WebElement webElement1, WebElement webElement2) {
		
		Actions actions = new Actions(webDriver);
		actions.dragAndDrop(webElement1, webElement2);
		actions.perform();
	}
	
	//从某一位置拖拽到另一位置
	public void dragAndDropBy(WebElement webElement, int wide, int high) {
		
		Actions actions = new Actions(webDriver);
		actions.dragAndDropBy(webElement, wide, high);
		actions.perform();
	}
	
	//点击某一元素不抬起鼠标
	public void clickAndHold(String page, String name) {
		
		WebElement webElement = webDriver.findElement(getBy(page, name));
		Actions actions = new Actions(webDriver);
		actions.clickAndHold(webElement);
		actions.perform();
	}
	
	//抬起鼠标
	public void release() {
		
		Actions actions = new Actions(webDriver);
		actions.release();
		actions.perform();
	}
	
	//全选复制
	public void copyAll() {
		
		Actions actions = new Actions(webDriver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		actions.perform();
	}
	
	//粘贴
	public void paste() {
		
		Actions actions = new Actions(webDriver);
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		actions.perform();
	}
	
	//上传文件
	public void upLoad(String page, String name, String path) {
		
		webDriver.findElement(getBy(page, name)).sendKeys(path);
	}
	
	public void pic() throws IOException{
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String picname = format.format(new Date());
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\workwebspace\\work\\src\\com\\gxyj\\util\\chromedriver.exe");
        webDriver.get("http://www.gxyj.com/index.html");
        WebElement element = webDriver.findElement(By.id("queryButton"));//captchaval//validateCode//queryButton
        File srcFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        BufferedImage img = ImageIO.read(srcFile);
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();
        Rectangle rect = new Rectangle(width, height);
        Point p = element.getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());
        BufferedImage dest = img.getSubimage(p.getX()+250, p.getY()+100, rect.width+8, rect.height+6);
        ImageIO.write(dest, "png", srcFile);
        FileUtils.copyFile(srcFile, new File("D:\\pic\\" + picname + ".png"));
	}
	
	//模拟tab按键
	public void tab() {
		
		Actions actions = new Actions(webDriver);
		actions.sendKeys(Keys.TAB);
		actions.perform();
	}
	
	//模拟enter按键
	public void enter() {
		
		Actions actions = new Actions(webDriver);
		actions.sendKeys(Keys.ENTER);
		actions.perform();
	}
	
	public void reget(String url){
		webDriver.get(url);
	}
	
	//模拟鼠标滑轮移动
	/*public void setScroll(WebDriver webDriver, int height) {
		
		try {
			String setScroll = "document.documentElement.scrollTop=" + height;
			JavascriptExecutor jse = (JavascriptExecutor)webDriver;
			jse.executeScript(setScroll);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Fail to set the scroll.");
		}
	}*/
}




