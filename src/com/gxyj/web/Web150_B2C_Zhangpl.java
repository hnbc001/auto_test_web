/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-数量小于1
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web150_B2C_Zhangpl extends TestBase{

	@Test
	public void numMinus(){

		String text=null;
		try {	
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "数量减");
			text = locator.getAttri("详情页_B2C", "数量", "value");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web150_B2C:商详页数量小于1提示异常");
		}
		
		checkPoint.equals(text,"1","【fail】Web150_B2C:商详页数量小于1提示异常");
		checkPoint.result("【pass】Web150_B2C:商详页数量小于1提示正常");
	}
}










