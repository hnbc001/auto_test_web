/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-数量加1
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web148_B2C_Zhangpl extends TestBase{

	@Test
	public void numAdd(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "数量加");
			text = locator.getAttri("详情页_B2C", "数量", "value");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web148_B2C:商详页数量增加展示异常");
		}
		
		checkPoint.equals(text,"2","【fail】Web148_B2C:商详页数量增加展示异常");
		checkPoint.result("【pass】Web148_B2C:商详页数量增加展示正常");
	}
}










