/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-自提结算运费
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web175_B2C_Zhangpl extends TestBase {

	@Test
	public void ztFright() {
		
		String text = null;
		try {
			text=locator.getText("结算页_B2C", "运费结算");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web175_B2C:结算页自提结算运费显示失败");
		}
		
		checkPoint.equals(text, "", "【fail】Web175_B2C:结算页自提结算运费显示失败");
		checkPoint.result("【pass】Web175_B2C:结算页自提结算运费显示成功");
	}
}
