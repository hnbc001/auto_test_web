/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-对比展示
 */

package com.gxyj.web;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web124_B2C_Zhangpl extends TestBase{

	@Test
	public void compare(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.moveToElement(webDriver.findElement(By.xpath("//div[@class='productBox'][1]")));
			locator.clickAndHold("搜索页_B2C", "商品价格");
			text = locator.getTexts("搜索页_B2C", "对比栏").subList(0, 3).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web124_B2C:取消特定地址商品展示异常");
		}
		
		checkPoint.equals(text,"[收藏, 对比, 加入购物车]","【fail】Web124_B2C:取消特定地址商品展示异常");
		checkPoint.result("【pass】Web124_B2C:取消特定地址商品展示正常");
	}
}










