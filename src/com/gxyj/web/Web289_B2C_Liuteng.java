/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web289_B2C_Liuteng extends TestBase{

	@Test
	public void query(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "查询");
			System.out.println(locator.getAttri("我的退款单_B2C", "查询", "value"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web289_B2C:我的退款单页查询展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web289_B2C:我的退款单页查询展示异常");
		checkPoint.result("【pass】Web289_B2C:我的退款单页查询展示正常");
	}
}










