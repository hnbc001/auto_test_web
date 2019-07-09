/**
 * Author:ZhangPl
 * 
 * 检查点：订单页收银台按钮显示正常
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web044_B2C_Zhangpl extends TestBase{

	@Test
	public void moveCAS(){
		
		boolean text = false;
		try {
			text=locator.elementIsExit("订单页_B2C", "收银台按钮");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web044_B2C:订单页收银台按钮显示异常");
		}
		
		checkPoint.equals(text, true, "【fail】Web044_B2C:订单页收银台按钮显示异常");
		checkPoint.result("【pass】Web044_B2C:订单页收银台按钮显示正常");
	}
}










