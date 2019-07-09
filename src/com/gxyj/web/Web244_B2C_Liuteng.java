/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web244_B2C_Liuteng extends TestBase{

	@Test
	public void location(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "所在地二");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web244_B2C:我的商城页所在地二展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web244_B2C:我的商城页所在地二展示异常");
		checkPoint.result("【pass】Web244_B2C:我的商城页所在地二展示正常");
	}
}










