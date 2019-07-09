package com.gxyj.web;

import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web010_B2C_Chihy extends TestBase {

	@Test
	public void list4() {
		String url = null;
		
		try {
			locator.get("http://www.gxyj.com/index.html");
			locator.clickByXml("首页_B2C", "蜜饯");
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
			Reporter.log("【fail】Web010_B2C:列表4打开失败");
		}
		
		checkPoint.equals(url, "http://www.gxyj.com/searchproducts/pv.jhtml?mallId=00000000&searchType=CATEGORY&catId=85003", "【fail】Web010_B2C:列表4打开失败");
		checkPoint.result("【pass】Web010_B2C:列表4打开成功");
	}
}
