/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web284_B2C_Liuteng extends TestBase{

	@Test
	public void refundOrderState(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "退款单状态");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web284_B2C:我的退款单页退款单状态展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web284_B2C:我的退款单页退款单状态展示异常");
		checkPoint.result("【pass】Web284_B2C:我的退款单页退款单状态展示正常");
	}
}










