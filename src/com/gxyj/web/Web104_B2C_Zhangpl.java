/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-初次到访
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web104_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			//locator.clickByXml("帮助页面_B2C", "新手入门");
			if(locator.getAttri("帮助页面_B2C", "新手入门", "class").equals("")){
				locator.clickByXml("帮助页面_B2C", "新手入门");
			}
			locator.clickByXml("帮助页面_B2C", "初次到访");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			locator.closeOtherWindow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web104_B2C:帮助页面初次到访展示异常");
		}
		
		checkPoint.equals(text,"初次到访","【fail】Web104_B2C:帮助页面初次到访展示异常");
		checkPoint.result("【pass】Web104_B2C:帮助页面初次到访展示正常");
	}
}










