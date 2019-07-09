/**
 * Author:ZhangPl
 * 
 * 检查点：友情链接-农资农服跳转测图培肥正常
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web062_B2C_Zhangpl extends TestBase{

	@Test
	public void moveNZNF(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			 
			locator.clickByXml("友情链接_B2C", "农资农服");
			//locator.wait(10);
			for(String winHandle : locator.getHandles()){  			          
				locator.switchToWindow(winHandle);
			}  	
			text = locator.getUrl();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web062_B2C:友情链接跳转农资农服业务异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/nznf/index.html?mallId=00000000","【fail】Web062_B2C:友情链接跳转农资农服业务异常");
		checkPoint.result("【pass】Web062_B2C:友情链接跳转农资农服业务正常");
		webDriver.close();
	}
	
}










