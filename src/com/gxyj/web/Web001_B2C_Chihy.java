/**
 * @author chihongyuan
 * 验证首页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web001_B2C_Chihy extends TestBase {

	@Test
	public void index(){
		
		boolean flag = false;
		try {
			locator.get("http://www.gxyj.com/index.html");
			flag = locator.elementIsExit("首页_B2C", "图标");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web001_B2C:首页登录失败");
		}
		checkPoint.equals(flag, true, "【fail】Web001_B2C:首页登录失败");
		checkPoint.result("【pass】Web001_B2C:首页登录成功");
	}
}










