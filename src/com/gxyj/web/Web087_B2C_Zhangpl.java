/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-经营证照
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web087_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			locator.clickByXml("帮助页面_B2C", "公司简介");
			locator.clickByXml("帮助页面_B2C", "经营证照");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web087_B2C:帮助页面经营证照展示异常");
		}
		
		checkPoint.equals(text,"经营证照","【fail】Web087_B2C:帮助页面经营证照展示异常");
		checkPoint.result("【pass】Web087_B2C:帮助页面经营证照展示正常");
	}
}










