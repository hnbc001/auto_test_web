/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web258_B2C_Liuteng extends TestBase{

	@Test
	public void newIdNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "新增身份证号");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web258_B2C:我的商城页新增身份证号展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web258_B2C:我的商城页新增身份证号展示异常");
		checkPoint.result("【pass】Web258_B2C:我的商城页新增身份证号展示正常");
	}
}










