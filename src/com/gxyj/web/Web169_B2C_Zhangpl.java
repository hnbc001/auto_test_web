/**
 * Author:ZhangPl
 * 
 * 检查点：购物车-没有失效商品！
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web169_B2C_Zhangpl extends TestBase{

	@Test
	public void gwcNoLose(){

		boolean text=false;
		try {
			locator.clickByXml("提示信息_B2C", "确定按钮");
			text=locator.getAttri("提示信息_B2C", "提示隐藏", "style").matches(".*display: none.*");				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web169_B2C:购物车没有失效商品提示异常");
		}
		
		checkPoint.equals(text,true,"【fail】Web169_B2C:购物车没有失效商品提示异常");
		checkPoint.result("【pass】Web169_B2C:购物车没有失效商品提示正常");
	}
}










