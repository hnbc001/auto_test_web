/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web248_B2C_Liuteng extends TestBase{

	@Test
	public void identityCardNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "身份证号码");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web248_B2C:我的商城页身份证号码展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web248_B2C:我的商城页身份证号码展示异常");
		checkPoint.result("【pass】Web248_B2C:我的商城页身份证号码展示正常");
	}
}










