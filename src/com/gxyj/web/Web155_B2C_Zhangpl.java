/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-未选规格购买
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web155_B2C_Zhangpl extends TestBase{

	@Test
	public void buyMove(){

		String text=null;
		try {	
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "规格");
			locator.wait(2);
			locator.clickByXml("详情页_B2C", "立即购买");
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web155_B2C:商详页立即购买跳转异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000","【fail】Web155_B2C:商详页立即购买跳转异常");
		checkPoint.result("【pass】Web155_B2C:商详页立即购买跳转正常");
	}
}










