package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web030_B2C_Chihy extends TestBase {

	@Test
	public void count() {
		
		boolean flag = false;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			flag = locator.elementIsExit("结算页_B2C", "数量");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web030_B2C:数量展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web030_B2C:数量展示失败");
		checkPoint.result("【pass】Web030_B2C:数量展示成功");
	}
}
