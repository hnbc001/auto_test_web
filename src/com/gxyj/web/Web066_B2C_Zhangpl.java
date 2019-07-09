/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-新手上路友情链接跳转正常
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web066_B2C_Zhangpl extends TestBase{

	@Test
	public void friendLink(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");	
			//locator.dragAndDropBy(webDriver.findElement(By.linkText("友情链接")), 230, 700);
			locator.clickByXml("友情链接_B2C", "友情链接");
			//locator.wait(2);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web066_B2C:新手上路友情链接跳转异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/basemallInfo/goFriendLinksPage.jhtml?mallId=00000000","【fail】Web066_B2C:新手上路友情链接跳转异常");
		checkPoint.result("【pass】Web066_B2C:新手上路友情链接跳转正常");
	}
}










