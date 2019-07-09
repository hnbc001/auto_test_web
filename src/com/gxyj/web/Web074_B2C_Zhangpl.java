/**
 * Author:ZhangPl
 * 
 * 检查点：帮助页面-一级列表
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web074_B2C_Zhangpl extends TestBase{

	@Test
	public void helpList(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml?mallId=00000000");
			text = locator.getAttris("帮助页面_B2C", "帮助列表", "title").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web074_B2C:帮助页面帮助列表展示异常");
		}
		
		checkPoint.equals(text,"[地方平台, 商户登录, 广告服务, 客服服务, 购物指南, 公司简介, 商户入驻, 售后保障, 支付及配送, 新手入门]","【fail】Web074_B2C:帮助页面帮助列表展示异常");
		checkPoint.result("【pass】Web074_B2C:帮助页面帮助列表展示正常");
	}
}










