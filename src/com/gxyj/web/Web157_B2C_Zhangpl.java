/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-商品规格
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web157_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcSpRule(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			text = locator.getText("购物车页_B2C", "商品规格 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web157_B2C:购物车商品规格展示异常");
		}
		
		checkPoint.equals(text,"规格:自定义1","【fail】Web157_B2C:购物车商品规格展示异常");
		checkPoint.result("【pass】Web157_B2C:购物车商品规格展示正常");
	}
}










