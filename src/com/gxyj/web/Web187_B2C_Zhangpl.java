/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-密码提示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web187_B2C_Zhangpl extends TestBase {

	@Test
	public void pwdTips() {
		
		String text = null;
		try {
			text=locator.getText("结算页_B2C", "密码提示");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web187_B2C:结算页密码提示显示失败");
		}
		
		checkPoint.equals(text, "密码只包含数字 0-9，大写字母 A-F", "【fail】Web187_B2C:结算页密码提示显示失败");
		checkPoint.result("【pass】Web187_B2C:结算页密码提示显示成功");
	}
}
