/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-自提信息
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web170_B2C_Zhangpl extends TestBase {

	@Test
	public void ziTi() {
		
		String text = null;
		try {
			//locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "自提");
			text=locator.getAttri("结算页_B2C", "自提信息", "style");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web170_B2C:结算页自提信息弹出失败");
		}
		
		checkPoint.equals(text, "display: block;", "【fail】Web170_B2C:结算页自提信息弹出失败");
		checkPoint.result("【pass】Web170_B2C:结算页自提信息弹出成功");
	}
}
