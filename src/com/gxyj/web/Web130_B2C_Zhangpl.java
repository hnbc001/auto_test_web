/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-进店逛逛
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web130_B2C_Zhangpl extends TestBase{

	@Test
	public void inShop(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "进店逛逛");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web130_B2C:商详页进店逛逛展示异常");
		}
		
		checkPoint.equals(text,"进店逛逛","【fail】Web130_B2C:商详页进店逛逛展示异常");
		checkPoint.result("【pass】Web130_B2C:商详页进店逛逛展示正常");
	}
}










