package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web025_B2C_Chihy extends TestBase {

	@Test
	public void defaultAddress() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			text = locator.getText("结算页_B2C", "默认地址");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web025_B2C:默认地址展示失败");
		}
		
		checkPoint.equals(text, "默认地址", "【fail】Web025_B2C:默认地址展示失败");
		checkPoint.result("【pass】Web025_B2C:默认地址展示成功");
	}
}
