/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-移入关注上
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web158_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcfocus1(){

		boolean text=false;
		try {	
			//locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			text = locator.elementIsExit("购物车页_B2C", "移入关注上");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web158_B2C:购物车移入关注展示异常");
		}
		
		checkPoint.equals(text,true,"【fail】Web158_B2C:购物车移入关注展示异常");
		checkPoint.result("【pass】Web158_B2C:购物车移入关注展示正常");
	}
}










