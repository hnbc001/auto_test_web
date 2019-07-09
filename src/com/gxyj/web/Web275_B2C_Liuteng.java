/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web275_B2C_Liuteng extends TestBase{

	@Test
	public void collectNumber(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "收藏人数");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web275_B2C:我的商城页收藏人数展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web275_B2C:我的商城页收藏人数展示异常");
		checkPoint.result("【pass】Web275_B2C:我的商城页收藏人数展示正常");
	}
}










