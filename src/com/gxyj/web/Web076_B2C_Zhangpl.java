/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-平台简介
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web076_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			//locator.clickByXml("帮助页面_B2C", "地方平台");
			if(locator.getAttri("帮助页面_B2C", "地方平台", "class").equals("")){
				locator.clickByXml("帮助页面_B2C", "地方平台");
			}
			locator.clickByXml("帮助页面_B2C", "平台简介");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web076_B2C:帮助页面平台简介展示异常");
		}
		
		checkPoint.equals(text,"供销e家地方平台简介","【fail】Web076_B2C:帮助页面平台简介展示异常");
		checkPoint.result("【pass】Web076_B2C:帮助页面平台简介展示正常");
	}
}










