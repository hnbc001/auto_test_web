/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-热销排行
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web141_B2C_Zhangpl extends TestBase{

	@Test
	public void hotSell(){

		String text=null;
		try {	
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "热销排行");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web141_B2C:商详页热销排行展示异常");
		}
		
		checkPoint.equals(text,"热销排行","【fail】Web141_B2C:商详页热销排行展示异常");
		checkPoint.result("【pass】Web141_B2C:商详页热销排行展示正常");
	}
}










