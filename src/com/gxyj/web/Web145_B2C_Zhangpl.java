/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-商品细节
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web145_B2C_Zhangpl extends TestBase{

	@Test
	public void searchPrice(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "商品细节");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web145_B2C:商详页商品细节展示异常");
		}
		
		checkPoint.equals(text,"测试","【fail】Web145_B2C:商详页商品细节展示异常");
		checkPoint.result("【pass】Web145_B2C:商详页商品细节展示正常");
	}
}










