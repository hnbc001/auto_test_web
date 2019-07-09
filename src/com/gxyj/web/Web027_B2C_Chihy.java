package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web027_B2C_Chihy extends TestBase {

	@Test
	public void newAddress() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			text = locator.getText("结算页_B2C", "新增收货地址");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web027_B2C:新增收货地址展示失败");
		}
		checkPoint.equals(text, "+新增收货地址", "【fail】Web027_B2C:新增收货地址展示失败");
		checkPoint.result("【pass】Web027_B2C:新增收货地址展示成功");
	}
}
