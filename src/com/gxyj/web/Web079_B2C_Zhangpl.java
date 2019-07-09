/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-联系客服
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web079_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "客服服务");
			locator.clickByXml("帮助页面_B2C", "联系客服");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web079_B2C:帮助页面联系客服展示异常");
		}
		
		checkPoint.equals(text,"联系客服","【fail】Web079_B2C:帮助页面联系客服展示异常");
		checkPoint.result("【pass】Web079_B2C:帮助页面联系客服展示正常");
	}
}










