/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-修改密码
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web083_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			//locator.clickByXml("帮助页面_B2C", "购物指南");
			if(locator.getAttri("帮助页面_B2C", "购物指南", "class").equals("")){
				locator.clickByXml("帮助页面_B2C", "购物指南");
			}
			locator.clickByXml("帮助页面_B2C", "修改密码");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web083_B2C:帮助页面修改密码展示异常");
		}
		
		checkPoint.equals(text,"如何修改密码","【fail】Web083_B2C:帮助页面修改密码展示异常");
		checkPoint.result("【pass】Web083_B2C:帮助页面修改密码展示正常");
	}
}










