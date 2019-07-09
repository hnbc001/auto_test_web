/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web201_B2C_Liuteng extends TestBase{

	@Test
	public void pendingPayment(){

		boolean flag = false;
		try {
			locator.get("http://www.gxyj.com/index.html");
			//locator.login_B2C();
			locator.get("http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000");
			locator.closeOtherWindow();
			flag = locator.elementIsExit("我的商城页_B2C", "待付款");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web201_B2C:我的商城页待付款展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web201_B2C:我的商城页待付款展示异常");
		checkPoint.result("【pass】Web201_B2C:我的商城页待付款展示正常");
	}
}










