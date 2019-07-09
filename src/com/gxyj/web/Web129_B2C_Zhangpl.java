/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-承诺
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web129_B2C_Zhangpl extends TestBase{

	@Test
	public void sumPromise(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "承诺").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web129_B2C:商详页承诺展示异常");
		}
		
		checkPoint.equals(text,"承诺\n按时发货 急速退款 退款保障卡","【fail】Web129_B2C:商详页承诺展示异常");
		checkPoint.result("【pass】Web129_B2C:商详页承诺展示正常");
	}
}










