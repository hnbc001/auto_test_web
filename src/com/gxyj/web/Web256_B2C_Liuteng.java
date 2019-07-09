/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web256_B2C_Liuteng extends TestBase{

	@Test
	public void newOldHome(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "新增老家");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web256_B2C:我的商城页新增老家展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web256_B2C:我的商城页新增老家展示异常");
		checkPoint.result("【pass】Web256_B2C:我的商城页新增老家展示正常");
	}
}










