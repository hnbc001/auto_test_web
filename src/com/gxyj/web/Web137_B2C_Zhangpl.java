/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-店铺提示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web137_B2C_Zhangpl extends TestBase{

	@Test
	public void shopTips(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "店铺提示");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web137_B2C:商详页店铺提示展示异常");
		}
		
		checkPoint.equals(text,"供销e家测试店铺，请勿购买 查看详情>>","【fail】Web137_B2C:商详页店铺提示展示异常");
		checkPoint.result("【pass】Web137_B2C:商详页店铺提示展示正常");
	}
}










