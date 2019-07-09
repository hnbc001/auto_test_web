/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-删除选中商品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web159_B2C_Zhangpl extends TestBase{

	@Test
	public void empChart(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			/*
			 * locator.get("http://www.gxyj.com"); locator.wait(5);
			 */
			locator.clickByXml("购物车页_B2C", "复选框");
			locator.clickByXml("购物车页_B2C", "删除选中商品");
			locator.clickByXml("购物车页_B2C", "确认删除");
			locator.wait(3);
			text = locator.getText("购物车页_B2C", "购物车空 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web159_B2C:购物车删除选中商品删除异常");
		}
		
		checkPoint.equals(text,"您的购物车空空如也！","【fail】Web159_B2C:购物车删除选中商品删除异常");
		checkPoint.result("【pass】Web159_B2C:购物车删除选中商品正常删除");
	}
}










