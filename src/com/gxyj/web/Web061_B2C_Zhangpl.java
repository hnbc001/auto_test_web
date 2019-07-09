/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-供销e批跳转零批业务
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web061_B2C_Zhangpl extends TestBase{

	@Test
	public void moveLP(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			locator.clickByXml("友情链接_B2C", "供销e批");
			for(String winHandle : locator.getHandles()){  			          
				locator.switchToWindow(winHandle);
			}  
			//locator.wait(5);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web061_B2C:供销e批跳转零批业务异常");
		}
		
		checkPoint.equals(text,"http://lingpi.gxyj.com/#home","【fail】Web061_B2C:供销e批跳转零批业务异常");
		checkPoint.result("【pass】Web061_B2C:供销e批跳转零批业务正常");
	}
}










