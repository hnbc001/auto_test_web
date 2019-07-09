package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web031_B2C_Chihy extends TestBase {

	@Test
	public void total() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			flag = locator.elementIsExit("结算页_B2C", "小计");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web031_B2C:小计展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web031_B2C:小计展示失败");
		checkPoint.result("【pass】Web031_B2C:小计展示成功");
	}
}
