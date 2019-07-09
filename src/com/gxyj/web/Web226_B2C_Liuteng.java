/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web226_B2C_Liuteng extends TestBase{

	@Test
	public void nextStep(){

		String test = null;
		try {
			test = locator.getAttri("我的商城页_B2C", "下一步", "value");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web226_B2C:我的商城页下一步展示异常");
		}
		checkPoint.equals(test, "下一步", "【fail】Web226_B2C:我的商城页下一步展示异常");
		checkPoint.result("【pass】Web226_B2C:我的商城页下一步展示正常");
	}
}










