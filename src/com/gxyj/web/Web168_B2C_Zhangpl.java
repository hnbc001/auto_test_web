/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-清除失效产品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web168_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcDelLosTips(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			locator.clickByXml("购物车页_B2C", "清除失效产品");
			text=locator.getText("提示信息_B2C", "提示内容");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web168_B2C:购物车清除失效产品提示异常");
		}
		
		checkPoint.equals(text,"没有失效商品！","【fail】Web168_B2C:购物车清除失效产品提示异常");
		checkPoint.result("【pass】Web168_B2C:购物车清除失效产品提示正常");
	}
}










