/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-按人气排序显示
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web108_B2C_Zhangpl extends TestBase{

	@Test
	public void top(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "人气排序");
			text = locator.getAttri("搜索页_B2C", "人气排序","class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web108_B2C:按人气排序显示异常");
		}
		
		checkPoint.equals(text,"btn_px btn_cur","【fail】Web108_B2C:按人气排序显示异常");
		checkPoint.result("【pass】Web108_B2C:按人气排序显示正常");
	}
}










