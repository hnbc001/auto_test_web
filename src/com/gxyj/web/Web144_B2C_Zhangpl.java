/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-商品介绍
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web144_B2C_Zhangpl extends TestBase{

	@Test
	public void instructions(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.getTexts("详情页_B2C", "商品介绍").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web144_B2C:商详页商品介绍展示异常");
		}
		
		checkPoint.equals(text,"[商品品牌：测试\n商品名称：测试商品大米0.02\n净重：2\n保质期：360天\n产地：测试\n国产/进口：国产\n储藏方式：常温保存\n包装：其它]","【fail】Web144_B2C:商详页商品介绍展示异常");
		checkPoint.result("【pass】Web144_B2C:商详页商品介绍展示正常");
	}
}










