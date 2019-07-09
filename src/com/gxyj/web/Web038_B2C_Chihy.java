package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web038_B2C_Chihy extends TestBase {

	@Test
	public void payPrice() {
		
		int goodsTotalPrice = 0;
		int totalFreight = 0;
		int payPrice = 0;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			goodsTotalPrice = Integer.parseInt(locator.getText("结算页_B2C", "商品总金额").trim().substring(0, locator.getText("结算页_B2C", "商品总金额").trim().length()-3));
			totalFreight = Integer.parseInt(locator.getText("结算页_B2C", "总运费").trim().substring(0, locator.getText("结算页_B2C", "总运费").trim().length()-3));
			payPrice = Integer.parseInt(locator.getText("结算页_B2C", "应付金额").trim().substring(0, locator.getText("结算页_B2C", "应付金额").trim().length()-3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web038_B2C:应付金额展示失败");
			throw new AssertionError();
		}
		checkPoint.equals(payPrice, goodsTotalPrice+totalFreight, "【fail】Web038_B2C:应付金额展示失败");
		checkPoint.result("【pass】Web038_B2C:应付金额展示成功");
	}
}
