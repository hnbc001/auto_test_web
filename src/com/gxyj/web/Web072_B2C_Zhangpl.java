/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web072_B2C_Zhangpl extends TestBase{

	@Test
	public void moveLP(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "扫码地址").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web072_B2C:友情链接扫码地址显示异常");
		}
		
		checkPoint.equals(text,"[微信公众平台, 下载客户端]", "【fail】Web072_B2C:友情链接扫码地址显示异常");
		checkPoint.result("【pass】Web072_B2C:友情链接扫码地址显示正常");
	}
}









