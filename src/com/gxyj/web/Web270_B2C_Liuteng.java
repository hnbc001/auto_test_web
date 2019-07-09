/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web270_B2C_Liuteng extends TestBase{

	@Test
	public void productPicture(){

		String test = null;
		try {
			test = locator.getAttri("我的商城页_B2C", "商品图片", "src");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web270_B2C:我的商城页商品图片展示异常");
		}
		checkPoint.equals(test, "http://img1.ccgn.cc/images/2018/4/12/00001092/1523538902580.jpg-120x120", "【fail】Web270_B2C:我的商城页商品图片展示异常");
		checkPoint.result("【pass】Web270_B2C:我的商城页商品图片展示正常");
	}
}










