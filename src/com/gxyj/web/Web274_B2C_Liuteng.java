/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web274_B2C_Liuteng extends TestBase{

	@Test
	public void collectTime(){

		boolean flag = false;
		try {
			locator.get("http://www.gxyj.com/member/onShowFavoriteProductList.jhtml?menuType=1_8&mallId=00000000");
			flag = locator.elementIsExit("我的商城页_B2C", "收藏时间");
			System.out.println(flag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web274_B2C:我的商城页收藏时间展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web274_B2C:我的商城页收藏时间展示异常");
		checkPoint.result("【pass】Web274_B2C:我的商城页收藏时间展示正常");
	}
}










