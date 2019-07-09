/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web280_B2C_Liuteng extends TestBase{

	@Test
	public void myRefundOrder(){

		String test = null;
		try {
			test = locator.getText("我的退款单_B2C", "我的退款单");
			locator.clickByXml("我的退款单_B2C", "我的退款单");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web280_B2C:我的退款单页我的退款单展示异常");
		}
		checkPoint.equals(test, "我的退款单", "【fail】Web280_B2C:我的退款单页我的退款单展示异常");
		checkPoint.result("【pass】Web280_B2C:我的退款单页我的退款单展示正常");
	}
}










