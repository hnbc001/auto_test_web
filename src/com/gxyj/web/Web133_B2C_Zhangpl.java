/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-和我联系
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web133_B2C_Zhangpl extends TestBase{

	@Test
	public void contactUs(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "和我联系");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web133_B2C:商详页和我联系展示异常");
		}
		
		checkPoint.equals(text,"和我联系","【fail】Web133_B2C:商详页和我联系异常");
		checkPoint.result("【pass】Web133_B2C:商详页和我联系展示正常");
	}
}










