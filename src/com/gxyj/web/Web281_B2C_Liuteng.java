/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web281_B2C_Liuteng extends TestBase{

	@Test
	public void refundProductNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "待买家退还商品数量");
			System.out.println(locator.getText("我的退款单_B2C", "待买家退还商品数量"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web281_B2C:我的退款单页待买家退还商品数量展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web281_B2C:我的退款单页待买家退还商品数量展示异常");
		checkPoint.result("【pass】Web281_B2C:我的退款单页待买家退还商品数量展示正常");
	}
}










