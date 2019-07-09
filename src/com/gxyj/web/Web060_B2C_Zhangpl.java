/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-供销e通跳转B2B业务正常
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web060_B2C_Zhangpl extends TestBase{

	@Test
	public void moveB2B(){

		String text=null;	
		try {

			locator.get("http://www.gxyj.com/index.html");			
			locator.clickByXml("友情链接_B2C", "供销e通");
			for(String winHandle : locator.getHandles()){  			          
				locator.switchToWindow(winHandle);
			}  
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web060_B2C:供销e通跳转B2B业务异常");
		}
		
		checkPoint.equals(text,"https://b2b.gxyj.com/?mallId=00000000","【fail】Web060_B2C:供销e通跳转B2B业务异常");
		checkPoint.result("【pass】Web060_B2C:供销e通跳转B2B业务正常");
	}
}










