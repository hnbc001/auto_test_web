/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web252_B2C_Liuteng extends TestBase{

	@Test
	public void newConsignee(){

		boolean flag = false;
		try {
			locator.clickByXml("我的商城页_B2C", "新建收货地址");
			flag = locator.elementIsExit("我的商城页_B2C", "新增收货人");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web252_B2C:我的商城页新增收货人展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web252_B2C:我的商城页新增收货人展示异常");
		checkPoint.result("【pass】Web252_B2C:我的商城页新增收货人展示正常");
	}
}










