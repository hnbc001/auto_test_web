/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-价格查询
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web107_B2C_Zhangpl extends TestBase{

	@Test
	public void searchPrice(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B0%B4%E6%9E%9C&prodPropPage=");
			text = locator.clickAndGetText("搜索页_B2C", "选择价格", "搜索页_B2C", "全部结果").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web107_B2C:按价格搜索查询异常");
		}
		
		checkPoint.equals(text,"[价格：0-49]","【fail】Web107_B2C:按价格搜索查询异常");
		checkPoint.result("【pass】Web107_B2C:按价格搜索查询正常");
	}
}










