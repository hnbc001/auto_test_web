/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-商品名称
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web156_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcSpName(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			text = locator.getText("购物车页_B2C", "商品名称 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web156_B2C:购物车商品名称展示异常");
		}
		
		checkPoint.equals(text,"测试商品大米0.02","【fail】Web156_B2C:购物车商品名称展示异常");
		checkPoint.result("【pass】Web156_B2C:购物车商品名称展示正常");
	}
}










