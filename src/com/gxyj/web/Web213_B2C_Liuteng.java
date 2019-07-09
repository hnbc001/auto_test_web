/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web213_B2C_Liuteng extends TestBase{

	@Test
	public void shoppingCard(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "购物卡");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web213_B2C:我的商城页购物卡展示异常");
		}
		checkPoint.equals(test, "供销e购卡：", "【fail】Web213_B2C:我的商城页购物卡展示异常");
		checkPoint.result("【pass】Web213_B2C:我的商城页购物卡展示正常");
	}
}










