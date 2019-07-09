/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web230_B2C_Liuteng extends TestBase{

	@Test
	public void man(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "男");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web230_B2C:我的商城页男展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web230_B2C:我的商城页男展示异常");
		checkPoint.result("【pass】Web230_B2C:我的商城页男展示正常");
	}
}










