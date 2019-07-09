/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-进店逛逛
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web131_B2C_Zhangpl extends TestBase{

	@Test
	public void searchPrice(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.clickByXml("详情页_B2C", "进店逛逛");
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web131_B2C:商详页进店逛逛跳转异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/shop/index.jhtml?shopId=010231&mallId=00000000","【fail】Web131_B2C:商详页进店逛逛跳转异常");
		checkPoint.result("【pass】Web131_B2C:商详页进店逛逛跳转正常");
	}
}










