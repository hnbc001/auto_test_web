/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-数量增加后运费
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web149_B2C_Zhangpl extends TestBase{

	@Test
	public void numAddFare(){

		String text=null;
		String text2 = null;
		boolean flag = false;
		try {	
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "运费价格");
			locator.clickByXml("详情页_B2C", "数量加");
			locator.wait(2);
			text2 = locator.getText("详情页_B2C", "运费价格");
			if(!text.equals(text2))
				flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web149_B2C:商详页数量增加后运费展示异常");
		}
		
		//checkPoint.equals(text,"快递：¥2.00","【fail】Web149_B2C:商详页数量增加后运费展示异常");
		checkPoint.equals(flag,true,"【fail】Web149_B2C:商详页数量增加后运费展示异常");
		checkPoint.result("【pass】Web149_B2C:商详页数量增加后运费展示正常");
	}
}










