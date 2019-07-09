/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web237_B2C_Liuteng extends TestBase{

	@Test
	public void registrationDate(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "注册时间");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web237_B2C:我的商城页注册时间展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web237_B2C:我的商城页注册时间展示异常");
		checkPoint.result("【pass】Web237_B2C:我的商城页注册时间展示正常");
	}
}










