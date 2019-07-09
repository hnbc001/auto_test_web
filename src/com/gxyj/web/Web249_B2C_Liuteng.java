/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web249_B2C_Liuteng extends TestBase{

	@Test
	public void setDefault(){
		
		boolean flag = false;
		try {
			locator.clickAndHold("我的商城页_B2C", "状态");
			flag = locator.elementIsExit("我的商城页_B2C", "设为默认");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web249_B2C:我的商城页设为默认展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web249_B2C:我的商城页设为默认展示异常");
		checkPoint.result("【pass】Web249_B2C:我的商城页设为默认展示正常");
	}
}










