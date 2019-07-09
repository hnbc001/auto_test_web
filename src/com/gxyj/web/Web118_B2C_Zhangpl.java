/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-店铺评分
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web118_B2C_Zhangpl extends TestBase{

	@Test
	public void storeScore(){

		String text=null;
		boolean flag=false;
		try {	
			//locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?searchType=&selectCatId=&mallId=00000000&query=%E6%B5%8B%E8%AF%95&prodPropPage=");
			locator.clickByXml("搜索页_B2C", "店铺排序");
			text = locator.getTexts("搜索页_B2C", "店铺评分").toString();
			flag=text.matches("\\[描述相符.*服务态度.*物流服务.*");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web118_B2C:店铺评分展示异常");
		}
		
		checkPoint.equals(flag,true,"【fail】Web118_B2C:店铺评分展示异常");
		checkPoint.result("【pass】Web118_B2C:店铺评分展示正常");
	}
}










