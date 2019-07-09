package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web021_B2C_Chihy extends TestBase {

	@Test
	public void delete() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			flag = locator.elementIsExit("购物车页_B2C", "删除");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web021_B2C:删除按钮显示失败");
		}
		checkPoint.equals(flag, true, "【fail】Web021_B2C:删除按钮显示失败");
		checkPoint.result("【pass】Web021_B2C:删除按钮显示成功");
	}
}
