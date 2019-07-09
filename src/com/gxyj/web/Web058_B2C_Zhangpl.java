/**
 * Author:ZhangPl
 * 
 * 检查点：点击马上登录页面跳转正常
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web058_B2C_Zhangpl extends TestBase{

	@Test
	public void quickLogin(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/index.html");			
			locator.clickByXml("首页_B2C", "退出");
			locator.clickByXml("首页_B2C", "马上登录"); 
			text=locator.getUrl();	 			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web058_B2C:马上登录按钮页面跳转失败");
		}
		
		checkPoint.equals(text,"http://sso.gxyj.com/login?service=http%3A%2F%2Fwww.gxyj.com%2Fj_spring_cas_security_check&mallId=00000000", "【fail】Web058_B2C:马上登录按钮页面跳转失败");
		checkPoint.result("【pass】Web058_B2C:马上登录按钮页面跳转成功");
	}
}










