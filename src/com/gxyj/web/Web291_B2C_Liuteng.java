/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web291_B2C_Liuteng extends TestBase{

	@Test
	public void tableOrderNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "表格订单编号");
			System.out.println(locator.getText("我的退款单_B2C", "表格订单编号"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web291_B2C:我的退款单页表格订单编号展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web291_B2C:我的退款单页表格订单编号展示异常");
		checkPoint.result("【pass】Web291_B2C:我的退款单页表格订单编号展示正常");
	}
}










