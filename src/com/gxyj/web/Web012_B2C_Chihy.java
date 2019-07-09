package com.gxyj.web;

import java.util.List;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web012_B2C_Chihy extends TestBase {

	@Test
	public void goods() {

		int count = 0;
		try {
			locator.get("http://www.gxyj.com/index.html");
			locator.sendKeys("首页_B2C", "搜索栏位", "水果");
			locator.clickByXml("首页_B2C", "搜索按钮");
			
			String source = locator.getHandle();
			Set<String> handles = locator.getHandles();
			for (String handle : handles) {
				if (!(handle.equals(source))) {
					locator.switchToWindow(handle);
				}
			}
			
			List<String> list = locator.getTexts("搜索页_B2C", "商品价格");
			for (String str : list) {
				int price = 0;
				price = Integer.parseInt(str.trim().substring(1, str.trim().length()-3));
				if (price<=1) {
					count++;
					System.out.println("价格异常：" + price);
				}	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web012_B2C:搜索页商品价格展示失败");
			throw new AssertionError();
		}
		
		checkPoint.equals(count, 0, "【fail】Web012_B2C:搜索页商品价格展示失败");
		checkPoint.result("【pass】Web012_B2C:搜索页商品价格展示成功");
	}
}
