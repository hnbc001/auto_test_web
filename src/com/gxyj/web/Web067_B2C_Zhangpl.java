/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-配送服务
 */

package com.gxyj.web;

import java.util.Arrays;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web067_B2C_Zhangpl extends TestBase{

	@Test
	public void helperService(){

		List<String> text=null;
		List<String> result=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "配送服务");
			result=Arrays.asList("配送标准","签收验货");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web067_B2C:友情链接配送服务显示异常");
		}
		
		checkPoint.equals(text,result, "【fail】Web067_B2C:友情链接配送服务显示异常");
		checkPoint.result("【pass】Web067_B2C:友情链接配送服务显示正常");
	}
}










