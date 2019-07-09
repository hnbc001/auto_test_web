/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-自提信息省份显示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web171_B2C_Zhangpl extends TestBase {

	@Test
	public void ztProvine() {
		
		int text = 0;
		try {
			locator.clickByXml("结算页_B2C", "自提省份");
			locator.selectByTest("结算页_B2C", "自提省份", "北京");
			text=locator.getTexts("结算页_B2C", "自提地址").size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web171_B2C:结算页自提信息省份显示失败");
		}
		
		checkPoint.equals(text, 4, "【fail】Web171_B2C:结算页自提信息省份显示失败");
		checkPoint.result("【pass】Web171_B2C:结算页自提信息省份显示成功");
	}
}
