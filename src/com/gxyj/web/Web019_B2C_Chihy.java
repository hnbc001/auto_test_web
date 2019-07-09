package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web019_B2C_Chihy extends TestBase {

	@Test
	public void shopName() {
		String text = null;
		try {
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.wait(3);
			locator.clickByXml("详情页_B2C", "规格");
			locator.wait(2);
			locator.clickByXml("详情页_B2C", "加入购物车");
			locator.wait(1);
			locator.clickByXml("首页_B2C", "购物车");
			text = locator.getText("购物车页_B2C", "商铺名称");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web019_B2C:商铺名称显示失败1");
		}
		
		checkPoint.equals(text, "供销e家测试店铺", "【fail】Web019_B2C:商铺名称显示失败2");
		checkPoint.result("【pass】Web019_B2C:商铺名称显示成功");
	}
}
