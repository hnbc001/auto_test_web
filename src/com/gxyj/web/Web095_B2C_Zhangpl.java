/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-支付方式
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web095_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "支付及配送");
			locator.clickByXml("帮助页面_B2C", "支付方式");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web095_B2C:帮助页面支付方式展示异常");
		}
		
		checkPoint.equals(text,"支持哪些支付方式？","【fail】Web095_B2C:帮助页面支付方式展示异常");
		checkPoint.result("【pass】Web095_B2C:帮助页面支付方式展示正常");
	}
}










