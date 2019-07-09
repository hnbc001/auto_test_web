/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web283_B2C_Liuteng extends TestBase{

	@Test
	public void affirmRefundNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "待买家确认退款数量");
			System.out.println(locator.getText("我的退款单_B2C", "待买家确认退款数量"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web283_B2C:我的退款单页待买家确认退款数量展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web283_B2C:我的退款单页待买家确认退款数量展示异常");
		checkPoint.result("【pass】Web283_B2C:我的退款单页待买家确认退款数量展示正常");
	}
}










