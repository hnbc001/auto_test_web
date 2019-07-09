/**
 * Author:ZhangPl
 * 
 * 检查点：我的订单页面-订单回收站
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web057_B2C_Zhangpl extends TestBase{

	@Test
	public void recoryOrders(){

		boolean text=false;
		try {			
			locator.get("http://www.gxyj.com/member/memberOrders.jhtml?menuType=2_1&mallId=00000000");
			text=locator.elementIsExit("我的订单页_B2C", "订单回收站");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web057_B2C:我的订单页面订单回收站显示异常");
		}
		
		checkPoint.equals(text,true, "【fail】Web057_B2C:我的订单页面订单回收站显示异常");
		checkPoint.result("【pass】Web057_B2C:我的订单页面订单回收站显示正常");
		
	}
}










