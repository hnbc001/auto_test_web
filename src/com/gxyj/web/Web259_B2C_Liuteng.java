/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web259_B2C_Liuteng extends TestBase{

	@Test
	public void newProvince(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "新增地区省");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web259_B2C:我的商城页新增地区省展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web259_B2C:我的商城页新增地区省展示异常");
		checkPoint.result("【pass】Web259_B2C:我的商城页新增地区省展示正常");
	}
}










