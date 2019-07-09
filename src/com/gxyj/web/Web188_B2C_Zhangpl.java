/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-绑定新卡
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web188_B2C_Zhangpl extends TestBase {

	@Test
	public void card() {
		
		String text = null;
		try {
			text=locator.getText("结算页_B2C", "绑定新卡");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web188_B2C:结算页绑定新卡显示失败");
		}
		
		checkPoint.equals(text, "绑定新卡并使用", "【fail】Web188_B2C:结算页绑定新卡显示失败");
		checkPoint.result("【pass】Web188_B2C:结算页绑定新卡显示成功");
	}
}
