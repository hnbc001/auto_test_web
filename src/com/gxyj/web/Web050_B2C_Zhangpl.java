/**
 * Author:ZhangPl
 * 
 * 检查点：我的商城页面-站内消息
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web050_B2C_Zhangpl extends TestBase{

	@Test
	public void webMsg(){

		boolean text=false;
		try {
			locator.get("http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000");
			text=locator.elementIsExit("我的商城页_B2C", "站内消息");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web050_B2C:我的商城页面站内消息显示异常");
		}
		
		checkPoint.equals(text,true, "【fail】Web050_B2C:我的商城页面站内消息显示异常");
		checkPoint.result("【pass】Web050_B2C:我的商城页面站内消息显示正常");
		
	}
}










