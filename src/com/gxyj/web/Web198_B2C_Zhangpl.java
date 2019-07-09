/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-新建地址
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web198_B2C_Zhangpl extends TestBase {

	@Test
	public void createAdr() {
		
		boolean text = false;
		try{
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "新建地址");
			locator.selectByValue("我的商城页_B2C", "新增地区省", "119999");
			locator.sendKeys("结算页_B2C", "收货姓名","测试姓名");
			locator.sendKeys("结算页_B2C", "详细地址", "测试详细地址");
			locator.sendKeys("结算页_B2C", "收货手机", "17084517777");
			locator.clickByXml("结算页_B2C", "保存地址");
			text=locator.elementIsExit("结算页_B2C", "收货地址");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web198_B2C:结算页新建地址失败");
		}
		
		checkPoint.equals(text, true, "【fail】Web198_B2C:结算页新建地址失败");
		checkPoint.result("【pass】Web198_B2C:结算页新建地址成功");
	}
}
