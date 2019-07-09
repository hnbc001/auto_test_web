/**
 * Author:ZhangPl
 * 
 * 检查点：我的商城页面-账户设置
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web049_B2C_Zhangpl extends TestBase{

	@Test
	public void setAccount(){
		
		boolean text=false;
		try {
			locator.get("http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000");
			text=locator.elementIsExit("我的商城页_B2C", "账户设置");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web049_B2C:我的商城页面账户设置显示异常");
		}
		
		checkPoint.equals(text,true, "【fail】Web049_B2C:我的商城页面账户设置显示异常");
		checkPoint.result("【pass】Web049_B2C:我的商城页面账户设置显示正常");
	}
}










