/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-数量小于1提示信息
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web147_B2C_Zhangpl extends TestBase{

	@Test
	public void numTips(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.sendKeys("详情页_B2C", "数量", "0");
			locator.clickByXml("详情页_B2C", "数量减");
			text = locator.getText("详情页_B2C", "数量提示");
			locator.clickByXml("详情页_B2C", "关闭");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web147_B2C:商详页数量小于1提示异常");
		}
		
		checkPoint.equals(text,"数量不能小于1","【fail】Web147_B2C:商详页数量小于1提示异常");
		checkPoint.result("【pass】Web147_B2C:商详页数量小于1提示正常");
	}
}










