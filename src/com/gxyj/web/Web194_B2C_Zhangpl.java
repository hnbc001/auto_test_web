/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-新建地址
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web194_B2C_Zhangpl extends TestBase {

	@Test
	public void noName() {
		
		String text = null;
		try{
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "新建地址");
			locator.selectByValue("我的商城页_B2C", "新增地区省", "119999");
			locator.sendKeys("结算页_B2C", "详细地址", "测试详细地址");
			locator.clickByXml("结算页_B2C", "保存地址");
			text=locator.getText("提示信息_B2C", "提示内容");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web194_B2C:结算页未填写收货人姓名提示失败");
		}
		
		checkPoint.equals(text, "请输入收货人姓名", "【fail】Web194_B2C:结算页未填写收货人姓名提示失败");
		checkPoint.result("【pass】Web194_B2C:结算页未填写收货人姓名提示成功");
	}
}
