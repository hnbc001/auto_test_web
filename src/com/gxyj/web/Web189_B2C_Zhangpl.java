/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-绑定新卡
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web189_B2C_Zhangpl extends TestBase {

	@Test
	public void newCard() {
		
		String text = null;
		try{
			locator.clickByXml("结算页_B2C", "绑定新卡");
			locator.wait(3);
			text=locator.getAlertText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web189_B2C:结算未绑定新卡提示失败");
		}
		
		checkPoint.equals(text, "请输入购物卡卡号", "【fail】Web189_B2C:结算未绑定新卡提示失败");
		checkPoint.result("【pass】Web189_B2C:结算未绑定新卡提示成功");
		locator.acceptAlert();
	}
}
