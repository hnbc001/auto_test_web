/**
 * Author:ZhangPl
 * 
 * 检查点：结算页-新建地址
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web200_B2C_Zhangpl extends TestBase {

	@Test
	public void delAddress() {
		
		String text = null;
		try{
			locator.get("http://www.gxyj.com/security/shoppingcart/commit.jhtml?mallId=00000000");
			locator.clickByXml("结算页_B2C", "更多地址");
			locator.wait(3);
			int num=locator.getTexts("结算页_B2C", "待删地址").size();
			for(int i = 0;i<num;i++){
				locator.clickByXml("结算页_B2C", "待删地址");
				locator.clickByXml("结算页_B2C", "删除地址");
				locator.acceptAlert();
				locator.wait(3);
			}
			text=locator.getText("结算页_B2C", "收货地址");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web200_B2C:结算页删除新建地址失败");
		}
		
		checkPoint.equals(text, "北京北京市供销E家测试地址", "【fail】Web200_B2C:结算页删除新建地址失败");
		checkPoint.result("【pass】Web200_B2C:结算页删除新建地址成功");
	}
}
