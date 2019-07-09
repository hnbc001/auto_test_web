/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-相关商品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web120_B2C_Zhangpl extends TestBase{

	@Test
	public void storeProducts(){

		String text=null;
		int num=0;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "店铺排序");
			num = locator.elementsCount("搜索页_B2C", "商品个数");
			text = locator.getText("搜索页_B2C", "相关商品");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web120_B2C:相关商品展示异常");
		}
		
		checkPoint.equals(text,num+"件相关商品","【fail】Web120_B2C:相关商品展示异常");
		checkPoint.result("【pass】Web120_B2C:相关商品展示正常");
	}
}










