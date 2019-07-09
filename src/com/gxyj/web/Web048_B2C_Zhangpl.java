/**
 * Author:ZhangPl
 * 
 * 检查点：我的商城页面-用户名称
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web048_B2C_Zhangpl extends TestBase{

	@Test
	public void memberName(){
			
		String name=null;
		try {
			locator.get("http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000");
			name = locator.getText("我的商城页_B2C", "用户名称");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web048_B2C:我的商城页面用户名称显示异常");
		}
		
		checkPoint.equals(name,"自动化测试账号，欢迎您！", "【fail】Web048_B2C:我的商城页面用户名称显示异常");
		checkPoint.result("【pass】Web048_B2C:我的商城页面用户名称显示正常");
	}
}










