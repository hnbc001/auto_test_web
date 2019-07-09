/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-卡卷信息
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web178_B2C_Zhangpl extends TestBase {

	@Test
	public void couponNr() {
		
		String text = null;
		try {
			text=locator.getTexts("结算页_B2C", "卡卷类型").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web178_B2C:结算页卡卷类型展示失败");
		}
		
		checkPoint.equals(text, "[优惠券, 购物卡]", "【fail】Web178_B2C:结算页卡卷类型展示失败");
		checkPoint.result("【pass】Web178_B2C:结算页卡卷类型展示成功");
	}
}
