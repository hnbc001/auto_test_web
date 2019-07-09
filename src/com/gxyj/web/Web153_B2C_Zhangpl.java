/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-未选规格购买
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web153_B2C_Zhangpl extends TestBase{

	@Test
	public void buyerrTips(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "立即购买");
			text = locator.getText("详情页_B2C", "规格提示");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web153_B2C:商详页未选规格购买提示异常");
		}
		
		checkPoint.equals(text,"请选择商品规格","【fail】Web153_B2C:商详页未选规格购买提示异常");
		checkPoint.result("【pass】Web153_B2C:商详页未选规格购买提示正常");
	}
}










