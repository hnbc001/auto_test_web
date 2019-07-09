/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-购物卡提示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web181_B2C_Zhangpl extends TestBase {

	@Test
	public void shoppingCard() {
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "使用卡卷");
			locator.clickByXml("结算页_B2C", "购物卡");
			text=locator.getAttri("结算页_B2C", "购物卡","class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web181_B2C:结算页购物卡提示显示失败");
		}
		
		checkPoint.equals(text, "couponsElc cur", "【fail】Web181_B2C:结算页购物卡提示显示失败");
		checkPoint.result("【pass】Web181_B2C:结算页购物卡提示显示成功");
	}
}
