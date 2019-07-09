package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web020_B2C_Chihy extends TestBase {

	@Test
	public void contact() {
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			text = locator.getText("购物车页_B2C", "和我联系");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web020_B2C:和我联系显示失败");
		}
		
		checkPoint.equals(text, "和我联系", "【fail】Web020_B2C:和我联系显示失败");
		checkPoint.result("【pass】Web020_B2C:和我联系显示成功");
	}
}
