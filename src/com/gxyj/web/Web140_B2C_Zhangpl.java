/**
 * Author:ZhangPl
 * 
 * 检查点：商品详情页-商品分类展开
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web140_B2C_Zhangpl extends TestBase{

	@Test
	public void category(){

		String text=null;
		try {	
			//locator.get("http://product.gxyj.com/127314.html?mallId=00000000");
			text = locator.clickAndGetText("详情页_B2C", "一级分类", "详情页_B2C", "二级分类").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web140_B2C:商详页商品分类展开异常");
		}
		
		checkPoint.equals(text,"[大甜橙]","【fail】Web140_B2C:商详页商品分类展开异常");
		checkPoint.result("【pass】Web140_B2C:商详页商品分类展开正常");
	}
}










