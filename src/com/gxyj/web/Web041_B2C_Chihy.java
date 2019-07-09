package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web041_B2C_Chihy extends TestBase {

	@Test
	public void order() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			text = locator.getText("结算页_B2C", "提交订单");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web041_B2C:提交订单展示失败");
		}
		checkPoint.equals(text, "提交订单", "【fail】Web041_B2C:提交订单展示失败");
		checkPoint.result("【pass】Web041_B2C:提交订单展示成功");
	}
}
