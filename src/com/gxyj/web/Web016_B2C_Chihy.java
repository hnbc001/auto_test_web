package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web016_B2C_Chihy extends TestBase {

	@Test
	public void addShoppingCart() {
		
		String text = null;
		try {
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "加入购物车");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web016_B2C:购物车显示失败");
		}
		checkPoint.equals(text, "加入购物车", "【fail】Web016_B2C:购物车显示失败");
		checkPoint.result("【pass】Web016_B2C:购物车显示成功");
	}
}
