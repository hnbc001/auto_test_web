/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web276_B2C_Liuteng extends TestBase{

	@Test
	public void viewDetails(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "查看详情");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web276_B2C:我的商城页查看详情展示异常");
		}
		checkPoint.equals(test, "查看详情", "【fail】Web276_B2C:我的商城页查看详情展示异常");
		checkPoint.result("【pass】Web276_B2C:我的商城页查看详情展示正常");
	}
}










