/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web294_B2C_Liuteng extends TestBase{

	@Test
	public void tableProductName(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的退款单_B2C", "表格商品名称");
			System.out.println(locator.getText("我的退款单_B2C", "表格商品名称"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web294_B2C:我的退款单页表格商品名称展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web294_B2C:我的退款单页表格商品名称展示异常");
		checkPoint.result("【pass】Web294_B2C:我的退款单页表格商品名称展示正常");
	}
}










