/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-购物卡提示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web182_B2C_Zhangpl extends TestBase {

	@Test
	public void scTips() {
		
		String text = null;
		try {
			locator.clickByXml("结算页_B2C", "购物卡");
			text=locator.getText("结算页_B2C", "购物卡提示");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web182_B2C:结算页购物卡提示显示失败");
		}
		
		checkPoint.equals(text, "当订单金额不满单张充值卡面额时，充值卡可分多次使用；当充值卡余额不足订单金额时，须通过其他支付方式补足金额。客服电话：400-628-6121", "【fail】Web182_B2C:结算页购物卡提示显示失败");
		checkPoint.result("【pass】Web182_B2C:结算页购物卡提示显示成功");
	}
}
