/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-店铺公告
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web136_B2C_Zhangpl extends TestBase{

	@Test
	public void shopNotice(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "店铺公告");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web136_B2C:商详页店铺公告展示异常");
		}
		
		checkPoint.equals(text,"店铺公告","【fail】Web136_B2C:商详页店铺公告展示异常");
		checkPoint.result("【pass】Web136_B2C:商详页店铺公告展示正常");
	}
}










