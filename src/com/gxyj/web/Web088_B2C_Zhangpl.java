/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-关于我们
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web088_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			//locator.clickByXml("帮助页面_B2C", "公司简介");
			if(locator.getAttri("帮助页面_B2C", "公司简介", "class").equals("")){
				locator.clickByXml("帮助页面_B2C", "公司简介");
			}
			locator.clickByXml("帮助页面_B2C", "关于我们");		
			text=webDriver.findElement(By.id("id_help_tit_bar")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web088_B2C:帮助页面关于我们展示异常");
		}
		
		checkPoint.equals(text,"中国供销电子商务有限公司 公司简介","【fail】Web088_B2C:帮助页面关于我们展示异常");
		checkPoint.result("【pass】Web088_B2C:帮助页面关于我们展示正常");
	}
}










