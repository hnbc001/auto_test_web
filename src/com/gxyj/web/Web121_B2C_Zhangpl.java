/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-店铺入口
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web121_B2C_Zhangpl extends TestBase{

	@Test
	public void storeName(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "店铺排序");
			locator.clickByXml("搜索页_B2C", "店铺入口");
			text = locator.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web121_B2C:店铺入口跳转异常");
		}
		
		checkPoint.equals(text,"http://www.gxyj.com/shop/index.jhtml?shopId=010231&mallId=00000000","【fail】Web121_B2C:店铺入口跳转异常");
		checkPoint.result("【pass】Web121_B2C:店铺入口跳转正常");
	}
}










