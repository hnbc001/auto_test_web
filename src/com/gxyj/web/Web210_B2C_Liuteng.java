/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web210_B2C_Liuteng extends TestBase{

	@Test
	public void viewAllOrders(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "查看全部订单");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web210_B2C:我的商城页查看全部订单展示异常");
		}
		checkPoint.equals(test, "查看全部订单", "【fail】Web210_B2C:我的商城页查看全部订单展示异常");
		checkPoint.result("【pass】Web210_B2C:我的商城页查看全部订单展示正常");
	}
}










