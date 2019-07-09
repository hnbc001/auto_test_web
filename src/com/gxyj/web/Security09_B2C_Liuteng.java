/**
 * @author Liuteng
 * 验证我的订单页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security09_B2C_Liuteng extends TestBase {

	@Test
	public void security09_B2C(){
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/member/memberOrders.jhtml?menuType=2_1&mallId=00000000");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security09_B2C:我的订单页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/member/memberOrders.jhtml?menuType=2_1&mallId=00000000", "【fail】Security09_B2C:我的订单页打开失败");
		checkPoint.result("【pass】Security09_B2C:我的订单页打开成功");
	}
}