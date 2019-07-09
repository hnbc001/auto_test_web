package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web015_B2C_Chihy extends TestBase {

	@Test
	public void goodsPrice() {
		
		boolean flag = false;
		try {
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "规格");
			flag = locator.elementIsExit("详情页_B2C", "商品价格");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web015_B2C:商品价格显示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web015_B2C:商品价格显示失败");
		checkPoint.result("【pass】Web015_B2C:商品价格显示成功");
	}
}
