/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-商品小计
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web163_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcPrice(){

		boolean text=false;
		double num=0.00;
		double price=0.00;
		double xiaoji = 0.00;
		try {
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			num = Double.parseDouble(locator.getAttri("购物车页_B2C", "商品数量","value"));
			price = Double.parseDouble(locator.getText("购物车页_B2C", "商品单价").substring(1));
			xiaoji = Double.parseDouble(locator.getText("购物车页_B2C", "商品小计 ").substring(1));
			if(xiaoji==num*price)
				text = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web163_B2C:购物车商品小计展示异常");
		}
		
		checkPoint.equals(text,true,"【fail】Web163_B2C:购物车商品小计展示异常");
		checkPoint.result("【pass】Web163_B2C:购物车商品小计展示正常");
	}
}










