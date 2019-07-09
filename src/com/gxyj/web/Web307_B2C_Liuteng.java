/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web307_B2C_Liuteng extends TestBase{

	@Test
	public void postalcodeFormatError(){

		String test = null;
		try {
			locator.sendKeys("我的商城页_B2C", "新增固定电话", "010-13800138");
			locator.sendKeys("我的商城页_B2C", "新增邮政编码", "phone");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "友情提示");
			locator.clickByXml("我的商城页_B2C", "友情提示确定");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web307_B2C:我的收货信息页邮编格式错误异常");
		}
		checkPoint.equals(test, "请填写6位数字的邮政编码。", "【fail】Web307_B2C:我的收货信息页邮编格式错误异常");
		checkPoint.result("【pass】Web307_B2C:我的收货信息页邮编格式错误正常");
	}
}










