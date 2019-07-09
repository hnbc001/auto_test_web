/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web205_B2C_Liuteng extends TestBase{

	@Test
	public void membershipLevel(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "会员等级");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web205_B2C:我的商城页会员等级展示异常");
		}
		checkPoint.equals(test, "普通会员", "【fail】Web205_B2C:我的商城页会员等级展示异常");
		checkPoint.result("【pass】Web205_B2C:我的商城页会员等级展示正常");
	}
}










