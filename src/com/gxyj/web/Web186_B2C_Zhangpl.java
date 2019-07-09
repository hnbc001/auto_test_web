/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-卡验证码
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web186_B2C_Zhangpl extends TestBase {

	@Test
	public void scValidate() {
		
		boolean flag = false;
		try {
			flag = locator.elementIsExit("结算页_B2C", "卡验证码");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web186_B2C:结算页卡验证码显示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web186_B2C:结算页卡验证码显示失败");
		checkPoint.result("【pass】Web186_B2C:结算页卡验证码显示成功");
	}
}
