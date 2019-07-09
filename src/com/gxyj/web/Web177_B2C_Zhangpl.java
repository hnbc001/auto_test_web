/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-卡卷信息
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web177_B2C_Zhangpl extends TestBase {

	@Test
	public void coupon() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "使用卡卷");
			text=locator.getAttri("结算页_B2C", "使用卡卷", "class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web177_B2C:结算页卡卷信息弹出失败");
		}
		
		checkPoint.equals(text, "bg-arr bg-arrU", "【fail】Web177_B2C:结算页卡卷信息弹出失败");
		checkPoint.result("【pass】Web177_B2C:结算页卡卷信息弹出成功");
	}
}
