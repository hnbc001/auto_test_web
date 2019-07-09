/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-价格降序
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web111_B2C_Zhangpl extends TestBase{

	@Test
	public void descOrder(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "价格排序");
			text = locator.getAttri("搜索页_B2C", "价格展示","class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web111_B2C:按价格降序展示异常");
		}
		
		checkPoint.equals(text,"item-icon next-p","【fail】Web111_B2C:按价格降序展示异常");
		checkPoint.result("【pass】Web111_B2C:按价格降序展示正常");
	}
}










