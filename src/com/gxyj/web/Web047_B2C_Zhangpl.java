/**
 * Author:ZhangPl
 * 
 * 检查点：我的商城页面正常跳转
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web047_B2C_Zhangpl extends TestBase{

	@Test
	public void memberShopPage(){
		
		String text=null;
		try {
			locator.get("http://www.gxyj.com/index.html");
			locator.clickByXml("首页_B2C", "我的商城");
			//Switch to new window opened  
			for(String winHandle : locator.getHandles()){  			          
				locator.switchToWindow(winHandle);
			}  		
			text=locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web047_B2C:我的商城页面跳转失败");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000", "【fail】Web047_B2C:我的商城页面跳转失败");
		checkPoint.result("【pass】Web047_B2C:我的商城页面跳转成功");
	}
}










