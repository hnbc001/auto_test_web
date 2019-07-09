package com.gxyj.web;

import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web011_B2C_Chihy extends TestBase {

	@Test
	public void list5() {
		String url = null;
		
		try {
			locator.get("http://www.gxyj.com/index.html");
			locator.clickByXml("首页_B2C", "鲜果");
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
			Reporter.log("【fail】Web011_B2C:列表5打开失败1");
		}
		
		checkPoint.equals(url, "http://www.gxyj.com/searchproducts/pv.jhtml?mallId=00000000&searchType=CATEGORY&catId=84", "【fail】Web011_B2C:列表5打开失败2");
		checkPoint.result("【pass】Web011_B2C:列表5打开成功");
	}
}
