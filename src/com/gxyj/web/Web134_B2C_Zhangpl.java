/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-咨询电话
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web134_B2C_Zhangpl extends TestBase{

	@Test
	public void callNum(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "咨询电话");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web134_B2C:商详页咨询电话展示异常");
		}
		
		checkPoint.equals(text,"咨询电话  4006-523-565","【fail】Web134_B2C:商详页咨询电话展示异常");
		checkPoint.result("【pass】Web134_B2C:商详页咨询电话展示正常");
	}
}










