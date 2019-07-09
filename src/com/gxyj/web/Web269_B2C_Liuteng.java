/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web269_B2C_Liuteng extends TestBase{

	@Test
	public void select(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "选择");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web269_B2C:我的商城页选择展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web269_B2C:我的商城页选择展示异常");
		checkPoint.result("【pass】Web269_B2C:我的商城页选择展示正常");
	}
}










