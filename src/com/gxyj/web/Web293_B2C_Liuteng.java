/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web293_B2C_Liuteng extends TestBase{

	@Test
	public void tableProductPicture(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "表格商品图片");
			System.out.println(locator.getAttri("我的退款单_B2C", "表格商品图片", "src"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web293_B2C:我的退款单页表格商品图片展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web293_B2C:我的退款单页表格商品图片展示异常");
		checkPoint.result("【pass】Web293_B2C:我的退款单页表格商品图片展示正常");
	}
}










