package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web018_B2C_Chihy extends TestBase {

	@Test
	public void goodsDetails() {
		
		String text = null;
		try {
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getTexts("详情页_B2C", "商品详情").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web018_B2C:商品详情显示失败");
		}
		
		checkPoint.equals(text, "[商品品牌：测试, 商品名称：测试商品大米0.02, 净重：2, 保质期：360天, 产地：测试, 国产/进口：国产, 储藏方式：常温保存, 包装：其它]", "【fail】Web018_B2C:商品详情显示失败");
		checkPoint.result("【pass】Web018_B2C:商品详情显示成功");
	}
}
