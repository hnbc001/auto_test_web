package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web037_B2C_Chihy extends TestBase {

	@Test
	public void totalFreight() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			flag = locator.elementIsExit("结算页_B2C", "总运费");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web037_B2C:商品总运费展示失败");
		}
		checkPoint.equals(flag, true, "【fail】Web037_B2C:商品总运费展示失败");
		checkPoint.result("【pass】Web037_B2C:商品总运费展示成功");
	}
}
