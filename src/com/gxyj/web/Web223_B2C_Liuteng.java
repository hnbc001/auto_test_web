/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web223_B2C_Liuteng extends TestBase{

	@Test
	public void liangbaiyuan(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "充值金额200元");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web223_B2C:我的商城页充值金额200元展示异常");
		}
		checkPoint.equals(test, "200", "【fail】Web223_B2C:我的商城页充值金额200元展示异常");
		checkPoint.result("【pass】Web223_B2C:我的商城页充值金额200元展示正常");
	}
}










