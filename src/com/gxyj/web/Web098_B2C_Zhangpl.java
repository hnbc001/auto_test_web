/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-物流信息
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web098_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			//locator.clickByXml("帮助页面_B2C", "支付及配送");
			if(locator.getAttri("帮助页面_B2C", "支付及配送", "class").equals("")){
				locator.clickByXml("帮助页面_B2C", "支付及配送");
			}
			locator.clickByXml("帮助页面_B2C", "物流信息");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web098_B2C:帮助页面物流信息展示异常");
		}
		
		checkPoint.equals(text,"怎么查物流信息？","【fail】Web098_B2C:帮助页面物流信息展示异常");
		checkPoint.result("【pass】Web098_B2C:帮助页面物流信息展示正常");
	}
}










