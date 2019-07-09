/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-购物卡密码
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web185_B2C_Zhangpl extends TestBase {

	@Test
	public void scPwd() {
		
		boolean flag = false;
		try {
			flag = locator.elementIsExit("结算页_B2C", "购物卡密码");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web185_B2C:结算页购物卡密码显示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web185_B2C:结算页购物卡密码显示失败");
		checkPoint.result("【pass】Web185_B2C:结算页购物卡密码显示成功");
	}
}
