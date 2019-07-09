/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-自提信息市县显示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web172_B2C_Zhangpl extends TestBase {

	@Test
	public void ztCity() {
		
		int text = 0;
		try {
			locator.clickByXml("结算页_B2C", "自提市县");
			locator.selectByTest("结算页_B2C", "自提市县", "北京市");
			text=locator.getTexts("结算页_B2C", "自提地址").size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web172_B2C:结算页自提信息市县显示失败");
		}
		
		checkPoint.equals(text, 4, "【fail】Web172_B2C:结算页自提信息市县显示失败");
		checkPoint.result("【pass】Web172_B2C:结算页自提信息市县显示成功");
	}
}
