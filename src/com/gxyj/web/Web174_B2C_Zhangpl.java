/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-自提信息确认显示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web174_B2C_Zhangpl extends TestBase {

	@Test
	public void ztSure() {
		
		String text = null;
		try {
			locator.clickByXml("结算页_B2C", "宣外自提");
			locator.clickByXml("结算页_B2C", "自提保存");
			text=locator.getText("结算页_B2C", "显示地址");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web174_B2C:结算页自提信息确认显示失败");
		}
		
		checkPoint.equals(text, "北京 北京市 西城区 宣外大街1号", "【fail】Web174_B2C:结算页自提信息确认显示失败");
		checkPoint.result("【pass】Web174_B2C:结算页自提信息确认显示成功");
	}
}
