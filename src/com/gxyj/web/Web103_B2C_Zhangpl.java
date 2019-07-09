/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-隐私协议
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web103_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			//locator.clickByXml("帮助页面_B2C", "新手入门");
			if(locator.getAttri("帮助页面_B2C", "新手入门", "class").equals("")){
				locator.clickByXml("帮助页面_B2C", "新手入门");
			}
			locator.clickByXml("帮助页面_B2C", "隐私协议");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web103_B2C:帮助页面隐私协议展示异常");
		}
		
		checkPoint.equals(text,"供销e家用户隐私协议","【fail】Web103_B2C:帮助页面隐私协议展示异常");
		checkPoint.result("【pass】Web103_B2C:帮助页面隐私协议展示正常");
	}
}










