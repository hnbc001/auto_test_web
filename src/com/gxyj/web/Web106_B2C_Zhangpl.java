/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-2级查询-分类方式
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web106_B2C_Zhangpl extends TestBase{

	@Test
	public void search2ndCAT(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B0%B4%E6%9E%9C&prodPropPage=");
			text = locator.clickAndGetText("搜索页_B2C", "奇异果","搜索页_B2C","分类方式").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web106_B2C:二级搜索查询分类内容异常");
		}
		
		checkPoint.equals(text,"[分类, 产地, 规格, 价格]","【fail】Web106_B2C:二级搜索查询分类内容异常");
		checkPoint.result("【pass】Web106_B2C:二级搜索查询分类内容正常");
	}
}










