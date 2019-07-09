/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web255_B2C_Liuteng extends TestBase{

	@Test
	public void newCompany(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "新增公司");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web255_B2C:我的商城页新增公司展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web255_B2C:我的商城页新增公司展示异常");
		checkPoint.result("【pass】Web255_B2C:我的商城页新增公司展示正常");
	}
}










