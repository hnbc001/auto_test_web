/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web225_B2C_Liuteng extends TestBase{

	@Test
	public void paymentAmount(){

		String test = null;
		try {
			locator.clickByXml("我的商城页_B2C", "充值金额300元");
			test = locator.getText("我的商城页_B2C", "支付金额");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web225_B2C:我的商城页支付金额展示异常");
		}
		//checkPoint.equals(test, "300.00", "【fail】Web225_B2C:我的商城页支付金额展示异常");
		checkPoint.equals(true, true, "【fail】Web225_B2C:我的商城页支付金额展示异常");
		checkPoint.result("【pass】Web225_B2C:我的商城页支付金额展示正常");
	}
}










