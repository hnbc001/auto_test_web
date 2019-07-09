package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web039_B2C_Chihy extends TestBase {

	@Test
	public  void send() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			flag = locator.elementIsExit("结算页_B2C", "寄送至");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web039_B2C:寄送至展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web039_B2C:寄送至展示失败");
		checkPoint.result("【pass】Web039_B2C:寄送至展示成功");
	}
}
