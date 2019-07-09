/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-分类个数
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web139_B2C_Zhangpl extends TestBase{

	@Test
	public void categorizeNum(){

		int text=0;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getTexts("详情页_B2C", "分类个数").size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web139_B2C:商详页分类个数展示异常");
		}
		
		checkPoint.equals(text,10,"【fail】Web139_B2C:商详页分类个数展示异常");
		checkPoint.result("【pass】Web139_B2C:商详页分类个数展示正常");
	}
}










