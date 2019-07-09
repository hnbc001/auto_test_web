/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web304_B2C_Liuteng extends TestBase{

	@Test
	public void phoneEmpty(){

		String test = null;
		try {
			locator.sendKeys("我的商城页_B2C", "新增收货人", "自动化测试");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "友情提示");
			locator.clickByXml("我的商城页_B2C", "友情提示确定");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web304_B2C:我的收货信息页手机号码为空异常");
		}
		checkPoint.equals(test, "手机号码不能为空。", "【fail】Web304_B2C:我的收货信息页手机号码为空异常");
		checkPoint.result("【pass】Web304_B2C:我的收货信息页手机号码为空正常");
	}
}










