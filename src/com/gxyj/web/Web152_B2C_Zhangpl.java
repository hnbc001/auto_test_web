/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-未选规格购买
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web152_B2C_Zhangpl extends TestBase{

	@Test
	public void buyRedTips(){

		String text=null;
		try {	
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "立即购买");
			text = locator.getAttri("详情页_B2C", "规格红框", "class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web152_B2C:商详页未选规格购买红框展示异常");
		}
		
		checkPoint.equals(text,"select_a select_a_cur","【fail】Web152_B2C:商详页未选规格购买红框展示异常");
		checkPoint.result("【pass】Web152_B2C:商详页未选规格购买红框展示正常");
	}
}










