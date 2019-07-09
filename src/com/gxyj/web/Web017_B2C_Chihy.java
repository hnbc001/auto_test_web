package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web017_B2C_Chihy extends TestBase {

	@Test
	public void buyNow() {
		
		String text = null;
		try {
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "立即购买");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web017_B2C:立即购买显示失败");
		}
		
		checkPoint.equals(text, "立即购买", "【fail】Web017_B2C:立即购买显示失败");
		checkPoint.result("【pass】Web017_B2C:立即购买显示成功");
	}
}
