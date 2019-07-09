/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-商品详情
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web143_B2C_Zhangpl extends TestBase{

	@Test
	public void goodsIntro(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "商品详情标题");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web143_B2C:商详页商品详情展示异常");
		}
		
		checkPoint.equals(text,"商品详情","【fail】Web143_B2C:商详页商品详情展示异常");
		checkPoint.result("【pass】Web143_B2C:商详页商品详情展示正常");
	}
}










