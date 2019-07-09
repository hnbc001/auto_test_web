/**
 * @author Liuteng
 * 验证搜索页打开功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Security04_B2C_Liuteng extends TestBase {

	@Test
	public void security04_B2C(){
		
		String text = null;
		try {
			locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&pageId=&query=%E6%B5%8B%E8%AF%95%E5%95%86%E5%93%81%E5%A4%A7%E7%B1%B3&prodPropPage=");
			locator.wait(1);
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Security04_B2C:搜索页打开失败");
		}
		checkPoint.equals(text, "http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&pageId=&query=%E6%B5%8B%E8%AF%95%E5%95%86%E5%93%81%E5%A4%A7%E7%B1%B3&prodPropPage=", "【fail】Security04_B2C:搜索页打开失败");
		checkPoint.result("【pass】Security04_B2C:搜索页打开成功");
	}
}