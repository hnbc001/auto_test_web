/**
 * @author Liuteng
 * 验证特产推荐页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security03_B2C_Liuteng extends TestBase {

	@Test
	public void security03_B2C(){
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/shop/index.jhtml?shopId=010101&mallId=00000000");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security03_B2C:特产推荐页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/shop/index.jhtml?shopId=010101&mallId=00000000", "【fail】Security03_B2C:特产推荐页打开失败");
		checkPoint.result("【pass】Security03_B2C:特产推荐页打开成功");
	}
}