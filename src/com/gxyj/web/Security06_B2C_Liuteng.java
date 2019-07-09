/**
 * @author Liuteng
 * 验证结算页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security06_B2C_Liuteng extends TestBase {

	@Test
	public void security06_B2C(){
		
		String text = null;
		try {
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			locator.wait(1);
			locator.clickByXml("详情页_B2C", "规格");
			locator.wait(1);
			locator.clickByXml("详情页_B2C", "立即购买");
			locator.wait(1);
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security06_B2C:结算页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000", "【fail】Security06_B2C:结算页打开失败");
		checkPoint.result("【pass】Security06_B2C:结算页打开成功");
	}
}