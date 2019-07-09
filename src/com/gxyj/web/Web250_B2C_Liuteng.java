/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web250_B2C_Liuteng extends TestBase{

	@Test
	public void operationChange(){

		boolean flag = false;
		try {
			flag = locator.elementIsExit("我的商城页_B2C", "操作修改");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web250_B2C:我的商城页操作修改展示异常");
		}
		checkPoint.equals(flag, true, "【fail】Web250_B2C:我的商城页操作修改展示异常");
		checkPoint.result("【pass】Web250_B2C:我的商城页操作修改展示正常");
	}
}










