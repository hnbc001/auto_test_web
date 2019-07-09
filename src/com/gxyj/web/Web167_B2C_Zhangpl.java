/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-移入关注下
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web167_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcFocnTips(){

		boolean text=false;
		try {
			locator.clickByXml("提示信息_B2C", "确定按钮");
			text=locator.getAttri("提示信息_B2C", "提示隐藏", "style").matches(".*display: none.*");				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web167_B2C:购物车移入关注下提示异常");
		}
		
		checkPoint.equals(text,true,"【fail】Web167_B2C:购物车移入关注下提示异常");
		checkPoint.result("【pass】Web167_B2C:购物车移入关注下提示正常");
	}
}










