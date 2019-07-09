/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-新手上路关于我们跳转正常
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web065_B2C_Zhangpl extends TestBase{

	@Test
	public void aboutUs(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");
			//locator.dragAndDropBy(webDriver.findElement(By.linkText("关于我们")), 230, 700);
			locator.clickByXml("友情链接_B2C", "关于我们");
			//locator.wait(2);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web065_B2C:新手上路关于我们跳转异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/help/getHelpInfo.jhtml?fid=0000010074&parentId=0000010071&mallId=00000000","【fail】Web065_B2C:新手上路关于我们跳转异常");
		checkPoint.result("【pass】Web065_B2C:新手上路关于我们跳转正常");
	}
}










