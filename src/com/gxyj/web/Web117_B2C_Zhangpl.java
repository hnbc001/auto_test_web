/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-店铺公司
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web117_B2C_Zhangpl extends TestBase{

	@Test
	public void storeCom(){

		String text=null;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "店铺排序");
			text = locator.getText("搜索页_B2C", "店铺公司");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web117_B2C:店铺公司展示异常");
		}
		
		checkPoint.equals(text,"北京爱风尚文化有限公司1","【fail】Web117_B2C:店铺公司展示异常");
		checkPoint.result("【pass】Web117_B2C:店铺公司展示正常");
	}
}










