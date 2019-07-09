/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web303_B2C_Liuteng extends TestBase{

	@Test
	public void consigneeNameEmpty(){

		String test = null;
		try {
			locator.sendKeys("我的商城页_B2C", "新增详细地址", "供销");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "友情提示");
			locator.clickByXml("我的商城页_B2C", "友情提示确定");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web303_B2C:我的收货信息页收货人为空异常");
		}
		checkPoint.equals(test, "收货人姓名不能为空。", "【fail】Web303_B2C:我的收货信息页收货人为空异常");
		checkPoint.result("【pass】Web303_B2C:我的收货信息页收货人为空正常");
	}
}










