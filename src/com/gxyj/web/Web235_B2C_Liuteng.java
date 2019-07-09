/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web235_B2C_Liuteng extends TestBase{

	@Test
	public void province(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "居住地省");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web235_B2C:我的商城页居住地省展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web235_B2C:我的商城页居住地省展示异常");
		checkPoint.result("【pass】Web235_B2C:我的商城页居住地省展示正常");
	}
}










