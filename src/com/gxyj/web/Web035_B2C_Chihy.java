package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web035_B2C_Chihy extends TestBase {

	@Test
	public void totalPrice() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			flag = locator.elementIsExit("结算页_B2C", "总价");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web035_B2C:总价展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web035_B2C:总价展示失败");
		checkPoint.result("【pass】Web035_B2C:总价展示成功");
	}
}
