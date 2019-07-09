/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web302_B2C_Liuteng extends TestBase{

	@Test
	public void addressEmpty(){

		String test = null;
		try {
			locator.selectByTest("我的商城页_B2C", "新增地区省", "北京");
			locator.selectByTest("我的商城页_B2C", "新增地区区", "通州区");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "友情提示");
			locator.clickByXml("我的商城页_B2C", "友情提示确定");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web302_B2C:我的收货信息页街道地址为空异常");
		}
		checkPoint.equals(test, "街道地址不能为空!", "【fail】Web302_B2C:我的收货信息页街道地址为空异常");
		checkPoint.result("【pass】Web302_B2C:我的收货信息页街道地址为空正常");
	}
}










