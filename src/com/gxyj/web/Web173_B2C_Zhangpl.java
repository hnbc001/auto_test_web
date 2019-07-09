/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-自提信息区域显示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web173_B2C_Zhangpl extends TestBase {

	@Test
	public void ztTown() {
		
		int text = 0;
		try {
			locator.clickByXml("结算页_B2C", "自提区域");
			locator.selectByTest("结算页_B2C", "自提区域", "西城区");
			text=locator.getTexts("结算页_B2C", "自提地址").size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web173_B2C:结算页自提信息区域显示失败");
		}
		
		checkPoint.equals(text, 2, "【fail】Web173_B2C:结算页自提信息区域显示失败");
		checkPoint.result("【pass】Web173_B2C:结算页自提信息区域显示成功");
	}
}
