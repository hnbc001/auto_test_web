/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-交易条款
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web102_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "新手入门");
			locator.clickByXml("帮助页面_B2C", "交易条款");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web102_B2C:帮助页面交易条款展示异常");
		}
		
		checkPoint.equals(text,"供销e家交易条款","【fail】Web102_B2C:帮助页面交易条款展示异常");
		checkPoint.result("【pass】Web102_B2C:帮助页面交易条款展示正常");
	}
}










