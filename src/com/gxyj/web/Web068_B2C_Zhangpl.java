/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-售后保障
 */

package com.gxyj.web;

import java.util.Arrays;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web068_B2C_Zhangpl extends TestBase{

	@Test
	public void  cosService(){

		List<String> text=null;
		List<String> result=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "售后保障");
			result=Arrays.asList("发票制度","退换货流程","退换货规则");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web068_B2C:友情链接售后保障显示异常");
		}
		
		checkPoint.equals(text,result, "【fail】Web068_B2C:友情链接售后保障显示异常");
		checkPoint.result("【pass】Web068_B2C:友情链接售后保障显示正常");
	}
}










