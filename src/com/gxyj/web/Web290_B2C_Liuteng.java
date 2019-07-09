/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web290_B2C_Liuteng extends TestBase{

	@Test
	public void tableRefundNumber(){

		boolean flag = false;
		try {
			locator.clearKeys("我的退款单_B2C", "退款单申请时间开始");
			locator.clickByXml("我的退款单_B2C", "退款单编号");
			locator.clickByXml("我的退款单_B2C", "查询");
			flag = locator.elementIsExit("我的退款单_B2C", "表格退款单编号");
			System.out.println(locator.getText("我的退款单_B2C", "表格退款单编号"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web290_B2C:我的退款单页表格退款单编号展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web290_B2C:我的退款单页表格退款单编号展示异常");
		checkPoint.result("【pass】Web290_B2C:我的退款单页表格退款单编号展示正常");
	}
}










