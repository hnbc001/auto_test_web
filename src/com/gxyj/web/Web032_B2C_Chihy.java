package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web032_B2C_Chihy extends TestBase {

	@Test
	public void remarks() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			flag = locator.elementIsExit("结算页_B2C", "备注信息");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web032_B2C:备注信息展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web032_B2C:备注信息展示失败");
		checkPoint.result("【pass】Web032_B2C:备注信息展示成功");
	}
}
