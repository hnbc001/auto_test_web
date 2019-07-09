/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-服务
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web128_B2C_Zhangpl extends TestBase{

	@Test
	public void sumServe(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "服务").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web128_B2C:商品详情页服务展示异常");
		}
		
		checkPoint.equals(text,"服务\n由 供销e家测试店铺 发货并提供售后服务","【fail】Web128_B2C:商品详情页服务展示异常");
		checkPoint.result("【pass】Web128_B2C:商品详情页服务展示正常");
	}
}










