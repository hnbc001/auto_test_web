/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-新建地址
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web199_B2C_Zhangpl extends TestBase {

	@Test
	public void setDef() {
		
		String text = null;
		String check = null;
		try{
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "更多地址");
			locator.wait(3);
			locator.clickByXml("结算页_B2C", "预期默认");
			check = locator.getAttri("结算页_B2C", "设置默认","class");
			if(check != "to_add"){
				locator.clickByXml("结算页_B2C", "设置默认");
			}
			text=locator.getText("结算页_B2C", "预期默认");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web199_B2C:结算页设置默认地址失败");
		}
		
		checkPoint.equals(text, "15300085608", "【fail】Web199_B2C:结算页设置默认地址失败");
		checkPoint.result("【pass】Web199_B2C:结算页设置默认地址成功");
	}
}
