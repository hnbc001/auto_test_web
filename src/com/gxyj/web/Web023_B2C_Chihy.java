/*
 * bug-24229，导致该用例注释不执行
*/
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web023_B2C_Chihy extends TestBase {
	
	@Test
	public void Consignee() {
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			locator.wait(3);
			locator.clickByXml("购物车页_B2C", "复选框");
			locator.clickByXml("购物车页_B2C", "去结算");
			locator.wait(3);
			text = locator.getText("结算页_B2C", "收货账号");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web023_B2C:收货人展示失败");
		}
		checkPoint.equals(text, "自动化测试", "【fail】Web023_B2C:收货人展示失败");
		checkPoint.result("【pass】Web023_B2C:收货人展示成功");
	}
}
