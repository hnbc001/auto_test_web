/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页 - 自提提示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web127_B2C_Zhangpl extends TestBase{

	@Test
	public void deliverGoods(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "自提提示");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web127_B2C:商详页自提提示显示异常");
		}
		
		checkPoint.equals(text,"本店支持自提","【fail】Web127_B2C:商详页自提提示显示异常");
		checkPoint.result("【pass】Web127_B2C:商详页自提提示显示正常");
	}
}










