/**
 * Author:ZhangPl
 * 
 * 检查点：支付页面立即支付按钮存在
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web046_B2C_Zhangpl extends TestBase{

	@Test
	public void buyNow(){
		
		boolean text = false;
		try {
			text = locator.elementIsExit("支付页面_B2C", "立即支付");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web046_B2C:支付页面立即支付按钮不存在");
		}
		
		checkPoint.equals(text,true, "【fail】Web046_B2C:支付页面立即支付按钮不存在");
		checkPoint.result("【pass】Web046_B2C:支付页面立即支付按钮存在");
	}
}










