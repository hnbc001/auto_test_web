/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-按店铺查看
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web114_B2C_Zhangpl extends TestBase{

	@Test
	public void storeShow(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "店铺排序");
			text = locator.getAttri("搜索页_B2C", "店铺展示","class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web114_B2C:按店铺查看展示异常");
		}
		
		checkPoint.equals(text,"item-icon Store-i cur-2","【fail】Web114_B2C:按店铺查看展示异常");
		checkPoint.result("【pass】Web114_B2C:按店铺查看展示正常");
	}
}










