/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web268_B2C_Liuteng extends TestBase{

	@Test
	public void myFavorite(){

		String test = null;
		try {
			locator.clickByXml("我的商城页_B2C", "我的收藏");
			test = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web268_B2C:我的商城页我的收藏展示异常");
		}
		checkPoint.equals(test, "http://www.gxyj.com/member/onShowFavoriteProductList.jhtml?menuType=1_8&mallId=00000000", "【fail】Web268_B2C:我的商城页我的收藏展示异常");
		checkPoint.result("【pass】Web268_B2C:我的商城页我的收藏展示正常");
	}
}










