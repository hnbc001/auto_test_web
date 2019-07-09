/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-禁售商品
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web089_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "商户入驻");
			locator.clickByXml("帮助页面_B2C", "禁售商品");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web089_B2C:帮助页面禁售商品展示异常");
		}
		
		checkPoint.equals(text,"禁售商品规则","【fail】Web089_B2C:帮助页面禁售商品展示异常");
		checkPoint.result("【pass】Web089_B2C:帮助页面禁售商品展示正常");
	}
}










