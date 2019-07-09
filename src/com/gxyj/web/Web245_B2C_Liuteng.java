/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web245_B2C_Liuteng extends TestBase{

	@Test
	public void address(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "街道地址");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web245_B2C:我的商城页街道地址展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web245_B2C:我的商城页街道地址展示异常");
		checkPoint.result("【pass】Web245_B2C:我的商城页街道地址展示正常");
	}
}










