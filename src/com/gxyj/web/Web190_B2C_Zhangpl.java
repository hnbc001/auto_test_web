/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-新建地址
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web190_B2C_Zhangpl extends TestBase {

	@Test
	public void newAdr() {
		
		boolean falg = false;
		try{
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "新建地址");
			falg=locator.elementIsExit("结算页_B2C", "地址标题");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web190_B2C:结算未新建地址展示失败");
		}
		
		checkPoint.equals(falg, true, "【fail】Web190_B2C:结算未新建地址展示失败");
		checkPoint.result("【pass】Web190_B2C:结算未新建地址展示成功");
	}
}
