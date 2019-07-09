package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web022_B2C_Chihy extends TestBase {

	@Test
	public void balance() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			flag = locator.elementIsExit("购物车页_B2C", "去结算");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web022_B2C:去结算按钮显示失败");
		}
		checkPoint.equals(flag, true, "【fail】Web022_B2C:去结算按钮显示失败");
		checkPoint.result("【pass】Web022_B2C:去结算按钮显示失成功");
	}
}
