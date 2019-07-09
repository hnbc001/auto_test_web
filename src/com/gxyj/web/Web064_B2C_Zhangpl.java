/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-新手上路跳转初次到访
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web064_B2C_Zhangpl extends TestBase{

	@Test
	public void firstVisit(){

		String text=null;
		try {	
			
			locator.get("http://www.gxyj.com/index.html");
			//locator.dragAndDropBy(webDriver.findElement(By.linkText("初次到访")), 230, 688);
			locator.clickByXml("友情链接_B2C", "初次到访");
			//locator.wait(2);
			
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web064_B2C:新手上路初次到访跳转异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/help/getHelpInfo.jhtml?fid=0000010158&parentId=0000010022&mallId=00000000","【fail】Web064_B2C:新手上路初次到访跳转异常");
		checkPoint.result("【pass】Web064_B2C:新手上路初次到访跳转正常");
	}
}










