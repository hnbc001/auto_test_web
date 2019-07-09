/**
 * @author Liuteng
 * 验证商品详情页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security05_B2C_Liuteng extends TestBase {

	@Test
	public void security05_B2C(){
		
		String text = null;
		try {
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security05_B2C:商品详情页打开失败");
		}
		checkPoint.equals(text, "http://product.gxyj.com/127314.html?mallId=00000000", "【fail】Security05_B2C:商品详情页打开失败");
		checkPoint.result("【pass】Security05_B2C:商品详情页打开成功");
	}
}