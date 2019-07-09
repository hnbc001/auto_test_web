/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web216_B2C_Liuteng extends TestBase{

	@Test
	public void gasFee(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "煤气费");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web216_B2C:我的商城页煤气费展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web216_B2C:我的商城页煤气费展示异常");
		checkPoint.result("【pass】Web216_B2C:我的商城页煤气费展示正常");
	}
}










