/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web204_B2C_Liuteng extends TestBase{

	@Test
	public void remainEvaluated(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "待评价");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web204_B2C:我的商城页待评价展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web204_B2C:我的商城页待评价展示异常");
		checkPoint.result("【pass】Web204_B2C:我的商城页待评价展示正常");
	}
}










