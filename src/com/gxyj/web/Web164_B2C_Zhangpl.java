/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-删除选中商品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web164_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcDelete(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			locator.clickByXml("购物车页_B2C", "删除选中商品");
			text=locator.getText("提示信息_B2C", "提示内容");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web164_B2C:购物车删除选中商品提示异常");
		}
		
		checkPoint.equals(text,"请至少选中一件商品！","【fail】Web164_B2C:购物车删除选中商品提示异常");
		checkPoint.result("【pass】Web164_B2C:购物车删除选中商品提示正常");
	}
}










