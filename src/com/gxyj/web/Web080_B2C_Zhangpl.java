/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-购物流程
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web080_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "购物指南");
			locator.clickByXml("帮助页面_B2C", "购物流程");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web080_B2C:帮助页面购物流程展示异常");
		}
		
		checkPoint.equals(text,"购物流程","【fail】Web080_B2C:帮助页面购物流程展示异常");
		checkPoint.result("【pass】Web080_B2C:帮助页面购物流程展示正常");
	}
}










