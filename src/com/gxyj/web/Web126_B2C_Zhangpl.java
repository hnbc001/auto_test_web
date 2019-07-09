/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页 - 修改运费地址，查看地址及价格
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web126_B2C_Zhangpl extends TestBase{

	@Test
	public void revFreight(){

		String text=null;
		String text2 = null;
		boolean flag = false;
		try {	
			locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			//locator.moveToElement(webDriver.findElement(By.id("defaultArea")));
			text2 = locator.getTexts("详情页_B2C", "运费信息").toString();
			locator.clickAndHold("详情页_B2C", "修改地址");
			//locator.clickByXml("详情页_B2C", "海南");	
			locator.clickByXml("详情页_B2C", "天津");
			//locator.clickByXml("详情页_B2C", "安定县");
			//locator.clickByXml("详情页_B2C", "定城镇");
			locator.wait(3);
			text = locator.getTexts("详情页_B2C", "运费信息").toString();
			System.out.println(text);
			if(!text.equals(text2))
				flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web126_B2C:商详页修改运费地址异常");
		}
		
		checkPoint.equals(flag, true, "【fail】Web126_B2C:商详页修改运费地址异常");
		checkPoint.result("【pass】Web126_B2C:商详页修改运费地址正常");
	}
}










