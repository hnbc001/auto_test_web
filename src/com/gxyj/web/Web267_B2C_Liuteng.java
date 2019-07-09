/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web267_B2C_Liuteng extends TestBase{

	@Test
	public void newClosed(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "新增关闭");
			locator.clickByXml("我的商城页_B2C", "新增关闭");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web267_B2C:我的商城页新增关闭展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web267_B2C:我的商城页新增关闭展示异常");
		checkPoint.result("【pass】Web267_B2C:我的商城页新增关闭展示正常");
	}
}










