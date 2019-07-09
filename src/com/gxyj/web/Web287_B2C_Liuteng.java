/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web287_B2C_Liuteng extends TestBase{

	@Test
	public void refundOrderNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "退款单编号");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web287_B2C:我的退款单页退款单编号展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web287_B2C:我的退款单页退款单编号展示异常");
		checkPoint.result("【pass】Web287_B2C:我的退款单页退款单编号展示正常");
	}
}










