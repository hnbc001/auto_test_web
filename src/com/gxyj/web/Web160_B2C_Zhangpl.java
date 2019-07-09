/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-移入关注
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web160_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcfocus2(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			text = locator.getText("购物车页_B2C", "移入关注下 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web160_B2C:购物车移入关注展示异常");
		}
		
		checkPoint.equals(text,"移入关注","【fail】Web160_B2C:购物车移入关注展示异常");
		checkPoint.result("【pass】Web160_B2C:购物车移入关注展示正常");
	}
}










