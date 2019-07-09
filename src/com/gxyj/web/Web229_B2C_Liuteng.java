/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web229_B2C_Liuteng extends TestBase{

	@Test
	public void headPortrait(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "头像");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web229_B2C:我的商城页头像展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web229_B2C:我的商城页头像展示异常");
		checkPoint.result("【pass】Web229_B2C:我的商城页头像展示正常");
	}
}










