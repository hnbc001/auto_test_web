/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-请选择省份
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web192_B2C_Zhangpl extends TestBase {

	@Test
	public void empty() {
		
		String text = null;
		try{	
		//	locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "保存地址");
			text=locator.getText("提示信息_B2C", "提示内容");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web192_B2C:结算未选择省份提示失败");
		}
		
		checkPoint.equals(text, "请选择省份", "【fail】Web192_B2C:结算未选择省份提示失败");
		checkPoint.result("【pass】Web192_B2C:结算未选择省份提示成功");
	}
}
