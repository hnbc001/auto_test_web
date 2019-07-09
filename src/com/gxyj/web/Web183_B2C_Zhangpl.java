/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-无购物卡时提示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web183_B2C_Zhangpl extends TestBase {

	@Test
	public void scNo() {
		
		String text = null;
		try {
			text=locator.getText("结算页_B2C", "无购物卡");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web183_B2C:结算页无购物卡时提示显示失败");
		}
		
		checkPoint.equals(text, "暂无购物卡，如需使用购物卡请先进行绑定", "【fail】Web183_B2C:结算页无购物卡时提示显示失败");
		checkPoint.result("【pass】Web183_B2C:结算页无购物卡时提示显示成功");
	}
}
