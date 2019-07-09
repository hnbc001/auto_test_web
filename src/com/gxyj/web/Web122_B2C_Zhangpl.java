/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-相关商品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web122_B2C_Zhangpl extends TestBase{

	@Test
	public void storeInPros(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "店铺排序");
			locator.clickByXml("搜索页_B2C", "相关商品");
			for(String winHandle : locator.getHandles()){  			          
				locator.switchToWindow(winHandle);
			}  	
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web122_B2C:相关商品跳转异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/shop/search.jhtml?shopId=010231&catId=&startPrice=&endPrice=&mallId=00000000","【fail】Web122_B2C:相关商品跳转异常");
		checkPoint.result("【pass】Web122_B2C:相关商品跳转正常");
	}
}










