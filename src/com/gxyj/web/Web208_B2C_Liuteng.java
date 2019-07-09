/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web208_B2C_Liuteng extends TestBase{

	@Test
	public void cardNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "购物卡数量");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web208_B2C:我的商城页购物卡数量展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web208_B2C:我的商城页购物卡数量展示异常");
		checkPoint.result("【pass】Web208_B2C:我的商城页购物卡数量展示正常");
	}
}










