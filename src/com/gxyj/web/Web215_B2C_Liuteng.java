/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web215_B2C_Liuteng extends TestBase{

	@Test
	public void payElectricityBills(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "缴电费");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web215_B2C:我的商城页缴电费展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web215_B2C:我的商城页缴电费展示异常");
		checkPoint.result("【pass】Web215_B2C:我的商城页缴电费展示正常");
	}
}










