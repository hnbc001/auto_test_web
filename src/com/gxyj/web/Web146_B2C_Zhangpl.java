/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-商品评价
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web146_B2C_Zhangpl extends TestBase{

	@Test
	public void proEvalute(){

		boolean text=false;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "商品评价");
			text = locator.elementIsExit("详情页_B2C", "评价详情");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web146_B2C:商详页商品评价展示异常");
		}
		
		checkPoint.equals(text,true,"【fail】Web146_B2C:商详页商品评价展示异常");
		checkPoint.result("【pass】Web146_B2C:商详页商品评价展示正常");
	}
}










