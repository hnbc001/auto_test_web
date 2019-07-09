/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web286_B2C_Liuteng extends TestBase{

	@Test
	public void refundOrderApplyTimeEnd(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "退款单申请时间结束");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web286_B2C:我的退款单页退款单申请时间结束展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web286_B2C:我的退款单页退款单申请时间结束展示异常");
		checkPoint.result("【pass】Web286_B2C:我的退款单页退款单申请时间结束展示正常");
	}
}










