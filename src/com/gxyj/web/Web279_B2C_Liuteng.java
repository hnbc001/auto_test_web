/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web279_B2C_Liuteng extends TestBase{

	@Test
	public void batchCancelledCollect(){

		String test = null;
		try {
			test = locator.getText("我的商城页_B2C", "批量取消收藏");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web279_B2C:我的商城页批量取消收藏展示异常");
		}
		checkPoint.equals(test, "批量取消收藏", "【fail】Web279_B2C:我的商城页批量取消收藏展示异常");
		checkPoint.result("【pass】Web279_B2C:我的商城页批量取消收藏展示正常");
	}
}










