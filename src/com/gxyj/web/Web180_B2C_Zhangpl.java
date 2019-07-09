/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-电子卷
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web180_B2C_Zhangpl extends TestBase {

	@Test
	public void couponDzjs() {
		
		boolean text = false;
		try {

			text=locator.elementIsExit("结算页_B2C", "电子卷内容");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web180_B2C:结算页电子卷内容展示失败");
		}
		
		checkPoint.equals(text, true, "【fail】Web180_B2C:结算页电子卷内容展示失败");
		checkPoint.result("【pass】Web180_B2C:结算页电子卷内容展示成功");
	}
}
