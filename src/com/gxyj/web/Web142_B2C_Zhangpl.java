/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-店主推荐
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web142_B2C_Zhangpl extends TestBase{

	@Test
	public void recommend(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getText("详情页_B2C", "店主推荐");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web142_B2C:商详页店主推荐展示异常");
		}
		
		checkPoint.equals(text,"店主推荐","【fail】Web142_B2C:商详页店主推荐展示异常");
		checkPoint.result("【pass】Web142_B2C:商详页店主推荐展示正常");
	}
}










