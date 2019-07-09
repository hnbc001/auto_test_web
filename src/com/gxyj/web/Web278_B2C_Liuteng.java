/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web278_B2C_Liuteng extends TestBase{

	@Test
	public void collectCheckAll(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "收藏全选");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web278_B2C:我的商城页收藏全选展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web278_B2C:我的商城页收藏全选展示异常");
		checkPoint.result("【pass】Web278_B2C:我的商城页收藏全选展示正常");
	}
}










