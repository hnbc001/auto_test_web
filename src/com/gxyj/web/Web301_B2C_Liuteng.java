/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web301_B2C_Liuteng extends TestBase{

	@Test
	public void locationEmpty(){

		String test = null;
		try {
			locator.get("http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000");
			locator.wait(3);
			locator.clickAndHold("我的商城页_B2C", "账户设置");
			locator.wait(2);
			locator.clickByXml("我的商城页_B2C", "地址管理");
			locator.clickByXml("我的商城页_B2C", "新建收货地址");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "友情提示");
			locator.clickByXml("我的商城页_B2C", "友情提示确定");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web301_B2C:我的收货信息页所在地为空异常");
		}
		checkPoint.equals(test, "所在地不能为空!", "【fail】Web301_B2C:我的收货信息页所在地为空异常");
		checkPoint.result("【pass】Web301_B2C:我的收货信息页所在地为空正常");
	}
}










