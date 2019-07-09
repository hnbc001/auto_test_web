package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web028_B2C_Chihy extends TestBase {

	@Test
	public void shopName() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			text = locator.getText("结算页_B2C", "商铺名称").trim();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web028_B2C:商铺名称展示失败");
		}
		checkPoint.equals(text, "供销e家测试店铺", "【fail】Web028_B2C:商铺名称展示失败");
		checkPoint.result("【pass】Web028_B2C:商铺名称展示成功");
	}
}
