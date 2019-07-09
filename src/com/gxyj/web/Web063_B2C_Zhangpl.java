/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-新手上路
 */

package com.gxyj.web;

import java.util.Arrays;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web063_B2C_Zhangpl extends TestBase{

	@Test
	public void freshMan(){

		List<String> text=null;
		List<String> result=null;
		try {
			for(String winHandle : locator.getHandles()){  			          
				locator.switchToWindow(winHandle);
			}  	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "新手上路");
			result=Arrays.asList("初次到访","关于我们","友情链接");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web063_B2C:友情链接新手上路显示异常");
		}
		
		checkPoint.equals(text,result,"【fail】Web063_B2C:友情链接新手上路显示异常");
		checkPoint.result("【pass】Web063_B2C:友情链接新手上路显示正常");
	}
}










