/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-收费标准
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web078_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		//String text=null;
		boolean flag = false;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "广告服务");
			//locator.clickByXml("帮助页面_B2C", "收费标准");		
			//text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			flag = locator.elementIsExit("帮助页面_B2C", "收费标准");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web078_B2C:帮助页面收费标准展示异常");
		}
		
		//checkPoint.equals(text,"收费标准","【fail】Web078_B2C:帮助页面收费标准展示异常");
		checkPoint.equals(flag, true,"【fail】Web078_B2C:帮助页面收费标准展示异常");
		checkPoint.result("【pass】Web078_B2C:帮助页面收费标准展示正常");
	}
}










