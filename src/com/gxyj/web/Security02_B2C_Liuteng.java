/**
 * @author Liuteng
 * 验证帮助页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security02_B2C_Liuteng extends TestBase {

	@Test
	public void security02_B2C(){
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/help/getHelpInfo.jhtml");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security02_B2C:帮助页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/help/getHelpInfo.jhtml", "【fail】Security02_B2C:帮助页打开失败");
		checkPoint.result("【pass】Security02_B2C:帮助页打开成功");
	}
}