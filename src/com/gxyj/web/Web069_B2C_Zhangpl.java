/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-
 */

package com.gxyj.web;

import java.util.Arrays;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web069_B2C_Zhangpl extends TestBase{

	@Test
	public void merchant(){

		List<String> text=null;
		List<String> result=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "商家入驻");
			result=Arrays.asList("地方平台搭建","商户入驻","禁售商品规则","入驻流程","入驻须知");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web069_B2C:友情链接售后保障显示异常");
		}
		
		checkPoint.equals(text,result, "【fail】Web069_B2C:友情链接售后保障显示异常");
		checkPoint.result("【pass】Web069_B2C:友情链接售后保障显示正常");
	}
}









