/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web070_B2C_Zhangpl extends TestBase{

	@Test
	public void goods(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "购物指南").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web070_B2C:友情链接购物指南显示异常");
		}
		
		checkPoint.equals(text,"[购物流程]", "【fail】Web070_B2C:友情链接购物指南显示异常");
		checkPoint.result("【pass】Web070_B2C:友情链接购物指南显示正常");
	}
}









