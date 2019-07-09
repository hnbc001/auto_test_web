/**
 * Author:ZhangPl
 * 
 * 检查点：我的订单页面-全部订单存在
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web052_B2C_Zhangpl extends TestBase{

	@Test
	public void allOrders(){
		
		boolean text=false;
		try {	
			locator.get("http://www.gxyj.com/member/memberOrders.jhtml?menuType=2_1&mallId=00000000");
			text=locator.elementIsExit("我的订单页_B2C", "全部订单");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web052_B2C:我的订单页面全部订单显示异常");
		}
		
		checkPoint.equals(text,true, "【fail】Web052_B2C:我的订单页面全部订单显示异常");
		checkPoint.result("【pass】Web052_B2C:我的订单页面全部订单显示正常");
	}
}










