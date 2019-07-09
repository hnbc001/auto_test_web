/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-清除失效产品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web161_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcDelLossp(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			text = locator.getText("购物车页_B2C", "清除失效产品 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web161_B2C:购物车清除失效产品展示异常");
		}
		
		checkPoint.equals(text,"清除失效产品","【fail】Web161_B2C:购物车清除失效产品展示异常");
		checkPoint.result("【pass】Web161_B2C:购物车清除失效产品展示正常");
	}
}










