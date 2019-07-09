package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web014_B2C_Chihy extends TestBase {

	@Test
	public void goodsName() {
		
		String text = null;
		try {
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "商品名称").trim();
			locator.closeOtherWindow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web014_B2C:商品名称显示失败");
		}
		
		checkPoint.equals(text, "测试商品大米0.02", "【fail】Web014_B2C:商品名称显示失败");
		checkPoint.result("【pass】Web014_B2C:商品名称显示成功");
	}
}
