/**
 * @author chihongyuan
 * 验证首页地方平台打开功能
 */

package com.gxyj.web;

import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web006_B2C_Chihy extends TestBase {

	@Test
	public void localPlatform() {
		
		String url = null;
		
		try {
			locator.get("http://www.gxyj.com/index.html");
			locator.clickByXml("首页_B2C", "地方平台");
			String source = locator.getHandle();
			Set<String> handles = locator.getHandles();
			for (String handle : handles) {
				if (!(handle.equals(source))) {
					locator.switchToWindow(handle);
					url = locator.getUrl();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web006_B2C:地方平台打开失败");
		}
		
		checkPoint.equals(url, "http://www.gxyj.com/dfptlby/index.html", "【fail】Web006_B2C:地方平台打开失败");
		checkPoint.result("【pass】Web006_B2C:地方平台打开成功");
	}
}
