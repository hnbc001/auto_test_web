package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web029_B2C_Chihy extends TestBase {

	@Test
	public void price() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			text = locator.getText("结算页_B2C", "单价").trim();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Reporter.log("【fail】Web029_B2C:单价展示失败");
		}
		
		checkPoint.equals(text, "￥0.03", "【fail】Web029_B2C:单价展示失败");
		checkPoint.result("【pass】Web029_B2C:单价展示成功");
	}
}
