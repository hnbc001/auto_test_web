package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web024_B2C_Chihy extends TestBase {

	@Test
	public void address() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			text = locator.getText("结算页_B2C", "收货地址");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web024_B2C:收货地址展示失败");
		}
		
		checkPoint.equals(text, "北京北京市供销E家测试地址", "【fail】Web024_B2C:收货地址展示失败");
		checkPoint.result("【pass】Web024_B2C:收货地址展示成功");
	}
}
