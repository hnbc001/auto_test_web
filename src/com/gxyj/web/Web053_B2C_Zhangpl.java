/**
 * Author:ZhangPl
 * 
 * 检查点：我的订单页面-待付款订单
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web053_B2C_Zhangpl extends TestBase{

	@Test
	public void noPayOrders(){

		boolean text=false;
		try {		
			locator.get("http://www.gxyj.com/member/memberOrders.jhtml?menuType=2_1&mallId=00000000");
			text=locator.elementIsExit("我的订单页_B2C", "待付款");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web053_B2C:我的订单页面待付款订单显示异常");
		}
		
		checkPoint.equals(text,true, "【fail】Web053_B2C:我的订单页面待付款订单显示异常");
		checkPoint.result("【pass】Web053_B2C:我的订单页面待付款订单显示正常");
	}
}










