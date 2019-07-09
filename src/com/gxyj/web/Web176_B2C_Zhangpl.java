/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-自提信息取消
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web176_B2C_Zhangpl extends TestBase {

	@Test
	public void ztCancel() {
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "自提");
			locator.clickByXml("结算页_B2C", "自提取消");
			text=locator.getAttri("结算页_B2C","快递","class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web175_B2C:结算页自提取消显示失败");
		}
		
		checkPoint.equals(text, "padr15_box selected", "【fail】Web175_B2C:结算页自提取消显示失败");
		checkPoint.result("【pass】Web175_B2C:结算页自提取消显示成功");
	}
}
