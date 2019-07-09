/**
 * Author:ZhangPl
 * 
 * 检查点：订单页订单编号存在
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web043_B2C_Zhangpl extends TestBase{

	@Test
	public void orderNum(){
		
		boolean text = false;
		try {
			text=locator.elementIsExit("订单页_B2C", "订单编号");	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web043_B2C:订单页订单编号显示异常");
		}
		
		checkPoint.equals(text, true,"【fail】Web043_B2C:订单页订单编号显示异常");
		checkPoint.result("【pass】Web043_B2C:订单页订单编号显示正常");
	}
}










