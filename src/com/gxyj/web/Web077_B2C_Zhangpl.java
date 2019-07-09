/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-商户入口
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web077_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "商户登录");
			locator.clickByXml("帮助页面_B2C", "商户入口");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web077_B2C:帮助页面商户入口展示异常");
		}
		
		checkPoint.equals(text,"商户登录入口","【fail】Web077_B2C:帮助页面商户入口展示异常");
		checkPoint.result("【pass】Web077_B2C:帮助页面商户入口展示正常");
	}
}










