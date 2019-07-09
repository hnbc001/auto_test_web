/**
 * @author Liuteng
 * 验证订单详情页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security10_B2C_Liuteng extends TestBase {

	@Test
	public void security10_B2C(){
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/member/memberOrderDetail.jhtml?menuType=2_1&orderId=020181203IM0405688&mallId=00000000");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security10_B2C:订单详情页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/member/memberOrderDetail.jhtml?menuType=2_1&orderId=020181203IM0405688&mallId=00000000", "【fail】Security10_B2C:订单详情页打开失败");
		checkPoint.result("【pass】Security10_B2C:订单详情页打开成功");
	}
}