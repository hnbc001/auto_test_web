/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web206_B2C_Liuteng extends TestBase{

	@Test
	public void redEnvelopeNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "红包数量");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web206_B2C:我的商城页红包数量展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web206_B2C:我的商城页红包数量展示异常");
		checkPoint.result("【pass】Web206_B2C:我的商城页红包数量展示正常");
	}
}










