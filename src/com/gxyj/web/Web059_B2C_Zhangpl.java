/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-供销业务
 */

package com.gxyj.web;

import java.util.Arrays;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web059_B2C_Zhangpl extends TestBase{

	@Test
	public void helperService(){

		List<String> text=null;
		List<String> result=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "供销业务");
			result=Arrays.asList("供销e通","供销e批","供销e农");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web059_B2C:友情链接供销业务显示异常");
		}
		
		checkPoint.equals(text,result, "【fail】Web059_B2C:友情链接供销业务显示异常");
		checkPoint.result("【pass】Web059_B2C:友情链接供销业务显示正常");
	}
}










