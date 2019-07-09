/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web207_B2C_Liuteng extends TestBase{

	@Test
	public void couponQuantity(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "优惠券数量");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web207_B2C:我的商城页优惠券数量展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web207_B2C:我的商城页优惠券数量展示异常");
		checkPoint.result("【pass】Web207_B2C:我的商城页优惠券数量展示正常");
	}
}










