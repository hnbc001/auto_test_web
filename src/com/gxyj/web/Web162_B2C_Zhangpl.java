/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-已选商品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web162_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcSelsp(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			text = locator.getText("购物车页_B2C", "已选商品");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web162_B2C:购物车已选商品展示异常");
		}
		
		checkPoint.equals(text,"已选 0 件商品","【fail】Web162_B2C:购物车已选商品展示异常");
		checkPoint.result("【pass】Web162_B2C:购物车已选商品展示正常");
	}
}










