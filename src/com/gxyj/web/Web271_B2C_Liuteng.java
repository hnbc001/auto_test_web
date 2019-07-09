/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web271_B2C_Liuteng extends TestBase{

	@Test
	public void productName(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "商品名称");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web271_B2C:我的商城页商品名称展示异常");
		}
		checkPoint.equals(test, "测试商品大米0.02", "【fail】Web271_B2C:我的商城页商品名称展示异常");
		checkPoint.result("【pass】Web271_B2C:我的商城页商品名称展示正常");
	}
}










