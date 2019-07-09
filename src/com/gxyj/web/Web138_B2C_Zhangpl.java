/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-商品分类
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web138_B2C_Zhangpl extends TestBase{

	@Test
	public void goodsCategorise(){
		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "商品分类");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web138_B2C:商详页商品分类展示异常");
		}
		
		checkPoint.equals(text,"商品分类","【fail】Web138_B2C:商详页商品分类展示异常");
		checkPoint.result("【pass】Web138_B2C:商详页商品分类展示正常");
	}
}










