/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-判定平台
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web075_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "地方平台");
			locator.clickByXml("帮助页面_B2C", "判定平台");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web075_B2C:帮助页面判定平台展示异常");
		}
		
		checkPoint.equals(text,"怎么判定所处平台","【fail】Web075_B2C:帮助页面判定平台展示异常");
		checkPoint.result("【pass】Web075_B2C:帮助页面判定平台展示正常");
	}
}










