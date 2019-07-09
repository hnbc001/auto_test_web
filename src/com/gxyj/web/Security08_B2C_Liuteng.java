/**
 * @author Liuteng
 * 验证我的商城页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security08_B2C_Liuteng extends TestBase {

	@Test
	public void security08_B2C(){
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security08_B2C:我的商城页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000", "【fail】Security08_B2C:我的商城页打开失败");
		checkPoint.result("【pass】Security08_B2C:我的商城页打开成功");
	}
}