/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-一级查询-分类方式
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web105_B2C_Zhangpl extends TestBase{

	@Test
	public void search1stCAT(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B0%B4%E6%9E%9C&prodPropPage=");
			text=locator.getTexts("搜索页_B2C", "分类方式").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web105_B2C:一级搜索查询分类内容显示异常");
		}
		
		checkPoint.equals(text,"[分类, 价格]","【fail】Web105_B2C:一级搜索查询分类内容异常");
		checkPoint.result("【pass】Web105_B2C:一级搜索查询分类内容正常");
	}
}










