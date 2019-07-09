package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web013_B2C_Chihy extends TestBase {

	@Test
	public void brand() {
		
		boolean flag = false;
		try {
			locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B0%B4%E6%9E%9C&prodPropPage=");
			flag = locator.elementIsExits("搜索页_B2C", "商品品牌");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web013_B2C:搜索页商品品牌展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web013_B2C:搜索页商品品牌展示失败");
		checkPoint.result("【pass】Web013_B2C:搜索页商品品牌展示成功");
	}
}
