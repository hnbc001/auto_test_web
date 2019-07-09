/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-移入关注下
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web166_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcFocn(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			locator.clickByXml("购物车页_B2C", "移入关注下");
			text=locator.getText("提示信息_B2C", "提示内容");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web166_B2C:购物车移入关注下提示异常");
		}
		
		checkPoint.equals(text,"请至少选中一件商品！","【fail】Web166_B2C:购物车移入关注下提示异常");
		checkPoint.result("【pass】Web166_B2C:购物车移入关注下提示正常");
	}
}










