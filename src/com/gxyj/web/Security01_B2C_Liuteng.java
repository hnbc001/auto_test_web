/**
 * @author Liuteng
 * 验证首页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security01_B2C_Liuteng extends TestBase {

	@Test
	public void security01_B2C(){
		
		String text = null;
		try {
			locator.login_B2C();
			locator.wait(1);
			locator.get("http://www.gxyj.com/index.html");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security01_B2C:首页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/index.html", "【fail】Security01_B2C:首页打开失败");
		checkPoint.result("【pass】Security01_B2C:首页打开成功");
	}
}