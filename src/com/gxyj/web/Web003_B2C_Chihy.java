/**
 * @author chihongyuan
 * 验证地区切换按钮功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web003_B2C_Chihy extends TestBase {

	@Test
	public void area() {
		
		boolean flag = false;
		
		try {
			locator.login_B2C();
			flag = locator.elementIsExit("首页_B2C", "地区切换按钮");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web003_B2C:地区切换按钮展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web003_B2C:地区切换按钮展示失败");
		checkPoint.result("【pass】Web003_B2C:地区切换按钮展示成功");
	}
}
