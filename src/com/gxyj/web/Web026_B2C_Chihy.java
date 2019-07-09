package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web026_B2C_Chihy extends TestBase {

	@Test
	public void editor() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			text = locator.getText("结算页_B2C", "编辑");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web026_B2C:编辑展示失败");
		}
		
		checkPoint.equals(text, "编辑", "【fail】Web026_B2C:编辑展示失败");
		checkPoint.result("【pass】Web026_B2C:编辑展示成功");
	}
}
