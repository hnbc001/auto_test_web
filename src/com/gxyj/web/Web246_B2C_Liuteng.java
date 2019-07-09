/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web246_B2C_Liuteng extends TestBase{

	@Test
	public void postcode(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "邮编");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web246_B2C:我的商城页邮编展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web246_B2C:我的商城页邮编展示异常");
		checkPoint.result("【pass】Web246_B2C:我的商城页邮编展示正常");
	}
}










