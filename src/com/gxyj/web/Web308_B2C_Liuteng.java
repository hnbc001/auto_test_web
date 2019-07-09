/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web308_B2C_Liuteng extends TestBase{

	@Test
	public void phoneFormatError(){

		String test = null;
		try {
			locator.sendKeys("我的商城页_B2C", "新增邮政编码", "000000");
			locator.sendKeys("我的商城页_B2C", "新增手机号", "phone");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "友情提示");
			locator.clickByXml("我的商城页_B2C", "友情提示确定");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web308_B2C:我的收货信息页手机号码格式错误异常");
		}
		checkPoint.equals(test, "您填写的手机号码格式有误。正确格式是138****0000。", "【fail】Web308_B2C:我的收货信息页手机号码格式错误异常");
		checkPoint.result("【pass】Web308_B2C:我的收货信息页手机号码格式错误正常");
	}
}










