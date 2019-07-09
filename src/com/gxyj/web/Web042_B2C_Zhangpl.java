/**
 * Author:ZhangPl
 * 
 * 检查点：订单页金额显示正确
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web042_B2C_Zhangpl extends TestBase{

	@Test
	public void payments(){

		String price=null;
		String text=null;
		try {		
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			price = locator.getText("结算页_B2C", "应付金额");
			locator.clickByXml("结算页_B2C", "提交订单");
			text=locator.getText("订单页_B2C", "支付金额");		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web042_B2C:订单页金额显示错误");
		}
		
		checkPoint.equals(text,price, "【fail】Web042_B2C:订单页金额显示错误");
		checkPoint.result("【pass】Web042_B2C:订单页金额显示正确");
	}
}










