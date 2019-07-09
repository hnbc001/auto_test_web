/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web227_B2C_Liuteng extends TestBase{

	@Test
	public void username(){

		String test = null;
		try {
			locator.clickAndHold("我的商城页_B2C", "账户设置");
			locator.wait(2);
			locator.clickByXml("我的商城页_B2C", "个人信息");
			test = locator.getAttri("我的商城页_B2C", "用户名", "value");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web227_B2C:我的商城页用户名展示异常");
		}
		checkPoint.equals(test, "WX_yfvi06776351", "【fail】Web227_B2C:我的商城页用户名展示异常");
		checkPoint.result("【pass】Web227_B2C:我的商城页用户名展示正常");
	}
}










