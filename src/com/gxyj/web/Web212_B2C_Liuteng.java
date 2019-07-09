/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web212_B2C_Liuteng extends TestBase{

	@Test
	public void discountCoupon(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "优惠券");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web212_B2C:我的商城页优惠券展示异常");
		}
		checkPoint.equals(test, "优惠券", "【fail】Web212_B2C:我的商城页优惠券展示异常");
		checkPoint.result("【pass】Web212_B2C:我的商城页优惠券展示正常");
	}
}










