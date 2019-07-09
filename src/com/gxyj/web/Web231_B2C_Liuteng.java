/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web231_B2C_Liuteng extends TestBase{

	@Test
	public void woman(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "女");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web231_B2C:我的商城页女展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web231_B2C:我的商城页女展示异常");
		checkPoint.result("【pass】Web231_B2C:我的商城页女展示正常");
	}
}










