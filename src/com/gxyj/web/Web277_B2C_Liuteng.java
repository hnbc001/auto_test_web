/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web277_B2C_Liuteng extends TestBase{

	@Test
	public void collectDelete(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "收藏删除");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web277_B2C:我的商城页收藏删除展示异常");
		}
		checkPoint.equals(test, "删除", "【fail】Web277_B2C:我的商城页收藏删除展示异常");
		checkPoint.result("【pass】Web277_B2C:我的商城页收藏删除展示正常");
	}
}










