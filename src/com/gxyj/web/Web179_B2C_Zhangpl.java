/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-电子卷
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web179_B2C_Zhangpl extends TestBase {

	@Test
	public void couponDzj() {
		
		String text = null;
		try {
			text=locator.getAttri("结算页_B2C", "卡卷类型", "class").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web179_B2C:结算页电子卷展示失败");
		}
		
		checkPoint.equals(text, "couponsElc cur", "【fail】Web179_B2C:结算页电子卷展示失败");
		checkPoint.result("【pass】Web179_B2C:结算页电子卷展示成功");
	}
}
