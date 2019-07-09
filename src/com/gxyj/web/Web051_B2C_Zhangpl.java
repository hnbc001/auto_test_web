/**
 * Author:ZhangPl
 * 
 * 检查点：点击我的订单页面跳转正常
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web051_B2C_Zhangpl extends TestBase{

	@Test
	public void memberOrderPage(){

		String text=null;
		try {
			locator.get("http://www.gxyj.com/index.html");
			locator.clickByXml("首页_B2C", "我的订单");
			//Switch to new window opened  
			for(String winHandle : locator.getHandles()){  			          
				locator.switchToWindow(winHandle);
			}  		
			text=locator.getUrl();
			locator.closeOtherWindow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web051_B2C:我的订单页面跳转失败");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/member/memberOrders.jhtml?menuType=2_1&mallId=00000000", "【fail】Web051_B2C:我的订单页面跳转失败");
		checkPoint.result("【pass】Web051_B2C:我的订单页面跳转成功");
	}
}










