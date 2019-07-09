/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web257_B2C_Liuteng extends TestBase{

	@Test
	public void newSchool(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "新增学校");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web257_B2C:我的商城页新增学校展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web257_B2C:我的商城页新增学校展示异常");
		checkPoint.result("【pass】Web257_B2C:我的商城页新增学校展示正常");
	}
}










