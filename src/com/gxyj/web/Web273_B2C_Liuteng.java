/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web273_B2C_Liuteng extends TestBase{

	@Test
	public void unitPrice(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "单价");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web273_B2C:我的商城页单价展示异常");
		}
		checkPoint.equals(test, "￥0.02", "【fail】Web273_B2C:我的商城页单价展示异常");
		checkPoint.result("【pass】Web273_B2C:我的商城页单价展示正常");
	}
}










