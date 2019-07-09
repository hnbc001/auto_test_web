/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web238_B2C_Liuteng extends TestBase{

	@Test
	public void save(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "保存");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web238_B2C:我的商城页保存展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web238_B2C:我的商城页保存展示异常");
		checkPoint.result("【pass】Web238_B2C:我的商城页保存展示正常");
	}
}










