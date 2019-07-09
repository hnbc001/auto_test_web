/**
 * Author:ZhangPl
 * 
 * 检查点：支付页面支付金额
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web045_B2C_Zhangpl extends TestBase{

	@Test
	public void casPrice(){

		String price=null;
		String text=null;
		String url=null;
		try {	
			price=locator.getText("订单页_B2C", "支付金额");
			locator.wait(2);
			locator.clickByXml("订单页_B2C", "收银台按钮");                                                                                                                                 
			locator.wait(2);
			url=locator.getUrl();
			if(url.matches(".*security.*redietOrderStatus=99")){
				locator.back();
				locator.clickByXml("订单页_B2C", "收银台按钮");
			}
			text=locator.getText("支付页面_B2C", "支付金额");	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web045_B2C:支付页面支付金额显示异常");
		}
		
		checkPoint.equals(text,"¥"+price, "【fail】Web045_B2C:支付页面支付金额显示异常");
		checkPoint.result("【pass】Web045_B2C:支付页面支付金额显示正常");
	}
}










