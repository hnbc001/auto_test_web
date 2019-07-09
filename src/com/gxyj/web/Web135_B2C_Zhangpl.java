/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-商铺评分
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web135_B2C_Zhangpl extends TestBase{

	@Test
	public void shopMark(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "商铺评分");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web135_B2C:商详页商铺评分展示异常");
		}
		
		checkPoint.equals(text,"描述 服务 物流","【fail】Web135_B2C:商详页商铺评分展示异常");
		checkPoint.result("【pass】Web135_B2C:商详页商铺评分展示正常");
	}
}










