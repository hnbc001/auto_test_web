/**
 * @author chihongyuan
 * 验证首页扶贫专区打开功能
 */

package com.gxyj.web;

import java.util.Set;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web005_B2C_Chihy extends TestBase {

	@Test 
	public void helpPoor() {
		
		String url = null;
		
		try {
			locator.get("http://www.gxyj.com/index.html");
			locator.clickByXml("首页_B2C", "扶贫专区");
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
			Reporter.log("【fail】Web005_B2C:扶贫专区打开失败");
		}
		
		checkPoint.equals(url, "http://www.gxyj.com/fpzq/index.html", "【fail】Web005_B2C:扶贫专区打开失败");
		checkPoint.result("【pass】Web005_B2C:扶贫专区打开成功");
	}
}
