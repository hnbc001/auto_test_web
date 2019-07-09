/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web071_B2C_Zhangpl extends TestBase{

	@Test
	public void copyright(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			text=locator.getTexts("友情链接_B2C", "版权所有").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web071_B2C:友情链接版权所有显示异常");
		}
		
		checkPoint.equals(text,"[版权所有 供销e家 | 京ICP备15050565号 | 京公网安备11011202000858号 | 经营执照 | 京ICP证151138号]", "【fail】Web071_B2C:友情链接版权所有显示异常");
		checkPoint.result("【pass】Web071_B2C:友情链接版权所有显示正常");
	}
}









