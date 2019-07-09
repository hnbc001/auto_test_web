/**
 * @author chihongyuan
 * 验证注册页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class Web002_B2C_Chihy extends TestBase {

	@Test
	public void register() {
		
		String text = null;
		
		try {
			//locator.get("http://www.gxyj.com/index.html");
			locator.clickByXml("首页_B2C", "注册按钮");
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web002_B2C:注册页面跳转失败"); 
		}
		checkPoint.equals(text, "http://www.gxyj.com/registerUser.jhtml?redirectUrl=http%3A%2F%2Fwww.gxyj.com%2Findex.html&mallId=00000000", "【fail】Web002_B2C:注册页面跳转失败");
		checkPoint.result("【pass】Web002_B2C:注册页登录成功");
	}
}
