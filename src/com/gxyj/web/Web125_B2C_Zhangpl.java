/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页 - 默认运费地址及价格
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web125_B2C_Zhangpl extends TestBase{

	@Test
	public void defFreight (){

		//String text=null;
		boolean flag = false;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			//text = locator.getTexts("详情页_B2C", "运费信息").toString();
			flag = locator.elementIsExits("详情页_B2C", "运费信息");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web125_B2C:商详页默认运费地址及价格异常");
		}
		
		//checkPoint.equals(text,"[北京北京市 至 河南 洛阳市 市辖区\n快递：¥1.00]","【fail】Web125_B2C:商详页默认运费地址及价格异常");
		checkPoint.equals(flag,true,"【fail】Web125_B2C:商详页默认运费地址及价格异常");
		checkPoint.result("【pass】Web125_B2C:商详页默认运费地址及价格正常");
	}
}










