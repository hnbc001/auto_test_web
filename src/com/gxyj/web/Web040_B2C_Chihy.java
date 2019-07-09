package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web040_B2C_Chihy extends TestBase {

	@Test
	public void consignee() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			flag = locator.elementIsExit("结算页_B2C", "收货人");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Reporter.log("【fail】Web040_B2C:收货人展示失败1");
		}
		checkPoint.equals(flag, true, "【fail】Web040_B2C:收货人展示失败");
		checkPoint.result("【pass】Web040_B2C:收货人展示成功");
	}
}
