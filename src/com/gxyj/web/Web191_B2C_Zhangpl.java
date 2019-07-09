/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-新建地址元素
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web191_B2C_Zhangpl extends TestBase {

	@Test
	public void newAddress() {
		
		String text = null;
		try{	
			text=locator.getTexts("结算页_B2C", "地址元素").toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web191_B2C:结算未新建地址元素展示失败");
		}
		
		checkPoint.equals(text, "[*收货人：, 地址别名：, *所在地区：, *详细地址：, 邮政编码：, *手机号：, 固定电话：]", "【fail】Web191_B2C:结算未新建地址元素展示失败");
		checkPoint.result("【pass】Web191_B2C:结算未新建地址元素展示成功");
	}
}
