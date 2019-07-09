/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web211_B2C_Liuteng extends TestBase{

	@Test
	public void redPacket(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "红包");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web211_B2C:我的商城页红包展示异常");
		}
		checkPoint.equals(test, "红包", "【fail】Web211_B2C:我的商城页红包展示异常");
		checkPoint.result("【pass】Web211_B2C:我的商城页红包展示正常");
	}
}










