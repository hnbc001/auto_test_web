/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web306_B2C_Liuteng extends TestBase{

	@Test
	public void telephoneFormatError(){

		String test = null;
		try {
			locator.sendKeys("我的商城页_B2C", "新增固定电话", "010-13800");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "友情提示");
			locator.clickByXml("我的商城页_B2C", "友情提示确定");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web306_B2C:我的收货信息页固定电话格式错误异常");
		}
		checkPoint.equals(test, "您填写的固定电话区号格式有误。正确格式如010-66****66-88****88", "【fail】Web306_B2C:我的收货信息页固定电话格式错误异常");
		checkPoint.result("【pass】Web306_B2C:我的收货信息页固定电话格式错误正常");
	}
}










