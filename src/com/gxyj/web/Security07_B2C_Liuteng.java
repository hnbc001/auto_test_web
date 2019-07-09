/**
 * @author Liuteng
 * 验证购物车页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security07_B2C_Liuteng extends TestBase {

	@Test
	public void security07_B2C(){
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security07_B2C:购物车页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/newshoppingcart/query.jhtml?mallId=00000000", "【fail】Security07_B2C:购物车页打开失败");
		checkPoint.result("【pass】Security07_B2C:购物车页打开成功");
	}
}